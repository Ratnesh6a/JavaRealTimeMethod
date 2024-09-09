package com.example.medifizer.controller.request;

import com.example.medifizer.enums.Roles;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersRequestType {
    private String emailId;
    private String firstName;
    private String lastName;
    private Roles roles;
    private String password;
}
