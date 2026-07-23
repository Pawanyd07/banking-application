package com.pawan.bank.dto;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.pawan.bank.enums.Status;
import com.pawan.bank.enums.TransactionType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionResponseDTO {

    private String transactionReference;

    private TransactionType transactionType;

    private BigDecimal amount;

    private Status status;

    private String description;

    private BigDecimal balanceBefore;

    private BigDecimal balanceAfter;

    private LocalDateTime transactionDate;

}