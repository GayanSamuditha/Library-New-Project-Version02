/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Newspaper {
    private String nId;
    private String sId;
    private String date;
    private String description;
    private String name;
    private Integer noCopies;

    public Newspaper() {
    }

    public Newspaper(String nId, String sId, String date, String description, String name, Integer noCopies) {
        this.nId = nId;
        this.sId = sId;
        this.date = date;
        this.description = description;
        this.name = name;
        this.noCopies = noCopies;
    }

    /**
     * @return the nId
     */
    public String getnId() {
        return nId;
    }

    /**
     * @param nId the nId to set
     */
    public void setnId(String nId) {
        this.nId = nId;
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
     * @return the noCopies
     */
    public Integer getNoCopies() {
        return noCopies;
    }

    /**
     * @param noCopies the noCopies to set
     */
    public void setNoCopies(Integer noCopies) {
        this.noCopies = noCopies;
    }
    
    
}
