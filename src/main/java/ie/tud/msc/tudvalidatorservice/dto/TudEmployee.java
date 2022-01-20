package ie.tud.msc.tudvalidatorservice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TudEmployee {
    public String name;

    public String id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
