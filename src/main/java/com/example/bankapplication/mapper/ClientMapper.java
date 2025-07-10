package com.example.bankapplication.mapper;

import com.example.bankapplication.dto.client.ClientCreateDTO;
import com.example.bankapplication.model.Client;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ClientMapper {

    public Client createClient(ClientCreateDTO clientCreateDTO) {
        return Client.builder()
                .creationDate(LocalDateTime.now())
                .email(clientCreateDTO.getEmail())
                .names(clientCreateDTO.getFirstName())
                .lastNames(clientCreateDTO.getLastName())
                .birthDate(clientCreateDTO.getBirthDate())
                .identificationType(clientCreateDTO.getIdentificationType())
                .identificationNumber(clientCreateDTO.getIdentificationNumber())
                .build();
    }
}
