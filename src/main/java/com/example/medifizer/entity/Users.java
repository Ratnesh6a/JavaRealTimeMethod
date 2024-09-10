package com.example.medifizer.entity;

import com.example.medifizer.baseClass.BaseDtoEntity;
import com.example.medifizer.enums.Roles;
import com.example.medifizer.enums.Token;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.context.annotation.Bean;

import java.io.Serial;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users extends BaseDtoEntity {
    @Serial
    private static final long serialVersionUID = -8246758844922160234L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private String emailId;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Roles roles;
    private String password;
    private String telephoneNo;
}
