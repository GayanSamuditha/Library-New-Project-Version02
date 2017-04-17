/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Fine {
    private String fId;
    private String mId;
    private String rId;
    private Double amount;
    private String note;
    private Integer rating;
    private String date;

    public Fine() {
    }

    public Fine(String fId, String mId, String rId, Double amount, String note, Integer rating, String date) {
        this.fId = fId;
        this.mId = mId;
        this.rId = rId;
        this.amount = amount;
        this.note = note;
        this.rating = rating;
        this.date = date;
    }

    /**
     * @return the fId
     */
    public String getfId() {
        return fId;
    }

    /**
     * @param fId the fId to set
     */
    public void setfId(String fId) {
        this.fId = fId;
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
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the rating
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(Integer rating) {
        this.rating = rating;
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
    
    
}
