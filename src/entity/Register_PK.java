
package entity;

import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
public class Register_PK implements Serializable {
    
    private String stID;
    private String cID;

    public Register_PK() {
    }

    public Register_PK(String stID, String cID) {
        this.stID = stID;
        this.cID = cID;
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
    
}
