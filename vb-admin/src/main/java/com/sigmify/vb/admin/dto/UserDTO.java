package com.sigmify.vb.admin.dto;

import java.io.File;
import java.io.Serializable;
import java.sql.Date;
<<<<<<< HEAD

import com.sigmify.vb.admin.entity.metadata.UserType;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8116414957433360698L;
	  private Long id;
	  private String userName;
	  private String fName;
	  private String lName;
	  private File photo;
	  private UserType usertype;
	  private Date createDate;
	  private Date lastUpdateDate;
	  private boolean active;
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
=======
import com.sigmify.vb.admin.entity.metadata.UserType;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8116414957433360698L;
	
	  private Long id;
	  private String userName;
	  private String fName;
	  private String lName;
	  private File photo;
	  private UserType usertype;
	  private Date createDate;
	  private Date lastUpdateDate;
	  private boolean active;
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

>>>>>>> branch 'master' of https://github.com/AsuGit/vb.git
}
