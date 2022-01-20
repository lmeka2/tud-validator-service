package ie.tud.msc.tudvalidatorservice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TudEmployee {

    private String name;

    private String id;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
