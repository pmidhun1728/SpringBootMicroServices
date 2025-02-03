package Student.service;

import Student.dto.StudentDTO;
import Student.entity.StudentEntity;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentDTO toDTO(StudentEntity entity) {
        if (entity == null) {
            return null;
        }
        return new StudentDTO(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getMarks()
        );
    }

    public StudentEntity toEntity(StudentDTO dto) {
        if (dto == null) {
            return null;
        }
        return new StudentEntity(
                dto.getId(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getMarks()
        );
    }
}
