package com.example.bankapplication.dto.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientUpdateDTO {

    private String email;
    private String lastName;
    private String firstName;
}
