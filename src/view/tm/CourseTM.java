package view.tm;

public class CourseTM {
    private String cID;
    private String cName;
    private String cType;
    private String cDuration;

    public CourseTM() {
    }

    public CourseTM(String cID, String cName, String cType, String cDuration) {
        this.setcID(cID);
        this.setcName(cName);
        this.setcType(cType);
        this.setcDuration(cDuration);
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

    @Override
    public String toString() {
        return "CourseTM{" +
                "cID='" + cID + '\'' +
                ", cName='" + cName + '\'' +
                ", cType='" + cType + '\'' +
                ", cDuration='" + cDuration + '\'' +
                '}';
    }
}
