/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author SSNLIVE
 */
public class CourseDTO {
    private String cID;
    private String name;
    private String duration;

    public CourseDTO() {
    }

    public CourseDTO(String cID, String name, String duration) {
        this.cID = cID;
        this.name = name;
        this.duration = duration;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "cID=" + cID + ", name=" + name + ", duration=" + duration + '}';
    }

    
    
}
