
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
public class Student {

    @Id
    private String stID;
    private String name;
    private String address;

    @OneToMany(mappedBy = "student")
    private List<Register> registers = new ArrayList<>();

    public Student() {
    }

    public Student(String stID, String name, String address) {
        this.setStID(stID);
        this.setName(name);
        this.setAddress(address);
    }

    public Student(String name, String address) {
        this.setName(name);
        this.setAddress(address);
    }

    public Student(String stID, String name, String address, List<Register> registers) {
        this.stID = stID;
        this.name = name;
        this.address = address;
        this.registers = registers;
    }


    public String getStID() {
        return stID;
    }


    public void setStID(String stID) {
        this.stID = stID;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public List<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register> registers) {
        this.registers = registers;
    }




    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "stID=" + getStID() + ", name=" + getName() + ", address=" + getAddress() + '}';
    }
    
}
