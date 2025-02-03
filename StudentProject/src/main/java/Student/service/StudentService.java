package Student.service;

import Student.dto.MonthAndNameDTO;
import Student.dto.StudentDTO;
import Student.entity.StudentEntity;
import Student.repository.StudentRepository;
import Student.fiegn.CallFeignToMonthAndYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentDTO studentDTO;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    CallFeignToMonthAndYear callFeignToMonthAndYear;

    public StudentDTO dto2Entity(StudentEntity studentEntity){
        return studentMapper.toDTO(studentEntity);
    }
    public StudentEntity entity2DTO(StudentDTO studentDTO){
        return studentMapper.toEntity(studentDTO);
    }

    public List<MonthAndNameDTO> getMonthAndYear(){
       List<MonthAndNameDTO> listMonthAndYearDTO=  callFeignToMonthAndYear.getcal();
        return listMonthAndYearDTO;
    }

    public StudentDTO savePost(StudentDTO studentDTO){
        StudentEntity entity = studentMapper.toEntity(studentDTO);
       return studentMapper.toDTO(studentRepository.save(entity));
    }

    public StudentDTO savePut(StudentDTO studentDTO){

       Optional<StudentEntity> optionalEntity = studentRepository.findById(studentDTO.getId());
       if(optionalEntity.isPresent()){
           optionalEntity.get().setId(studentDTO.getId());
           optionalEntity.get().setLastName(studentDTO.getLastName());
           studentRepository.save(optionalEntity.get());
       }else{
           System.out.println("There is no matching record to update PUT");
       }
        return studentDTO;
    }

    public List<StudentDTO> getAll(){
       List<StudentEntity> stdEntity = studentRepository.findAll();
       List<StudentDTO> dto = new ArrayList<>();

       for(StudentEntity std : stdEntity){

           dto.add(studentMapper.toDTO(std));
       }
        return dto;
    }

    public StudentDTO deleteId(Long id){
       Optional<StudentEntity> optionalEntity = studentRepository.findById(id);
       if(optionalEntity.isPresent()){
          studentRepository.delete(optionalEntity.get());
       }
        return studentDTO;
    }
}
