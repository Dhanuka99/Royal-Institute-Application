
package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
public class Register {
    @Id
    private int regNo;
    private String regDate;
    private double regFee;
    @ManyToOne
    private Student student;
    @ManyToMany(mappedBy = "Register")
    private List<Course> courses;

    public Register() {
    }

    public Register(int regNo, String regDate, double regFee, List<Course> courses) {
        this.regNo = regNo;
        this.regDate = regDate;
        this.regFee = regFee;
        this.courses = courses;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Register{" +
                "regNo=" + regNo +
                ", regDate='" + regDate + '\'' +
                ", regFee=" + regFee +
                ", courses=" + courses +
                '}';
    }
}
