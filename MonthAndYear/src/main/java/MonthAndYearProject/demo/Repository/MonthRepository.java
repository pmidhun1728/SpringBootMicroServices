package MonthAndYearProject.demo.Repository;

import MonthAndYearProject.demo.entity.MonthAndNameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository<MonthAndNameEntity, Long> {

}
