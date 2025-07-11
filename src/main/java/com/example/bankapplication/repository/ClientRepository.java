package com.example.bankapplication.repository;

import com.example.bankapplication.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findByNames(String names);
    Optional<Client> findByClientId(Long clientId);
}
