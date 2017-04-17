/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class Book {
    private String bId;
    private String abId;
    private String sId;
    private String pId;
    private String ctId;
    private String accNo;
    private String isbn;
    private String name;
    private String language;
    private String edition;
    private String pYear;
    private String keyword;;
    private Integer shelfNo;
    private String state;
    private Integer available;
    private Integer rating;
    private Integer noOfCopies;
    private Integer priviledge;

    public Book() {
    }

    public Book(String bId, String abId, String sId, String pId, String ctId, String accNo, String isbn, String name, String language, String edition, String pYear, String keyword, Integer shelfNo, String state, Integer available, Integer rating, Integer noOfCopies, Integer priviledge) {
        this.bId = bId;
        this.abId = abId;
        this.sId = sId;
        this.pId = pId;
        this.ctId = ctId;
        this.accNo = accNo;
        this.isbn = isbn;
        this.name = name;
        this.language = language;
        this.edition = edition;
        this.pYear = pYear;
        this.keyword = keyword;
        this.shelfNo = shelfNo;
        this.state = state;
        this.available = available;
        this.rating = rating;
        this.noOfCopies = noOfCopies;
        this.priviledge = priviledge;
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
     * @return the accNo
     */
    public String getAccNo() {
        return accNo;
    }

    /**
     * @param accNo the accNo to set
     */
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * @return the pYear
     */
    public String getpYear() {
        return pYear;
    }

    /**
     * @param pYear the pYear to set
     */
    public void setpYear(String pYear) {
        this.pYear = pYear;
    }

    /**
     * @return the keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * @param keyword the keyword to set
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * @return the shelfNo
     */
    public Integer getShelfNo() {
        return shelfNo;
    }

    /**
     * @param shelfNo the shelfNo to set
     */
    public void setShelfNo(Integer shelfNo) {
        this.shelfNo = shelfNo;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the available
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(Integer available) {
        this.available = available;
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
     * @return the noOfCopies
     */
    public Integer getNoOfCopies() {
        return noOfCopies;
    }

    /**
     * @param noOfCopies the noOfCopies to set
     */
    public void setNoOfCopies(Integer noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    /**
     * @return the priviledge
     */
    public Integer getPriviledge() {
        return priviledge;
    }

    /**
     * @param priviledge the priviledge to set
     */
    public void setPriviledge(Integer priviledge) {
        this.priviledge = priviledge;
    }
    
    
    
}
