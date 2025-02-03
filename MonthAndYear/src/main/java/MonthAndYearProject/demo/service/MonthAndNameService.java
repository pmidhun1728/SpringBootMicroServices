package MonthAndYearProject.demo.service;

import MonthAndYearProject.demo.Repository.MonthRepository;
import MonthAndYearProject.demo.dto.DTO;
import MonthAndYearProject.demo.dto.MonthAndNameDTO;
import MonthAndYearProject.demo.entity.MonthAndNameEntity;
import MonthAndYearProject.demo.fiegn.FiegnCallToDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MonthAndNameService {


    @Autowired
    MonthAndNameDTO monthAndNameDTO;

    @Autowired
    MonthMapper monthMapper;

    @Autowired
    MonthRepository monthRepository;

    @Autowired
    FiegnCallToDemo fiegnCallToDemo;

    public List<DTO> getCall(){
        List<DTO> listDTO = fiegnCallToDemo.getCall();
        if(null!=listDTO){
            return listDTO;
        }

        return null;
    }

    public MonthAndNameEntity toEntity(MonthAndNameDTO monthAndNameDTO){
        return monthMapper.toEntity(monthAndNameDTO);
    }

    public MonthAndNameDTO toDTO(MonthAndNameEntity monthAndNameEntity){
        return monthMapper.toDTO(monthAndNameEntity);
    }

    public MonthAndNameDTO savePost(MonthAndNameDTO monthAndNameDTO){
        MonthAndNameEntity monthEntity =monthMapper.toEntity(monthAndNameDTO);
       return toDTO(monthRepository.save(monthEntity));
    }

    public List<MonthAndNameDTO> getAll(){
       List<MonthAndNameEntity> monthEntity = monthRepository.findAll();
       List<MonthAndNameDTO> monthDTO= new ArrayList<>();
       for(MonthAndNameEntity month: monthEntity){

           monthDTO.add(toDTO(month));
       }
        return monthDTO;
    }


    public MonthAndNameDTO savePut(MonthAndNameDTO monthAndNameDTO){

        Optional<MonthAndNameEntity> optionalEntity =monthRepository.findById(monthAndNameDTO.getMonthId());
        if(optionalEntity.isPresent()){
            optionalEntity.get().setMonthId(monthAndNameDTO.getMonthId());
            optionalEntity.get().setMonthName(monthAndNameDTO.getMonthName());
            optionalEntity.get().setMonthAbbrevation(monthAndNameDTO.getMonthAbbrevation());
            optionalEntity.get().setMonthNumber(monthAndNameDTO.getMonthNumber());
            toDTO(monthRepository.save(optionalEntity.get()));
        }else{

            System.out.println("There is no Matching id to update put request");
        }

        return monthAndNameDTO;
    }


    public MonthAndNameDTO deleteCall(Long Id){

        Optional<MonthAndNameEntity> optionalEntity =monthRepository.findById(Id);
        if(optionalEntity.isPresent()){
           monthRepository.delete(optionalEntity.get());
        }else{

            System.out.println("There is no Matching id to delete the request");
        }

        return monthAndNameDTO;
    }

}
