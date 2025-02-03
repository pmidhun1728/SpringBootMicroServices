package Student.fiegn;

import Student.dto.MonthAndNameDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="monthandyear")
@Component
public interface CallFeignToMonthAndYear {

    @GetMapping("/getmonthname")
    List<MonthAndNameDTO> getcal();
}
