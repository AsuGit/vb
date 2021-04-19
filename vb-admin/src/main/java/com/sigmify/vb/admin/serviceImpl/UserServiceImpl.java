package com.sigmify.vb.admin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmify.vb.admin.dto.UserDTO;
import com.sigmify.vb.admin.entity.User;
import com.sigmify.vb.admin.entity.metadata.UserType;
import com.sigmify.vb.admin.mapper.Mapper;
import com.sigmify.vb.admin.mapperImpl.UserMapper;
import com.sigmify.vb.admin.repositories.IUserRepository;
import com.sigmify.vb.admin.repositories.IUserTypeRepository;
import com.sigmify.vb.admin.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
    
	@Autowired	
    private IUserRepository userRepo;
	
	@Autowired
	private IUserTypeRepository userTypeRepo;
	
	Mapper<User, UserDTO> userMapper;

	@Override
	public Long saveUser(UserDTO userDto) throws Exception {
		userMapper=new UserMapper();
		UserType userType=new UserType();
		User user=userMapper.toEntity(userDto);
		if (userDto.getUsertype()!=null) {
			userType=userTypeRepo.findByName(userDto.getUsertype().getName());
	    }
		user.setUserType(userType);
		userRepo.save(user);
		return user.getId();
	}
}
