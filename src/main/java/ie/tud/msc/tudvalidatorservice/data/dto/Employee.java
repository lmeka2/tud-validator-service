package ie.tud.msc.tudvalidatorservice.data.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Employee")
@Getter
@Setter
@Data
public class Employee implements Serializable {
    @Id
    @Column(name ="employeeid")
    private long employeeId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private Date dateofbirth;

    @Column
    private String address;


}
