package com.example.medifizer.controller.impl;

import com.example.medifizer.baseClass.BaseWSEntity;
import com.example.medifizer.controller.request.UsersRequestType;
import com.example.medifizer.entity.userDataDetails.Users;
import com.example.medifizer.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serial;
import java.util.List;

@RestController
@RequestMapping("user/data")
@AllArgsConstructor
public class UsersController extends BaseWSEntity {
    @Serial
    private static final long serialVersionUID = 2084609303805577864L;

    private UsersService usersService;
    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody  UsersRequestType usersRequestType){
           usersService.createUser(usersRequestType);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findAllUsers")
    public List<Users> findAllUsers(){
        return usersService.findAllUsers();
    }


}
