/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Publisher {
    private String pId;
    private String name;
    private String description;
    private Integer contact;
    private String fax;
    private String email;

    public Publisher() {
    }

    public Publisher(String pId, String name, String description, Integer contact, String fax, String email) {
        this.pId = pId;
        this.name = name;
        this.description = description;
        this.contact = contact;
        this.fax = fax;
        this.email = email;
    }

    /**
     * @return the pId
     */
    public String getpId() {
        return pId;
    }

    /**
     * @param pId the pId to set
     */
    public void setpId(String pId) {
        this.pId = pId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return the contact
     */
    public Integer getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Integer contact) {
        this.contact = contact;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
