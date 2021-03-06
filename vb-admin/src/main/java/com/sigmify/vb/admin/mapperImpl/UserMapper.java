package com.sigmify.vb.admin.mapperImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.sigmify.vb.admin.dto.UserDTO;
import com.sigmify.vb.admin.entity.User;
import com.sigmify.vb.admin.entity.metadata.UserType;
import com.sigmify.vb.admin.mapper.Mapper;

public class UserMapper implements Mapper<User, UserDTO> {

	@Override
	public UserDTO convert(User source) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User toEntity(UserDTO dto) throws Exception {
		File photo=new File(dto.getPhoto());
		User user=new User();
	    user.setId(dto.getId());
	    user.setUserName(dto.getUserName());
	    user.setfName(dto.getfName());
	    user.setlName(dto.getlName());
	    user.setPhoto(photo);
	    user.setUserType(dto.getUsertype());
	    user.setCreateDate(dto.getCreateDate());
	    user.setLastUpdateDate(dto.getLastUpdateDate());
	    user.setActive(true);
	    user.setLastUpdateBy(dto.getLastUpdateBy());
		return user;
	}

	

	

}
