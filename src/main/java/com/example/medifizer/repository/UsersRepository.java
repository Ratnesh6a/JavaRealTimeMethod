package com.example.medifizer.repository;

import com.example.medifizer.entity.userDataDetails.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UsersRepository extends JpaRepository<Users, UUID> {
    public Users findByEmailId(String emailId);
    public List<Users> findAll();


}
