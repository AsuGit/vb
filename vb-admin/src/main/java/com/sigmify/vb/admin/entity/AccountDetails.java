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

import com.sigmify.vb.admin.entity.metadata.TermsAndConditions;



@Entity
@Table(schema = "admin",name="account_details")
public class AccountDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -652859095263750353L;
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "accountdetails_id_seq")
	  @SequenceGenerator(schema = "admin", name = "accountdetails_id_seq",
	      sequenceName = "accountdetails_id_seq", allocationSize = 1)
	  private Long id;
	  
	  @Column(name = "account_number",length = 12)
	  private String accountNumber;

	  @Column(name="ifsc_code",length = 20)
	  private String ifscCode;
	  
	  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	  @JoinColumn(name="user_id",referencedColumnName = "id")
	  private User userId;
	  
	  @Column(name="account_holder_name",length = 100)
	  private String accountHolderName;
	  
	  @OneToOne(targetEntity = TermsAndConditions.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	  @JoinColumn(name="term_and_conditions_Id",referencedColumnName = "id")
	  private TermsAndConditions termsAndConditionsId;
	  
	  @Column(name="is_terms_conditon_agreed",nullable = false)
	  private boolean isTermsConditonAgreed;
	  
	  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	  @JoinColumn(name = "created_by",referencedColumnName = "id")
	  private User createdBy;
	  
	  @Column(name="creation_date",nullable = false)
	  private Date creationDate;
	  
	  @Column(name = "last_update_date",nullable = false)
	  private Date lastUpdateDate;
	  
	  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	  @JoinColumn(name="last_update_by",referencedColumnName = "id")
	  private User lastUpdateBy;

	//-----getter&setter method
	  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public TermsAndConditions getTermsAndConditionsId() {
		return termsAndConditionsId;
	}

	public void setTermsAndConditionsId(TermsAndConditions termsAndConditionsId) {
		this.termsAndConditionsId = termsAndConditionsId;
	}

	public boolean isTermsConditonAgreed() {
		return isTermsConditonAgreed;
	}

	public void setTermsConditonAgreed(boolean isTermsConditonAgreed) {
		this.isTermsConditonAgreed = isTermsConditonAgreed;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
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
	//-----toString Method
	@Override
	public String toString() {
		return "AccountDetails [id=" + id + ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", userId="
				+ userId + ", accountHolderName=" + accountHolderName + ", termsAndConditionsId=" + termsAndConditionsId
				+ ", isTermsConditonAgreed=" + isTermsConditonAgreed + ", createdBy=" + createdBy + ", creationDate="
				+ creationDate + ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateBy=" + lastUpdateBy + "]";
	}	  
}
