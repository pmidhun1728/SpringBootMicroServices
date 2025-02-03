package MonthAndYearProject.demo.controller;

import MonthAndYearProject.demo.dto.DTO;
import MonthAndYearProject.demo.dto.MonthAndNameDTO;
import MonthAndYearProject.demo.service.MonthAndNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonthController {

    @Autowired
    MonthAndNameService monthAndNameService;

    @PostMapping("/addmonthandday")
    public MonthAndNameDTO postCall(@RequestBody MonthAndNameDTO monthAndNameDTO){
        return monthAndNameService.savePost(monthAndNameDTO);
    }

    @GetMapping("/getmonthname")
    public List<MonthAndNameDTO> getCall(){
        return monthAndNameService.getAll();
    }

    @PutMapping("/putaddmonthandday")
    public MonthAndNameDTO putCall(@RequestBody MonthAndNameDTO monthAndNameDTO){
        return monthAndNameService.savePut(monthAndNameDTO);
    }

    @DeleteMapping("/deletemonthandday/{Id}")
    public MonthAndNameDTO deleteCall(@PathVariable Long Id){
        return monthAndNameService.deleteCall(Id);
    }

    @GetMapping("/getdemo")
    public List<DTO> getcal(){
        List<DTO> dtoList = monthAndNameService.getCall();
        return dtoList;
    }
}
