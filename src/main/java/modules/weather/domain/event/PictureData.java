package modules.weather.domain.event;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PictureData {

    @Id
    private int id;
    private String pictureBase64;
    private String description;

    public PictureData(int id, String pictureBase64,  String description){
        this.id= id;
        this.pictureBase64= pictureBase64;
        this.description = description;
    }


    public PictureData() {

    }
}
