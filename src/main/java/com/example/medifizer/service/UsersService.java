package com.example.medifizer.service;

import com.example.medifizer.controller.request.UsersRequestType;
import com.example.medifizer.entity.userDataDetails.Users;
import com.example.medifizer.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;
    public void createUser (UsersRequestType usersRequestType){
        Users users = new Users();
        users.setEmailId(usersRequestType.getEmailId());
        users.setFirstName(usersRequestType.getFirstName());
        users.setLastName(usersRequestType.getLastName());
        users.setRoles(usersRequestType.getRoles());
        users.setPassword(usersRequestType.getPassword());
        usersRepository.save(users);
    }

}
