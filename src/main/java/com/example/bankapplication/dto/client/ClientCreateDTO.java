package com.example.bankapplication.dto.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientCreateDTO {

    private String email;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String identificationType;
    private String identificationNumber;
}
