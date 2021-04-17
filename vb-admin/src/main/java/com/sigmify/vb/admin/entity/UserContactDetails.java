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
@Table(schema = "admin",name="admin.user_contact_details")
public class UserContactDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -652859095263750353L;
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_id_seq")
	  @SequenceGenerator(schema = "admin", name = "user_contact_id_seq",
	      sequenceName = "user_contact_id_seq", allocationSize = 1)
	  private Long id;
	  
	  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	  @JoinColumn(name = "user_id",referencedColumnName = "id")
	  private User userId;

	  @Column(name="email",length = 100)
	  private String eMail;
	  
	  @Column(name="phone",length = 12)
	  private String phoneNo;
	  
	  @Column(name="creation_date",nullable = false)
	  private Date createDate;
	  
	  @Column(name="last_update_date",nullable = false)
	  private Date lastUpdateDate;
	  
	  @Column(name="last_update_by")
	  private Long lastUpdateBy;
	//-----getter&setter method
	  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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

	public Long getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(Long lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 //------to string method
	@Override
	public String toString() {
		return "UserContactDetails [id=" + id + ", userId=" + userId + ", eMail=" + eMail + ", phoneNo=" + phoneNo
				+ ", createDate=" + createDate + ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateBy=" + lastUpdateBy
				+ "]";
	}
	
	
}
