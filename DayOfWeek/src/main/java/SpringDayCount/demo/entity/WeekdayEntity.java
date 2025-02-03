package SpringDayCount.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="weekday")
public class WeekdayEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private int id;

    @Column(name = "day")
    private String day;

    @Column(name = "day_abbrevation")
    private String dayAbbrevation;

    public WeekdayEntity(int id, String day, String day_Abbrevation) {
        this.id = id;
        this.day = day;
        this.dayAbbrevation = day_Abbrevation;
    }

    public WeekdayEntity(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDayAbbrevation() {
        return dayAbbrevation;
    }

    public void setDayAbbrevation(String dayAbbrevation) {
        this.dayAbbrevation = dayAbbrevation;
    }
}
