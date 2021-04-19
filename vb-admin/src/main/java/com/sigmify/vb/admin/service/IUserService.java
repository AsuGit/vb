package com.sigmify.vb.admin.service;

import com.sigmify.vb.admin.dto.UserDTO;

public interface IUserService {
	public Long saveUser(UserDTO userDto)throws Exception;
}
