package com.example.medifizer.controller.request;

import com.example.medifizer.baseClass.BaseWSEntity;
import com.example.medifizer.enums.Roles;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Getter
@Setter
public class UsersRequestType extends BaseWSEntity {
    @Serial
    private static final long serialVersionUID = -5387899597114162854L;

    private String emailId;
    private String firstName;
    private String lastName;
    private Roles roles;
    private String password;
}
