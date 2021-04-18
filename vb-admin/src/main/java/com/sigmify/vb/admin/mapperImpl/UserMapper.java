package com.sigmify.vb.admin.mapperImpl;

import com.sigmify.vb.admin.dto.UserDTO;
import com.sigmify.vb.admin.entity.User;
import com.sigmify.vb.admin.mapper.Mapper;

public class UserMapper implements Mapper<User, UserDTO> {

	@Override
	public UserDTO convert(User source) {
		
		return null;
	}

	@Override
	public User toEntity(UserDTO dto) {
		User user=new User();
	    user.setId(dto.getId());
	    user.setUserName(dto.getUserName());
	    user.setfName(dto.getfName());
	    user.setlName(dto.getlName());
	    user.setPhoto(dto.getPhoto());
		return user;
	}

	

	

}
