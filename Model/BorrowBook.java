/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class BorrowBook {
    private String bbId;
    private String lId;
    private String bId;
    private String sId;
    private String releaseDate;
    private Integer bookCondition;

    public BorrowBook() {
    }

    public BorrowBook(String bbId, String lId, String bId, String sId, String releaseDate, Integer bookCondition) {
        this.bbId = bbId;
        this.lId = lId;
        this.bId = bId;
        this.sId = sId;
        this.releaseDate = releaseDate;
        this.bookCondition = bookCondition;
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
     * @return the bId
     */
    public String getbId() {
        return bId;
    }

    /**
     * @param bId the bId to set
     */
    public void setbId(String bId) {
        this.bId = bId;
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
     * @return the releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the bookCondition
     */
    public Integer getBookCondition() {
        return bookCondition;
    }

    /**
     * @param bookCondition the bookCondition to set
     */
    public void setBookCondition(Integer bookCondition) {
        this.bookCondition = bookCondition;
    }
    
    
}
