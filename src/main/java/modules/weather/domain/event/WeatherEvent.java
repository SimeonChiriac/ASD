package modules.weather.domain.event;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class WeatherEvent {

    @Id
    private int id;
    private Date dateTime;
    private Date createdAt;
    private String type;

    @OneToMany
    @JoinColumn
    private List<PictureData> pictureDataList;

    @OneToOne
    @JoinColumn
    private EventAttribute eventAttribute;

    public WeatherEvent() {
    }

    public WeatherEvent(int id, Date dateTime, Date createdAt, String type){
        this.id= id;
        this.dateTime = dateTime;
        this.createdAt = createdAt;
        this.type = type;
    }


    public EventAttribute getEventAttributes() {
        return eventAttribute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<PictureData> getPictureDataList() {
        return pictureDataList;
    }

    public void setPictureDataList(List<PictureData> pictureDataList) {
        this.pictureDataList = pictureDataList;
    }

    public EventAttribute getEventAttribute() {
        return eventAttribute;
    }

    public void setEventAttribute(EventAttribute eventAttribute) {
        this.eventAttribute = eventAttribute;
    }
}
