
package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;



@Entity
public class Register {

    @EmbeddedId
    private Register_PK register_PK;

    @Temporal(TemporalType.DATE)
    private Date regDate;

    private BigDecimal fee;

    @ManyToOne
    @JoinColumn(name = "courseid",referencedColumnName ="cID",insertable = false,updatable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "studentid", referencedColumnName = "stID", insertable = false, updatable = false)
    private Student student;


    public Register() {
    }

    public Register(Date regDate, BigDecimal fee, Course course, Student student) {
        this.regDate = regDate;
        this.fee = fee;
        this.course = course;
        this.student = student;
    }


    public Register(Register_PK register_PK, Date regDate, BigDecimal fee, Course course, Student student) {
        this.register_PK = register_PK;
        this.regDate = regDate;
        this.fee = fee;
        this.course = course;
        this.student = student;
    }

    public Register(Register_PK register_PK, Date regDate, BigDecimal fee) {
        this.register_PK = register_PK;
        this.regDate = regDate;
        this.fee = fee;
    }
    
    public Register(String stID,String cID, Date regDate, BigDecimal fee) {
        this.register_PK = new Register_PK(stID, cID);
        this.regDate = regDate;
        this.fee = fee;
    }

    /**
     * @return the register_PK
     */
    public Register_PK getRegister_PK() {
        return register_PK;
    }

    /**
     * @param register_PK the register_PK to set
     */
    public void setRegister_PK(Register_PK register_PK) {
        this.register_PK = register_PK;
    }

    /**
     * @return the date
     */
    public Date getRegDate() {
        return regDate;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date regDate) {
        this.regDate = regDate;
    }

    /**
     * @return the fee
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Register{" + "register_PK=" + register_PK + ", date=" + regDate + ", fee=" + fee + '}';
    }
    
    
}
