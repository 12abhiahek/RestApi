package com.example.microservice.userDetailsService.Repository;

import com.example.microservice.userDetailsService.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,String>{


}
