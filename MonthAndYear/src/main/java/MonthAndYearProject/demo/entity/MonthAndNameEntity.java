package MonthAndYearProject.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "months_of_year")
public class MonthAndNameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="month_id")
    private Long monthId;

    @Column(name="month_name")
    private String monthName;

    @Column(name="month_abbrevation")
    private String monthAbbrevation;

    @Column(name="month_number")
    private Long monthNumber;

    public MonthAndNameEntity(Long monthId, String monthName, String monthAbbrevation, Long monthNumber) {
        this.monthId = monthId;
        this.monthName = monthName;
        this.monthAbbrevation = monthAbbrevation;
        this.monthNumber = monthNumber;
    }

    public MonthAndNameEntity(){

    }

    public Long getMonthId() {
        return monthId;
    }

    public void setMonthId(Long monthId) {
        this.monthId = monthId;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getMonthAbbrevation() {
        return monthAbbrevation;
    }

    public void setMonthAbbrevation(String monthAbbrevation) {
        this.monthAbbrevation = monthAbbrevation;
    }

    public Long getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(Long monthNumber) {
        this.monthNumber = monthNumber;
    }
}
