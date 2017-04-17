/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class ReserveBook {
    private String rvId;
    private String bbId;
    private String mId;
    private String rfDate;
    private String rtDate;

    public ReserveBook() {
    }

    public ReserveBook(String rvId, String bbId, String mId, String rfDate, String rtDate) {
        this.rvId = rvId;
        this.bbId = bbId;
        this.mId = mId;
        this.rfDate = rfDate;
        this.rtDate = rtDate;
    }

    /**
     * @return the rvId
     */
    public String getRvId() {
        return rvId;
    }

    /**
     * @param rvId the rvId to set
     */
    public void setRvId(String rvId) {
        this.rvId = rvId;
    }

    /**
     * @return the bbId
     */
    public String getBbId() {
        return bbId;
    }

    /**
     * @param bbId the bbId to set
     */
    public void setBbId(String bbId) {
        this.bbId = bbId;
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
     * @return the rfDate
     */
    public String getRfDate() {
        return rfDate;
    }

    /**
     * @param rfDate the rfDate to set
     */
    public void setRfDate(String rfDate) {
        this.rfDate = rfDate;
    }

    /**
     * @return the rtDate
     */
    public String getRtDate() {
        return rtDate;
    }

    /**
     * @param rtDate the rtDate to set
     */
    public void setRtDate(String rtDate) {
        this.rtDate = rtDate;
    }
    
    
}
