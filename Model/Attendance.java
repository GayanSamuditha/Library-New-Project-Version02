/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Attendance {
    private String sId;
    private String date;
    private String actTFrom;
    private String actTTo;
    private String rate;

    public Attendance() {
    }

    public Attendance(String sId, String date, String actTFrom, String actTTo, String rate) {
        this.sId = sId;
        this.date = date;
        this.actTFrom = actTFrom;
        this.actTTo = actTTo;
        this.rate = rate;
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
     * @return the actTFrom
     */
    public String getActTFrom() {
        return actTFrom;
    }

    /**
     * @param actTFrom the actTFrom to set
     */
    public void setActTFrom(String actTFrom) {
        this.actTFrom = actTFrom;
    }

    /**
     * @return the actTTo
     */
    public String getActTTo() {
        return actTTo;
    }

    /**
     * @param actTTo the actTTo to set
     */
    public void setActTTo(String actTTo) {
        this.actTTo = actTTo;
    }

    /**
     * @return the rate
     */
    public String getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(String rate) {
        this.rate = rate;
    }
    
    
}
