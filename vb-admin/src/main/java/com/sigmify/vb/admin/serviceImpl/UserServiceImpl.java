package com.sigmify.vb.admin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmify.vb.admin.dto.UserDTO;
import com.sigmify.vb.admin.entity.User;
import com.sigmify.vb.admin.mapper.Mapper;
import com.sigmify.vb.admin.mapperImpl.UserMapper;
import com.sigmify.vb.admin.repositories.IUserRepository;
import com.sigmify.vb.admin.service.IUserService;
<<<<<<< HEAD
@Service
public class UserServiceImpl implements IUserService {
    
	@Autowired	
    private IUserRepository userRepo;
	
	Mapper<User, UserDTO> userMapper;
=======

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository userRepo;
	private Mapper<User, UserDTO> userMapper;

>>>>>>> branch 'master' of https://github.com/AsuGit/vb.git
	@Override
	public Long saveUser(UserDTO userDto) throws Exception {
		userMapper=new UserMapper();
		User user=userMapper.toEntity(userDto);
		userRepo.save(user);
		return user.getId();
	}
	

}
