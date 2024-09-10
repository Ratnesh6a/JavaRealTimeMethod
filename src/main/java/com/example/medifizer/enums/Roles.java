package com.example.medifizer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum  Roles {
    ROLES_ADMIN(1,"Role_Admin"),
    ROLES_USER(2,"Role_User"),
    ROLES_MANGER(3,"Role_Manager"),
    ROLES_VIEWER(4,"Role_Viewer");

    Roles(int id, String roleData) {
        this.id = id;
        this.roleData = roleData;
    }

    private int id;
    private String roleData;


}
