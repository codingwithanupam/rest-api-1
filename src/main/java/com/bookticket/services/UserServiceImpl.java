package com.bookticket.services;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookticket.bindings.MyUserDto;
import com.bookticket.bindings.MyUserResponseDto;
import com.bookticket.entities.MyUser;
import com.bookticket.repositories.UserRepository;

@Repository
public class UserServiceImpl implements UserService{
	@Autowired
     private UserRepository userRepository;
	
	@Override
	public boolean saveUser(MyUserDto myUserDto) {
		System.out.println("inside saveUser() of service class");
		MyUser myUser= new MyUser();
		if(myUser!=null) {
		String id=UUID.randomUUID().toString();
		myUser.setUser_id(id);
		myUser.setUser_name(myUserDto.getUser_name());
		myUser.setUser_gender(myUserDto.getUser_gender());
		myUser.setUser_password(myUserDto.getUser_password());
		myUser.setUser_phone(myUserDto.getUser_phone());
		myUser.setUser_dob(myUserDto.getUser_dob());
		
		MyUser saved_user = userRepository.save(myUser);
		 if(saved_user!=null)
			 return true;
		}
		
		
		return false;
	}

	@Override
	public MyUserResponseDto getUserById(String user_id) {
		System.out.println("getUserById in service class");
		Optional<MyUser> findById = userRepository.findById(user_id);
		if(findById.isPresent()){
			  MyUser myUser = findById.get(); 
			  MyUserResponseDto dto= new MyUserResponseDto();
			   dto.setUser_id(user_id);
			   dto.setUser_name(myUser.getUser_name());
			   dto.setUser_password(myUser.getUser_password());
			   dto.setAge(Period.between(myUser.getUser_dob(), LocalDate.now()));
			   
			   return dto;
		}
                    
		return null;
	}

	@Override
	public boolean updateUserById(MyUserDto myUserDto, Integer user_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletUserById(Integer user_id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
    
}
