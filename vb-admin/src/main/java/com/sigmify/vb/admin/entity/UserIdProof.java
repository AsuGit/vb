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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.sigmify.vb.admin.entity.metadata.ProofType;

@Entity
@Table(schema = "admin",name="user_id_proofs")
public class UserIdProof implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -652859095263750353L;
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_id_proofs_seq")
	  @SequenceGenerator(schema = "admin", name = "user_id_proofs_seq",
	      sequenceName = "user_id_proofs_seq", allocationSize = 1)
	  private Long id;
	  
	  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	  @JoinColumn(name = "user_id",referencedColumnName = "id")
	  private User userId;

	  @Column(name="UAN",unique = true,length = 30)
	  private String uan;
	  
	  @Column(name="image_path",length = 100)
	  private String imagePath;
	  
	  @ManyToOne(targetEntity = ProofType.class,cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	  @JoinColumn(name="proof_type_id",referencedColumnName = "id")
	  private ProofType proofType;
	  
	  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	  @JoinColumn(name="created_by",referencedColumnName = "id")
	  private User createdBy;
	  
	  @Column(name="creation_date",nullable = false)
	  private Date creationDate;
	  
	  @Column(name="last_update_date",nullable = false)
	  private Date lastUpdateDate;
	  
	  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	  @JoinColumn(name="last_update_by",referencedColumnName = "id")
	  private User lastUpdateBy;

//----getterSetter method	  
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

	public String getUan() {
		return uan;
	}

	public void setUan(String uan) {
		this.uan = uan;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public ProofType getProofType() {
		return proofType;
	}

	public void setProofType(ProofType proofType) {
		this.proofType = proofType;
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

	//
	@Override
	public String toString() {
		return "UserIdProof [id=" + id + ", userId=" + userId + ", uan=" + uan + ", imagePath=" + imagePath
				+ ", proofType=" + proofType + ", createdBy=" + createdBy + ", creationDate=" + creationDate
				+ ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateBy=" + lastUpdateBy + "]";
	}
	  
}
