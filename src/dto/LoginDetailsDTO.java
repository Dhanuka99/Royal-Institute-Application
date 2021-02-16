package dto;

public class LoginDetailsDTO {
    private String loginID;
    private String loginName;
    private String loginPassword;

    public LoginDetailsDTO() {
    }

    public LoginDetailsDTO(String loginID, String loginName, String loginPassword) {
        this.loginID = loginID;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Override
    public String toString() {
        return "LoginDetailsDTO{" +
                "loginID='" + loginID + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }
}
