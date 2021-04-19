package com.sigmify.vb.admin.dto;

import java.io.Serializable;
import java.sql.Date;

import com.sigmify.vb.admin.entity.User;

public class UserPasswordDTO implements Serializable {

	/**
	 * 
	 */
	  private static final long serialVersionUID = -2519331372578914463L;
	  private Long id;  
	  private String password;
	  private Long userId;
	  private Date creationDate;
	  private Date lastUpdateDate;
	  private Long lastUpdateBy;
	//getterSetter method
	  public Long getId() {
		return id;
	  }
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
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
}
