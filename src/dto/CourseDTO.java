
package dto;


import entity.Register;

import java.util.List;

public class CourseDTO {
    private String cID;
    private String cName;
    private String cType;
    private String cDuration;
    private List<Register> registers;

    public CourseDTO(String cID, String cName, String cType, String cDuration, List<Register> registers) {
        this.cID = cID;
        this.cName = cName;
        this.cType = cType;
        this.cDuration = cDuration;
        this.registers = registers;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public String getcDuration() {
        return cDuration;
    }

    public void setcDuration(String cDuration) {
        this.cDuration = cDuration;
    }

    public List<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register> registers) {
        this.registers = registers;
    }

    @Override
    public String toString() {
        return "CourseDTO{" +
                "cID='" + cID + '\'' +
                ", cName='" + cName + '\'' +
                ", cType='" + cType + '\'' +
                ", cDuration='" + cDuration + '\'' +
                ", registers=" + registers +
                '}';
    }
}
