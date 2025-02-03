package SpringDayCount.demo.feign;

import SpringDayCount.demo.dto.DTO;
import SpringDayCount.demo.dto.MonthAndNameDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MonthAndYearFallBack implements FiegnCallToMonthAndYear{
    @Override
    public List<MonthAndNameDTO> getAll() {
        return List.of();
    }

    public List<DTO> getCall() {
        return List.of();
    }
}
