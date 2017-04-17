/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class MemberFee {
    private String mfId;
    private String mId;
    private Double amount;
    private String date;

    public MemberFee() {
    }

    public MemberFee(String mfId, String mId, Double amount, String date) {
        this.mfId = mfId;
        this.mId = mId;
        this.amount = amount;
        this.date = date;
    }

    /**
     * @return the mfId
     */
    public String getMfId() {
        return mfId;
    }

    /**
     * @param mfId the mfId to set
     */
    public void setMfId(String mfId) {
        this.mfId = mfId;
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
