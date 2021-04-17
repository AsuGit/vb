package com.sigmify.vb.admin.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "admin",name="user_password")
public class UserPassword implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -652859095263750353L;
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_password_id_seq")
	  @SequenceGenerator(schema = "admin", name = "user_password_id_seq",
	      sequenceName = "user_password_id_seq", allocationSize = 1)
	  private Long id;
	  
	  @Column(name = "password",length = 100)
	  private String password;
	  
	  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	  @JoinColumn(name="user_id",referencedColumnName = "id")
	  private User userId;
	  
	  @Column(name="creation_date",nullable = false)
	  private Date creationDate;
	  
	  @Column(name="last_update_date",nullable = false)
	  private Date lastUpdateDate;
	  
	  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	  @JoinColumn(name="last_update_by",referencedColumnName = "id")
	  private User lastUpdateBy;
	  
	//-----getter&setter method
	

	public String getPassword() {
		return password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
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

	public User getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(User lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
//---------toString method----------
	@Override
	public String toString() {
		return "UserPassword [id=" + id + ", password=" + password + ", userId=" + userId + ", creationDate="
				+ creationDate + ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateBy=" + lastUpdateBy + "]";
	}
	
}
