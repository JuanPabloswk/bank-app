package com.example.bankapplication.dto.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {

    private Long amount;
    private Long sourceAccountId;
    private Long destinationAccountId;
}
