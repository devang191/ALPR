/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshopautomationssystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author atul
 */
@Entity
@Table(name = "RECORDS_SOLD", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "RecordsSold.findAll", query = "SELECT r FROM RecordsSold r")
    , @NamedQuery(name = "RecordsSold.findByBookid", query = "SELECT r FROM RecordsSold r WHERE r.bookid = :bookid")
    , @NamedQuery(name = "RecordsSold.findByBookisbn", query = "SELECT r FROM RecordsSold r WHERE r.bookisbn = :bookisbn")
    , @NamedQuery(name = "RecordsSold.findByBookname", query = "SELECT r FROM RecordsSold r WHERE r.bookname = :bookname")
    , @NamedQuery(name = "RecordsSold.findByBookauthor", query = "SELECT r FROM RecordsSold r WHERE r.bookauthor = :bookauthor")
    , @NamedQuery(name = "RecordsSold.findByBookprice", query = "SELECT r FROM RecordsSold r WHERE r.bookprice = :bookprice")
    , @NamedQuery(name = "RecordsSold.findByBuyer", query = "SELECT r FROM RecordsSold r WHERE r.buyer = :buyer")
    , @NamedQuery(name = "RecordsSold.findBySolddate", query = "SELECT r FROM RecordsSold r WHERE r.solddate = :solddate")})
public class RecordsSold implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BOOKID")
    private String bookid;
    @Column(name = "BOOKISBN")
    private String bookisbn;
    @Column(name = "BOOKNAME")
    private String bookname;
    @Column(name = "BOOKAUTHOR")
    private String bookauthor;
    @Column(name = "BOOKPRICE")
    private String bookprice;
    @Column(name = "BUYER")
    private String buyer;
    @Column(name = "SOLDDATE")
    private String solddate;

    public RecordsSold() {
    }

    public RecordsSold(String bookid) {
        this.bookid = bookid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        String oldBookid = this.bookid;
        this.bookid = bookid;
        changeSupport.firePropertyChange("bookid", oldBookid, bookid);
    }

    public String getBookisbn() {
        return bookisbn;
    }

    public void setBookisbn(String bookisbn) {
        String oldBookisbn = this.bookisbn;
        this.bookisbn = bookisbn;
        changeSupport.firePropertyChange("bookisbn", oldBookisbn, bookisbn);
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        String oldBookname = this.bookname;
        this.bookname = bookname;
        changeSupport.firePropertyChange("bookname", oldBookname, bookname);
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        String oldBookauthor = this.bookauthor;
        this.bookauthor = bookauthor;
        changeSupport.firePropertyChange("bookauthor", oldBookauthor, bookauthor);
    }

    public String getBookprice() {
        return bookprice;
    }

    public void setBookprice(String bookprice) {
        String oldBookprice = this.bookprice;
        this.bookprice = bookprice;
        changeSupport.firePropertyChange("bookprice", oldBookprice, bookprice);
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        String oldBuyer = this.buyer;
        this.buyer = buyer;
        changeSupport.firePropertyChange("buyer", oldBuyer, buyer);
    }

    public String getSolddate() {
        return solddate;
    }

    public void setSolddate(String solddate) {
        String oldSolddate = this.solddate;
        this.solddate = solddate;
        changeSupport.firePropertyChange("solddate", oldSolddate, solddate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecordsSold)) {
            return false;
        }
        RecordsSold other = (RecordsSold) object;
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bookshopautomationssystem.RecordsSold[ bookid=" + bookid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
