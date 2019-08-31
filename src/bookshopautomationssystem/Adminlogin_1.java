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
@Table(name = "ADMINLOGIN", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Adminlogin_1.findAll", query = "SELECT a FROM Adminlogin_1 a")
    , @NamedQuery(name = "Adminlogin_1.findByUsername", query = "SELECT a FROM Adminlogin_1 a WHERE a.username = :username")
    , @NamedQuery(name = "Adminlogin_1.findByPassword", query = "SELECT a FROM Adminlogin_1 a WHERE a.password = :password")})
public class Adminlogin_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private Integer password;

    public Adminlogin_1() {
    }

    public Adminlogin_1(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        Integer oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adminlogin_1)) {
            return false;
        }
        Adminlogin_1 other = (Adminlogin_1) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bookshopautomationssystem.Adminlogin_1[ username=" + username + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
