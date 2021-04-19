package com.sigmify.vb.admin.dto;

import java.io.Serializable;

public class ReferralDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 742585157638870238L;
	private Long id;
	private String referralCode;
	private Long generatedFor;
	//----getterSetter method
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
	public Long getGeneratedFor() {
		return generatedFor;
	}
	public void setGeneratedFor(Long generatedFor) {
		this.generatedFor = generatedFor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
