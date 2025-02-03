package MonthAndYearProject.demo.service;

import MonthAndYearProject.demo.dto.MonthAndNameDTO;
import MonthAndYearProject.demo.entity.MonthAndNameEntity;
import org.springframework.stereotype.Component;

@Component
public class MonthMapper {

    public MonthAndNameEntity toEntity(MonthAndNameDTO dto) {
        MonthAndNameEntity entity = new MonthAndNameEntity();
        entity.setMonthId(dto.getMonthId());
        entity.setMonthName(dto.getMonthName());
        entity.setMonthAbbrevation(dto.getMonthAbbrevation());
        entity.setMonthNumber(dto.getMonthNumber());
        return entity;
    }

    public MonthAndNameDTO toDTO(MonthAndNameEntity entity) {
        MonthAndNameDTO dto = new MonthAndNameDTO();
        dto.setMonthId(entity.getMonthId());
        dto.setMonthName(entity.getMonthName());
        dto.setMonthAbbrevation(entity.getMonthAbbrevation());
        dto.setMonthNumber(entity.getMonthNumber());
        return dto;
    }
}