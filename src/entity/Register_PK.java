
package entity;

import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
public class Register_PK implements Serializable {
    
   private String studentID;
   private String courseID;



}
