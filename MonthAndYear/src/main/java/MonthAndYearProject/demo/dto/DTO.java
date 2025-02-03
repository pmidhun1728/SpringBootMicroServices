package MonthAndYearProject.demo.dto;

public class DTO {

    private int id;
    private String day;
    private String dayAbbrevation;

    public DTO(int id, String day, String day_Abbrevation) {
        this.id = id;
        this.day = day;
        this.dayAbbrevation = day_Abbrevation;
    }

    public DTO(){

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
