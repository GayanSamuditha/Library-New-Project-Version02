/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Complain {
    private String cmId;
    private String mId;
    private String date;
    private String description;

    public Complain() {
    }

    public Complain(String cmId, String mId, String date, String description) {
        this.cmId = cmId;
        this.mId = mId;
        this.date = date;
        this.description = description;
    }

    /**
     * @return the cmId
     */
    public String getCmId() {
        return cmId;
    }

    /**
     * @param cmId the cmId to set
     */
    public void setCmId(String cmId) {
        this.cmId = cmId;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
    
}
