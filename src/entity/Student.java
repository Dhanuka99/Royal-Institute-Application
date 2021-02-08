
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

    /**
     * @return the stID
     */
    public String getStID() {
        return stID;
    }

    /**
     * @param stID the stID to set
     */
    public void setStID(String stID) {
        this.stID = stID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }


    public List<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register> registers) {
        this.registers = registers;
    }



    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "stID=" + getStID() + ", name=" + getName() + ", address=" + getAddress() + '}';
    }
    
}
