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
@Table(name = "STAFF", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s")
    , @NamedQuery(name = "Staff.findByStaffid", query = "SELECT s FROM Staff s WHERE s.staffid = :staffid")
    , @NamedQuery(name = "Staff.findByStaffname", query = "SELECT s FROM Staff s WHERE s.staffname = :staffname")
    , @NamedQuery(name = "Staff.findByStaffsalary", query = "SELECT s FROM Staff s WHERE s.staffsalary = :staffsalary")
    , @NamedQuery(name = "Staff.findByStaffaddress", query = "SELECT s FROM Staff s WHERE s.staffaddress = :staffaddress")
    , @NamedQuery(name = "Staff.findByStaffcontactnumber", query = "SELECT s FROM Staff s WHERE s.staffcontactnumber = :staffcontactnumber")
    , @NamedQuery(name = "Staff.findByUsername", query = "SELECT s FROM Staff s WHERE s.username = :username")
    , @NamedQuery(name = "Staff.findByPassword", query = "SELECT s FROM Staff s WHERE s.password = :password")})
public class Staff implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STAFFID")
    private String staffid;
    @Column(name = "STAFFNAME")
    private String staffname;
    @Column(name = "STAFFSALARY")
    private String staffsalary;
    @Column(name = "STAFFADDRESS")
    private String staffaddress;
    @Column(name = "STAFFCONTACTNUMBER")
    private String staffcontactnumber;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;

    public Staff() {
    }

    public Staff(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        String oldStaffid = this.staffid;
        this.staffid = staffid;
        changeSupport.firePropertyChange("staffid", oldStaffid, staffid);
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        String oldStaffname = this.staffname;
        this.staffname = staffname;
        changeSupport.firePropertyChange("staffname", oldStaffname, staffname);
    }

    public String getStaffsalary() {
        return staffsalary;
    }

    public void setStaffsalary(String staffsalary) {
        String oldStaffsalary = this.staffsalary;
        this.staffsalary = staffsalary;
        changeSupport.firePropertyChange("staffsalary", oldStaffsalary, staffsalary);
    }

    public String getStaffaddress() {
        return staffaddress;
    }

    public void setStaffaddress(String staffaddress) {
        String oldStaffaddress = this.staffaddress;
        this.staffaddress = staffaddress;
        changeSupport.firePropertyChange("staffaddress", oldStaffaddress, staffaddress);
    }

    public String getStaffcontactnumber() {
        return staffcontactnumber;
    }

    public void setStaffcontactnumber(String staffcontactnumber) {
        String oldStaffcontactnumber = this.staffcontactnumber;
        this.staffcontactnumber = staffcontactnumber;
        changeSupport.firePropertyChange("staffcontactnumber", oldStaffcontactnumber, staffcontactnumber);
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
        hash += (staffid != null ? staffid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.staffid == null && other.staffid != null) || (this.staffid != null && !this.staffid.equals(other.staffid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bookshopautomationssystem.Staff[ staffid=" + staffid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
