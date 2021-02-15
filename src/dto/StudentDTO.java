
package dto;


import entity.Register;

import java.util.List;

public class StudentDTO {
    private String stID;
    private String name;
    private String address;
    private String contact;
    private String dob;
    private String gender;
    private List<Register> registers;

    public StudentDTO() {
    }

    public StudentDTO(String stID, String name, String address, String contact, String dob, String gender, List<Register> registers) {
        this.stID = stID;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
        this.registers = registers;
    }

    public StudentDTO(String stID, String name, String address, String contact, String dob, String gender) {
        this.stID = stID;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.dob = dob;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public List<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register> registers) {
        this.registers = registers;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "stID='" + stID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", registers=" + registers +
                '}';
    }
}
