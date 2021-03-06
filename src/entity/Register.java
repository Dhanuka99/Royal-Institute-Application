
package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
public class Register implements SuperEntity {
    @Id
    private String regNo;
    private String regDate;
    private double regFee;
    /*many registration have one student*/
    @ManyToOne

    private Student student;
    @ManyToOne
    private Course course;

    public Register() {
    }

    public Register(String regNo, String regDate, double regFee, Student student, Course course) {
        this.regNo = regNo;
        this.regDate = regDate;
        this.regFee = regFee;
        this.student = student;
        this.course = course;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Register{" +
                "regNo=" + regNo +
                ", regDate='" + regDate + '\'' +
                ", regFee=" + regFee +
                ", student=" + student +
                ", course=" + course +
                '}';
    }
}
