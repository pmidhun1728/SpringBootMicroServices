package SpringDayCount.demo.controller;

import SpringDayCount.demo.dto.DTO;
import SpringDayCount.demo.dto.MonthAndNameDTO;
import SpringDayCount.demo.service.DayService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DayController {

    @Autowired
    DayService dayService;

    @PostMapping(path= "/addday")
    @CircuitBreaker(name = "WeekDayCircuitBreaker", fallbackMethod = "addDayFallBack")
    public DTO savePost(@RequestBody DTO dto){
        return dayService.savePost(dto);
    }

    @GetMapping(path = "/getday")
    @CircuitBreaker(name = "WeekDayCircuitBreaker", fallbackMethod = "WeekDayFallBack")
    public List<DTO> getCall() {
        return dayService.getAll();
    }

    @GetMapping("/getmonthandyear")
    @CircuitBreaker(name = "WeekDayCircuitBreaker", fallbackMethod = "MonthAndYearFallBack")
    public List<MonthAndNameDTO> getCal() {
        return dayService.getMonthAndYear();
    }
    
    @GetMapping(path = "/getday/{id}")
    public DTO getCall(@PathVariable Integer id) {
        return dayService.getById(id);
    }

    @PutMapping(path = "/putday")
    public DTO getCall(@RequestBody DTO dto) {
        return dayService.savePut(dto);
    }

    @DeleteMapping(path = "/deleteday/{id}")
    public DTO deleteCal(@PathVariable Integer id) {
        return dayService.deleteId(id);
    }

    public List<MonthAndNameDTO> MonthAndYearFallBack() {
        System.out.println("This is a Fallback method");
        return List.of();
    }

    public List<DTO> WeekDayFallBack() {
        System.out.println("This is a Fallback method for WeekDay: " );
        return List.of();
    }

    public DTO addDayFallBack(@RequestBody DTO dto){
        return null;
    }
}
