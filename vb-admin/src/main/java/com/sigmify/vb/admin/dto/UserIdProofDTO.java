package com.sigmify.vb.admin.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import com.sigmify.vb.admin.entity.User;
import com.sigmify.vb.admin.entity.metadata.ProofType;

public class UserIdProofDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4689645908960601239L;
	private Long id;
	  
	  private Long userId;

	  private String uan;
	 
	  private String imagePath;
	  
	  private Integer proofType;
	  
	  private Long createdBy;
	  
	  private String creationDate;
	  
	  private String lastUpdateDate;
	  
	  private Long lastUpdateBy;
}
