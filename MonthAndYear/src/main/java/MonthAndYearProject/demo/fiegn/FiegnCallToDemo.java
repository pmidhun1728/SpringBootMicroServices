package MonthAndYearProject.demo.fiegn;

import MonthAndYearProject.demo.dto.DTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(name="weekdaycount", url = "http://localhost:1729", fallback = MonthAndYearFallBack.class)
public interface FiegnCallToDemo {

    @GetMapping("/getday")
    List<DTO> getCall();
}

