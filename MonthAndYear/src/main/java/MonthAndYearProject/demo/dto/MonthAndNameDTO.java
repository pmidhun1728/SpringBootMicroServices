package MonthAndYearProject.demo.dto;

import org.springframework.stereotype.Component;

@Component
public class MonthAndNameDTO {

    private Long monthId;
    private String monthName;
    private String monthAbbrevation;
    private Long monthNumber;


    public MonthAndNameDTO(Long monthId, String monthName, String monthAbbrevation, Long monthNumber) {
        this.monthId = monthId;
        this.monthName = monthName;
        this.monthAbbrevation = monthAbbrevation;
        this.monthNumber = monthNumber;
    }

    public MonthAndNameDTO(){


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
