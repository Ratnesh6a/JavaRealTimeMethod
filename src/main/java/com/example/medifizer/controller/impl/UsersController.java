package com.example.medifizer.controller.impl;

import com.example.medifizer.controller.request.UsersRequestType;
import com.example.medifizer.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/data")
@AllArgsConstructor
public class UsersController {
    private UsersService usersService;
    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody  UsersRequestType usersRequestType){
           usersService.createUser(usersRequestType);
        return ResponseEntity.ok().build();
    }

}
