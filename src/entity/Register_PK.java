
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
    
}
