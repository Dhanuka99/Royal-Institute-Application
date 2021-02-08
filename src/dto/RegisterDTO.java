/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author SSNLIVE
 */
public class RegisterDTO {
    
    private String stID;
    private String cID;
    private Date regDate;
    private BigDecimal fee;

    public RegisterDTO() {
    }

    public RegisterDTO(String stID, String cID, Date regDate, BigDecimal fee) {
        this.stID = stID;
        this.cID = cID;
        this.regDate = regDate;
        this.fee = fee;
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
     * @return the cID
     */
    public String getcID() {
        return cID;
    }

    /**
     * @param cID the cID to set
     */
    public void setcID(String cID) {
        this.cID = cID;
    }

    /**
     * @return the regDate
     */
    public Date getRegDate() {
        return regDate;
    }

    /**
     * @param regDate the regDate to set
     */
    public void setRegDate(Date regDate) {
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

    @Override
    public String toString() {
        return "RegisterDTO{" + "stID=" + stID + ", cID=" + cID + ", regDate=" + regDate + ", fee=" + fee + '}';
    }
    
    
    
    
    
}
