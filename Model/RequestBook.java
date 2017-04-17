/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author linux
 */
public class RequestBook {
    private String rqId;
    private String mId;
    private String Bname;
    private String publisher;
    private String author;
    private String language;
    private Integer edition;
    private String category;

    public RequestBook() {
    }

    public RequestBook(String rqId, String mId, String Bname, String publisher, String author, String language, Integer edition, String category) {
        this.rqId = rqId;
        this.mId = mId;
        this.Bname = Bname;
        this.publisher = publisher;
        this.author = author;
        this.language = language;
        this.edition = edition;
        this.category = category;
    }

    /**
     * @return the rqId
     */
    public String getRqId() {
        return rqId;
    }

    /**
     * @param rqId the rqId to set
     */
    public void setRqId(String rqId) {
        this.rqId = rqId;
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
     * @return the Bname
     */
    public String getBname() {
        return Bname;
    }

    /**
     * @param Bname the Bname to set
     */
    public void setBname(String Bname) {
        this.Bname = Bname;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
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
    public Integer getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
    
}
