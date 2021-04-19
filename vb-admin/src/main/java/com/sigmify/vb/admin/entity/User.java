package com.sigmify.vb.admin.entity;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sigmify.vb.admin.entity.metadata.UserType;



@Entity
@Table(schema = "admin",name="user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -652859095263750353L;
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_id_seq")
	  @SequenceGenerator(schema = "admin", name = "user_id_seq",
	      sequenceName = "user_id_seq", allocationSize = 1)
	  private Long id;
	  
	  @Column(name = "username",length = 100)
	  private String userName;

	  @Column(name="fname",length = 100)
	  private String fName;
	  
	  @Column(name="lname",length = 100)
	  private String lName;
	  
	  @Column(name="profile_photo",length = 200)
	  private File photo;
	  
	  @ManyToOne(targetEntity =UserType.class,cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	  @JoinColumn(name = "user_type",referencedColumnName = "id")
	  private UserType usertype;
	 
	  @Temporal(TemporalType.TIMESTAMP)
	  @Column(name="create_date",nullable = false)
	  private Date createDate;
	  
	  @Temporal(TemporalType.TIMESTAMP)
	  @Column(name="last_update_date",nullable = false)
	  private Date lastUpdateDate;
	  
	  @Column(name="is_active")
	  private boolean active;
	  
	  @Column(name="last_update_by")
	  private Long lastUpdateBy;
	  
	//-----getter&setter method
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public UserType getUserType() {
		return usertype;
	}
	public void setUserType(UserType userType) {
		this.usertype = userType;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Long getLastUpdateBy() {
		return lastUpdateBy;
	}
	public void setLastUpdateBy(Long lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", fName=" + fName + ", lName=" + lName + ", photo="
				+ photo + ", userType=" + usertype + ", createDate=" + createDate + ", lastUpdateDate=" + lastUpdateDate
				+ ", active=" + active + ", lastUpdateBy=" + lastUpdateBy + "]";
	}
	  
}
