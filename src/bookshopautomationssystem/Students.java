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
@Table(name = "STUDENTS", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s")
    , @NamedQuery(name = "Students.findByStudentid", query = "SELECT s FROM Students s WHERE s.studentid = :studentid")
    , @NamedQuery(name = "Students.findByStudentname", query = "SELECT s FROM Students s WHERE s.studentname = :studentname")
    , @NamedQuery(name = "Students.findByStudentclass", query = "SELECT s FROM Students s WHERE s.studentclass = :studentclass")
    , @NamedQuery(name = "Students.findByAddress", query = "SELECT s FROM Students s WHERE s.address = :address")
    , @NamedQuery(name = "Students.findByFine", query = "SELECT s FROM Students s WHERE s.fine = :fine")
    , @NamedQuery(name = "Students.findByUsername", query = "SELECT s FROM Students s WHERE s.username = :username")
    , @NamedQuery(name = "Students.findByPassword", query = "SELECT s FROM Students s WHERE s.password = :password")})
public class Students implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STUDENTID")
    private String studentid;
    @Column(name = "STUDENTNAME")
    private String studentname;
    @Column(name = "STUDENTCLASS")
    private String studentclass;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "FINE")
    private String fine;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;

    public Students() {
    }

    public Students(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        String oldStudentid = this.studentid;
        this.studentid = studentid;
        changeSupport.firePropertyChange("studentid", oldStudentid, studentid);
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        String oldStudentname = this.studentname;
        this.studentname = studentname;
        changeSupport.firePropertyChange("studentname", oldStudentname, studentname);
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        String oldStudentclass = this.studentclass;
        this.studentclass = studentclass;
        changeSupport.firePropertyChange("studentclass", oldStudentclass, studentclass);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getFine() {
        return fine;
    }

    public void setFine(String fine) {
        String oldFine = this.fine;
        this.fine = fine;
        changeSupport.firePropertyChange("fine", oldFine, fine);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentid != null ? studentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.studentid == null && other.studentid != null) || (this.studentid != null && !this.studentid.equals(other.studentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bookshopautomationssystem.Students[ studentid=" + studentid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
