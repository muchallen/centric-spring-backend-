package com.example.demo.dao;

import com.example.demo.model.Sale;
import com.example.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users, Long> {

}
