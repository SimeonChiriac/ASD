package modules.weather.domain.event;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EventAttribute {

    @Id
    private int id;
    private String temperatureScaleType;
    private double value;

    public EventAttribute() {
    }

    public EventAttribute(int id, String temperatureScaleType, double value){
        this.id = id;
        this.temperatureScaleType = temperatureScaleType;
        this.value = value;
    }

    public double convertTemperature(String TemperatureScaleType, double fahrenheit){
        if(TemperatureScaleType.equals("fahrenheit")){
            return (fahrenheit-32)*5/9;
        }
        else throw new Error("temperature type not supported");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTemperatureScaleType() {
        return temperatureScaleType;
    }

    public void setTemperatureScaleType(String temperatureScaleType) {
        this.temperatureScaleType = temperatureScaleType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
