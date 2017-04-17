/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class LibraryCard {
    private String lId;
    private String mId;
    private String year;
    private Integer brCount;

    public LibraryCard() {
    }

    public LibraryCard(String lId, String mId, String year, Integer brCount) {
        this.lId = lId;
        this.mId = mId;
        this.year = year;
        this.brCount = brCount;
    }

    /**
     * @return the lId
     */
    public String getlId() {
        return lId;
    }

    /**
     * @param lId the lId to set
     */
    public void setlId(String lId) {
        this.lId = lId;
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
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the brCount
     */
    public Integer getBrCount() {
        return brCount;
    }

    /**
     * @param brCount the brCount to set
     */
    public void setBrCount(Integer brCount) {
        this.brCount = brCount;
    }
    
    
}
