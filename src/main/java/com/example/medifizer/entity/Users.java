package com.example.medifizer.entity;

import com.example.medifizer.enums.Roles;
import com.example.medifizer.enums.Token;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.hibernate.annotations.Type;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String emailId;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Roles roles;
    private String password;
}
