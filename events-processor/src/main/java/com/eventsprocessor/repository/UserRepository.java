package com.eventsprocessor.repository;

import com.eventsprocessor.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, String> {
}
