package com.sigmify.vb.admin.entity;

import java.io.Serializable;

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
@Table(schema ="admin",name = "referral")
public class Referral implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 5231427076977781731L;

  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "referral_id_seq")
    @SequenceGenerator(schema = "admin", name = "referral_id_seq",
        sequenceName = "referral_id_seq", allocationSize = 1)
    private Long id;
  
  @Column(name = "referral_code",unique = true,nullable = false)
  private String referralCode;
  
  @OneToOne(targetEntity = User.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
  @JoinColumn(name = "generated_for",referencedColumnName = "id")
  private User generatedFor;

  //------getterSetter method
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getReferralCode() {
    return referralCode;
  }

  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  public User getGeneratedFor() {
    return generatedFor;
  }

  public void setGeneratedFor(User generatedFor) {
    this.generatedFor = generatedFor;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  //----toStringMethod
  @Override
  public String toString() {
    return "Referral [id=" + id + ", referralCode=" + referralCode + ", generatedFor=" + generatedFor + "]";
  } 
}