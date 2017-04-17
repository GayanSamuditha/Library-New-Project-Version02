/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Staff {
    private String sId;
    private String name;
    private Integer gender;
    private String address;
    private String rDate;
    private String mStatus;
    private Integer contact;
    private Integer age;
    private String dob;
    private String nic;

    public Staff() {
    }

    public Staff(String sId, String name, Integer gender, String address, String rDate, String mStatus, Integer contact, Integer age, String dob, String nic) {
        this.sId = sId;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.rDate = rDate;
        this.mStatus = mStatus;
        this.contact = contact;
        this.age = age;
        this.dob = dob;
        this.nic = nic;
    }

    /**
     * @return the sId
     */
    public String getsId() {
        return sId;
    }

    /**
     * @param sId the sId to set
     */
    public void setsId(String sId) {
        this.sId = sId;
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
     * @return the gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Integer gender) {
        this.gender = gender;
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

    /**
     * @return the rDate
     */
    public String getrDate() {
        return rDate;
    }

    /**
     * @param rDate the rDate to set
     */
    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    /**
     * @return the mStatus
     */
    public String getmStatus() {
        return mStatus;
    }

    /**
     * @param mStatus the mStatus to set
     */
    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    /**
     * @return the contact
     */
    public Integer getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Integer contact) {
        this.contact = contact;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }
    
    
}
