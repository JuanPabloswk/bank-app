package com.example.bankapplication.mapper;

import com.example.bankapplication.dto.account.AccountCreateDTO;
import com.example.bankapplication.enums.AccountStatus;
import com.example.bankapplication.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class AccountMapper {

    private final ClientServiceImpl clientServiceImpl;

    public Account createAccount(AccountCreateDTO accountCreateDTO) {
        return Account.builder()
                .createdAt(LocalDateTime.now())
                .accountStatus(AccountStatus.ACTIVE)
                .exemptGMF(accountCreateDTO.getExemptGMF())
                .client(clientServiceImpl.getByClientId(accountCreateDTO.getClientId()))
                .build();
    }
}
