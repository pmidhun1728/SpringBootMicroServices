package MonthAndYearProject.demo.fiegn;

import MonthAndYearProject.demo.dto.DTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MonthAndYearFallBack implements FiegnCallToDemo{
    @Override
    public List<DTO> getCall() {
        return List.of();
    }
}
