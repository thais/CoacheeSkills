package com.springapp.mvc.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT email FROM account a WHERE LOWER(a.email) = LOWER(:username) AND a.password = :password")
    public List<String> findValidUser(@Param("username") String email, @Param("password") String password);
}