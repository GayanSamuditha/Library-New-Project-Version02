/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class ReturnBook {
    private String rId;
    private String sId;
    private String lId;
    private String returnDate;
    private Integer releaCondition;
    private Integer presCondition;
    private Integer bRate;
    private Integer mRate;
    private Integer penDays;
    private Double fine;

    public ReturnBook() {
    }

    public ReturnBook(String rId, String sId, String lId, String returnDate, Integer releaCondition, Integer presCondition, Integer bRate, Integer mRate, Integer penDays, Double fine) {
        this.rId = rId;
        this.sId = sId;
        this.lId = lId;
        this.returnDate = returnDate;
        this.releaCondition = releaCondition;
        this.presCondition = presCondition;
        this.bRate = bRate;
        this.mRate = mRate;
        this.penDays = penDays;
        this.fine = fine;
    }

    /**
     * @return the rId
     */
    public String getrId() {
        return rId;
    }

    /**
     * @param rId the rId to set
     */
    public void setrId(String rId) {
        this.rId = rId;
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
     * @return the returnDate
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the releaCondition
     */
    public Integer getReleaCondition() {
        return releaCondition;
    }

    /**
     * @param releaCondition the releaCondition to set
     */
    public void setReleaCondition(Integer releaCondition) {
        this.releaCondition = releaCondition;
    }

    /**
     * @return the presCondition
     */
    public Integer getPresCondition() {
        return presCondition;
    }

    /**
     * @param presCondition the presCondition to set
     */
    public void setPresCondition(Integer presCondition) {
        this.presCondition = presCondition;
    }

    /**
     * @return the bRate
     */
    public Integer getbRate() {
        return bRate;
    }

    /**
     * @param bRate the bRate to set
     */
    public void setbRate(Integer bRate) {
        this.bRate = bRate;
    }

    /**
     * @return the mRate
     */
    public Integer getmRate() {
        return mRate;
    }

    /**
     * @param mRate the mRate to set
     */
    public void setmRate(Integer mRate) {
        this.mRate = mRate;
    }

    /**
     * @return the penDays
     */
    public Integer getPenDays() {
        return penDays;
    }

    /**
     * @param penDays the penDays to set
     */
    public void setPenDays(Integer penDays) {
        this.penDays = penDays;
    }

    /**
     * @return the fine
     */
    public Double getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(Double fine) {
        this.fine = fine;
    }
    
    
    
}
