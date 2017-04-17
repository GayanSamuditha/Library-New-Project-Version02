/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class DamageItem {
    private String dId;
    private String rId;
    private Integer expAction;
    private String description;

    public DamageItem() {
    }

    public DamageItem(String dId, String rId, Integer expAction, String description) {
        this.dId = dId;
        this.rId = rId;
        this.expAction = expAction;
        this.description = description;
    }

    /**
     * @return the dId
     */
    public String getdId() {
        return dId;
    }

    /**
     * @param dId the dId to set
     */
    public void setdId(String dId) {
        this.dId = dId;
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
     * @return the expAction
     */
    public Integer getExpAction() {
        return expAction;
    }

    /**
     * @param expAction the expAction to set
     */
    public void setExpAction(Integer expAction) {
        this.expAction = expAction;
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
