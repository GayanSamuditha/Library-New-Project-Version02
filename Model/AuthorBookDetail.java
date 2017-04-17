/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class AuthorBookDetail {
    private String abId;
    private String aId;
    private String bId;

    public AuthorBookDetail() {
    }

    public AuthorBookDetail(String abId, String aId, String bId) {
        this.abId = abId;
        this.aId = aId;
        this.bId = bId;
    }

    /**
     * @return the abId
     */
    public String getAbId() {
        return abId;
    }

    /**
     * @param abId the abId to set
     */
    public void setAbId(String abId) {
        this.abId = abId;
    }

    /**
     * @return the aId
     */
    public String getaId() {
        return aId;
    }

    /**
     * @param aId the aId to set
     */
    public void setaId(String aId) {
        this.aId = aId;
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
     
    
}
