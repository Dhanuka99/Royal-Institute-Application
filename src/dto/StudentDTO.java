
package dto;


public class StudentDTO {
    private String stID;
    private String name;
    private String address;

    public StudentDTO() {
    }

    public StudentDTO(String stID, String name, String address) {
        this.stID = stID;
        this.name = name;
        this.address = address;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDTO{" + "stID=" + stID + ", name=" + name + ", address=" + address + '}';
    }
    
}
