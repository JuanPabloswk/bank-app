package com.example.bankapplication.dto.account;

import com.example.bankapplication.enums.ExemptGMF;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountCreateDTO {

    private ExemptGMF exemptGMF;
    private String clientId;
}
