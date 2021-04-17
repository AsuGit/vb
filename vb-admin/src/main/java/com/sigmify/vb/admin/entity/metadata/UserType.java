package com.sigmify.vb.admin.entity.metadata;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(schema = "admin",name="user_type")
public class UserType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -652859095263750353L;
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_type_id_seq")
	  @SequenceGenerator(schema = "admin", name = "user_type_id_seq",
	      sequenceName = "user_type_id_seq", allocationSize = 1)
	  private Integer id;
	  
	  @Column(name = "name",length = 50)
	  private String name;

	  @Column(name="description",length = 80)
	  private String description;

//-----getter setter method
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	  
}
