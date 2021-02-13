
package dto;

import java.math.BigDecimal;
import java.util.Date;


public class RegisterDTO {

    private String regID;
    private String stID;
    private String cID;
    private String regDate;
    private double fee;

    public RegisterDTO() {
    }

    public RegisterDTO(String regID, String stID, String cID, String regDate, double fee) {
        this.regID = regID;
        this.stID = stID;
        this.cID = cID;
        this.regDate = regDate;
        this.fee = fee;
    }

    public String getRegID() {
        return regID;
    }

    public void setRegID(String regID) {
        this.regID = regID;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "RegisterDTO{" +
                "regID='" + regID + '\'' +
                ", stID='" + stID + '\'' +
                ", cID='" + cID + '\'' +
                ", regDate='" + regDate + '\'' +
                ", fee=" + fee +
                '}';
    }
}
