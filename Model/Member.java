/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Member {
    private String mId;
    private Integer title1;
    private String mName;
    private Integer title2;
    private Integer gName;
    private String dob;
    private Integer age;
    private String nic;
    private String mStatus;
    private String mAddress;
    private Integer gAge;
    private String gAddress;
    private Integer mContact;
    private Integer gContact;
    private String mProfession;
    private String gProfession;
    private String rDate;
    private String expireDate;
    private Integer rate;
    private Integer mgender;

    public Member() {
    }

    public Member(String mId, Integer title1, String mName, Integer title2, Integer gName, String dob, Integer age, String nic, String mStatus, String mAddress, Integer gAge, String gAddress, Integer mContact, Integer gContact, String mProfession, String gProfession, String rDate, Integer rate, Integer mgender,String expireDate) {
        this.mId = mId;
        this.title1 = title1;
        this.mName = mName;
        this.title2 = title2;
        this.gName = gName;
        this.dob = dob;
        this.age = age;
        this.nic = nic;
        this.mStatus = mStatus;
        this.mAddress = mAddress;
        this.gAge = gAge;
        this.gAddress = gAddress;
        this.mContact = mContact;
        this.gContact = gContact;
        this.mProfession = mProfession;
        this.gProfession = gProfession;
        this.rDate = rDate;
        this.expireDate=expireDate;
        this.rate = rate;
        this.mgender = mgender;
    }

    /**
     * @return the mId
     */
    public String getmId() {
        return mId;
    }

    /**
     * @param mId the mId to set
     */
    public void setmId(String mId) {
        this.mId = mId;
    }

    /**
     * @return the title1
     */
    public Integer getTitle1() {
        return title1;
    }

    /**
     * @param title1 the title1 to set
     */
    public void setTitle1(Integer title1) {
        this.title1 = title1;
    }

    /**
     * @return the mName
     */
    public String getmName() {
        return mName;
    }

    /**
     * @param mName the mName to set
     */
    public void setmName(String mName) {
        this.mName = mName;
    }

    /**
     * @return the title2
     */
    public Integer getTitle2() {
        return title2;
    }

    /**
     * @param title2 the title2 to set
     */
    public void setTitle2(Integer title2) {
        this.title2 = title2;
    }

    /**
     * @return the gName
     */
    public Integer getgName() {
        return gName;
    }

    /**
     * @param gName the gName to set
     */
    public void setgName(Integer gName) {
        this.gName = gName;
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
     * @return the mAddress
     */
    public String getmAddress() {
        return mAddress;
    }

    /**
     * @param mAddress the mAddress to set
     */
    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    /**
     * @return the gAge
     */
    public Integer getgAge() {
        return gAge;
    }

    /**
     * @param gAge the gAge to set
     */
    public void setgAge(Integer gAge) {
        this.gAge = gAge;
    }

    /**
     * @return the gAddress
     */
    public String getgAddress() {
        return gAddress;
    }

    /**
     * @param gAddress the gAddress to set
     */
    public void setgAddress(String gAddress) {
        this.gAddress = gAddress;
    }

    /**
     * @return the mContact
     */
    public Integer getmContact() {
        return mContact;
    }

    /**
     * @param mContact the mContact to set
     */
    public void setmContact(Integer mContact) {
        this.mContact = mContact;
    }

    /**
     * @return the gContact
     */
    public Integer getgContact() {
        return gContact;
    }

    /**
     * @param gContact the gContact to set
     */
    public void setgContact(Integer gContact) {
        this.gContact = gContact;
    }

    /**
     * @return the mProfession
     */
    public String getmProfession() {
        return mProfession;
    }

    /**
     * @param mProfession the mProfession to set
     */
    public void setmProfession(String mProfession) {
        this.mProfession = mProfession;
    }

    /**
     * @return the gProfession
     */
    public String getgProfession() {
        return gProfession;
    }

    /**
     * @param gProfession the gProfession to set
     */
    public void setgProfession(String gProfession) {
        this.gProfession = gProfession;
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
     * @return the rate
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * @return the mgender
     */
    public Integer getMgender() {
        return mgender;
    }

    /**
     * @param mgender the mgender to set
     */
    public void setMgender(Integer mgender) {
        this.mgender = mgender;
    }

    /**
     * @return the expireDate
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }



}    
