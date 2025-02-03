package SpringDayCount.demo.service;


import SpringDayCount.demo.dto.DTO;
import SpringDayCount.demo.dto.MonthAndNameDTO;
import SpringDayCount.demo.entity.WeekdayEntity;
import SpringDayCount.demo.feign.FiegnCallToMonthAndYear;
import SpringDayCount.demo.repository.WeekdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DayService {

    @Autowired
    WeekdayRepository weekdayRepository;

    @Autowired
    WeekdayMapper weekdayMapper;

    @Autowired
    FiegnCallToMonthAndYear fiegnCallToMonthAndYear;


    public List<MonthAndNameDTO> getMonthAndYear(){
        List<MonthAndNameDTO> monthAndNameList = fiegnCallToMonthAndYear.getAll();
        if(null!=monthAndNameList){
            return monthAndNameList;
        }
        return new ArrayList<>();
    }


    public DTO entity2Dto(WeekdayEntity weekdayEntity){
       return weekdayMapper.toDTO(weekdayEntity);
    }

    public WeekdayEntity dto2Entity(DTO dto){
        return weekdayMapper.toEntity(dto);
    }

    public DTO savePost(DTO dto){
       WeekdayEntity weekdayentity = weekdayMapper.toEntity(dto);
        return entity2Dto(weekdayRepository.save(weekdayentity));
    }

    public List<DTO> getAll(){
        List<WeekdayEntity> entity =weekdayRepository.findAll();
        List<DTO> listDTO= new ArrayList<>();
        for(WeekdayEntity returnEntity: entity){
            listDTO.add(weekdayMapper.toDTO(returnEntity));
        }

        return listDTO;
    }

    public DTO getById(Integer id){
       Optional<WeekdayEntity> entity =weekdayRepository.findById(id);
        if (null!= entity) {
            return weekdayMapper.toDTO(entity.get());
        }
        return null;
    }

    public DTO savePut(DTO dto){
       Optional<WeekdayEntity> optionalEntity = weekdayRepository.findById(dto.getId());
       if(optionalEntity.isPresent()){
           optionalEntity.get().setDay(dto.getDay());
          weekdayRepository.save(optionalEntity.get());
       }else{
           System.out.println("There is no mathing record to update the put");
       }
        return dto;
    }


    public DTO deleteId(Integer id){
      Optional<WeekdayEntity> deleteEntity =  weekdayRepository.findById(id);

       if(deleteEntity.isPresent()){
           weekdayRepository.delete(deleteEntity.get());
       }else{
           System.out.println("There is no record for deletion");
       }

        return weekdayMapper.toDTO(deleteEntity.get());
    }
}