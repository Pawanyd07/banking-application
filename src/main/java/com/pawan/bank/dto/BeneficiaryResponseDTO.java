package com.pawan.bank.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeneficiaryResponseDTO {

    private Long id;

    private String nickname;

    private String beneficiaryName;

    private String accountNumber;

    private String ifscCode;

    private String bankName;

}