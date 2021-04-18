package com.sigmify.vb.admin.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sigmify.vb.admin.entity.User;

public interface IUserRepository extends CrudRepository<User,Long>{

}
