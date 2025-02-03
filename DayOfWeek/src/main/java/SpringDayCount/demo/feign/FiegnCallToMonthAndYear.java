package SpringDayCount.demo.feign;

import SpringDayCount.demo.dto.DTO;
import SpringDayCount.demo.dto.MonthAndNameDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Component
@FeignClient(name="monthandyear", fallback = MonthAndYearFallBack.class)
public interface FiegnCallToMonthAndYear {

    @GetMapping("/getmonthname")
    List<MonthAndNameDTO> getAll();

}
