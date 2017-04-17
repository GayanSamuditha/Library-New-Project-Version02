/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Author {
    private String aId;
    private String dob;
    private Integer age;
    private String name;
    private String description;

    public Author() {
    }

    public Author(String aId, String dob, Integer age, String name, String description) {
        this.aId = aId;
        this.dob = dob;
        this.age = age;
        this.name = name;
        this.description = description;
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
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
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
    
}
