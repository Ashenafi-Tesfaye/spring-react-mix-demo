package com.AGrespapi.AGrespapidemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AGrespapi.AGrespapidemo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);
}
