package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
