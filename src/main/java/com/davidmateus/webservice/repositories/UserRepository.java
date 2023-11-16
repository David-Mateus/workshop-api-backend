package com.davidmateus.webservice.repositories;

import com.davidmateus.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
