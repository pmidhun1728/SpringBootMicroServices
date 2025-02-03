package SpringDayCount.demo.repository;

import SpringDayCount.demo.entity.WeekdayEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeekdayRepository extends JpaRepository<WeekdayEntity, Integer> {

}
