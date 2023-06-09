package JavaUdemyTrainning.Enums.Enum_WorkerSalary;

import java.util.Date;

public class HourContract {
    private Date _date;
    private Double _valuePerHour;
    private Integer _hours;

    public HourContract(Date _date, Double _valuePerHour, Integer _hours) {
        this._date = _date;
        this._valuePerHour = _valuePerHour;
        this._hours = _hours;
    }

    public Date get_date() {
        return _date;
    }

    public void set_date(Date _date) {
        this._date = _date;
    }

    public Double get_valuePerHour() {
        return _valuePerHour;
    }

    public void set_valuePerHour(Double _valuePerHour) {
        this._valuePerHour = _valuePerHour;
    }

    public Integer get_hours() {
        return _hours;
    }

    public void set_hours(Integer _hours) {
        this._hours = _hours;
    }

    public Double totalValue(){
        return _hours * _valuePerHour;
    }
}
