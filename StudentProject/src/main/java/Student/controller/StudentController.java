package Student.controller;

import Student.dto.MonthAndNameDTO;
import Student.dto.StudentDTO;
import Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(path="/addstudent")
    public StudentDTO postCall(@RequestBody StudentDTO studentDTO){
        return studentService.savePost(studentDTO);
    }

    @GetMapping(path="/getstudent")
    public List<StudentDTO> getCall(){
        return studentService.getAll();
    }

    @GetMapping("/getMonthandDatestudent")
    public List<MonthAndNameDTO> getMonthandYear(){
        return studentService.getMonthAndYear();
    }

    @PutMapping(path="/addput")
    public StudentDTO putCall(@RequestBody StudentDTO studentDTO){
       return studentService.savePut(studentDTO);
    }

    @DeleteMapping(path="/delete/{id}")
    public StudentDTO deleteCall(@PathVariable Long id){
        return studentService.deleteId(id);
    }
}
