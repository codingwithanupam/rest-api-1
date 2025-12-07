package com.bookticket.services;

import com.bookticket.bindings.MyUserDto;
import com.bookticket.bindings.MyUserResponseDto;

public interface UserService {
	public boolean saveUser(MyUserDto myUserDto);
	public MyUserResponseDto getUserById(String user_id);
	public boolean updateUserById(MyUserDto myUserDto, Integer user_id);
	public boolean deletUserById(Integer user_id);
}
