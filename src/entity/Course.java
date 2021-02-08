
package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "Course")
public class Course {

    @Id
    private String cID;
    private String name;
    private String duration;

    @OneToMany(mappedBy = "course", cascade = {CascadeType.PERSIST})
    private List<Register> registers = new ArrayList<>();

    public Course() {
    }

    public Course(String cID, String name, String duration) {
        this.cID = cID;
        this.name = name;
        this.duration = duration;
    }

    public Course(String name, String duration, List<Register> registers) {
        this.name = name;
        this.duration = duration;
        this.registers = registers;
    }


    public String getcID() {
        return cID;
    }


    public void setcID(String cID) {
        this.cID = cID;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDuration() {
        return duration;
    }


    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Register> getRegisters() {
        return registers;
    }

    public Course(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public void setRegisters(List<Register> registers) {

        this.registers = registers;
    }

    @Override
    public String toString() {
        return "Course{" + "cID=" + cID + ", name=" + name + ", duration=" + duration + '}';
    }
    
    
}
