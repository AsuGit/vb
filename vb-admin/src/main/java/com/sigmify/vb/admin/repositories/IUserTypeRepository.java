package com.sigmify.vb.admin.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sigmify.vb.admin.entity.metadata.UserType;

public interface IUserTypeRepository extends CrudRepository<UserType, Integer> {
	public UserType findByName(String name);
}
