package com.pawan.bank.dto;


import com.pawan.bank.enums.AccountType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAccountRequestDTO {

    @NotNull(message = "Account type is required")
    private AccountType accountType;

    @NotBlank(message = "Branch name is required")
    private String branchName;

    @NotBlank(message = "Currency is required")
    private String currency;

}