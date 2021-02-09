
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
public class Student {

    @Id
    private String studentID;
    private String studentName;
    private String studentAddress;
    private String studentContact;
    private String studentDOB;
    private String studentGender;
    @OneToOne
    private Register register;
    @ManyToMany
    private List<Course> courses;


    public Student() {
    }

    public Student(String studentID, String studentName, String studentAddress, String studentContact, String studentDOB, String studentGender, Register register, List<Course> courses) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentContact = studentContact;
        this.studentDOB = studentDOB;
        this.studentGender = studentGender;
        this.register = register;
        this.courses = courses;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentContact='" + studentContact + '\'' +
                ", studentDOB='" + studentDOB + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", register=" + register +
                ", courses=" + courses +
                '}';
    }
}
