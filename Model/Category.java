/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Category {
    private String ctId;
    private String cName;
    private String description;

    public Category() {
    }

    public Category(String ctId, String cName, String description) {
        this.ctId = ctId;
        this.cName = cName;
        this.description = description;
    }

    /**
     * @return the ctId
     */
    public String getCtId() {
        return ctId;
    }

    /**
     * @param ctId the ctId to set
     */
    public void setCtId(String ctId) {
        this.ctId = ctId;
    }

    /**
     * @return the cName
     */
    public String getcName() {
        return cName;
    }

    /**
     * @param cName the cName to set
     */
    public void setcName(String cName) {
        this.cName = cName;
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
