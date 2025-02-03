package SpringDayCount.demo.service;

import SpringDayCount.demo.dto.DTO;
import SpringDayCount.demo.entity.WeekdayEntity;
import org.springframework.stereotype.Component;

@Component
public class WeekdayMapper {

    public DTO toDTO(WeekdayEntity entity) {
        if (entity == null) {
            return null;
        }
        return new DTO(
                entity.getId(),
                entity.getDay(),
                entity.getDayAbbrevation());
    }

    public WeekdayEntity toEntity(DTO dto) {
        if (dto == null) {
            return null;
        }
        return new WeekdayEntity(
                dto.getId(),
                dto.getDay(),
                dto.getDayAbbrevation());
    }
}
