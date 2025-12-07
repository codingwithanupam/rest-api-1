package com.bookticket.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bookticket.entities.MyUser;

public interface UserRepository extends CrudRepository<MyUser, String>{

}
