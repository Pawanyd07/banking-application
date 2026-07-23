package com.pawan.bank.dto;

import com.pawan.bank.enums.Role;
import com.pawan.bank.enums.UserStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Role role;

    private UserStatus status;

}