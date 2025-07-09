package com.example.bankapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", nullable = false)
    private Long accountId;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_status", nullable = false)
    private AccountStatus accountStatus;

    @Column(name = "balance", nullable = false)
    private double balance = 0;

    @Enumerated(EnumType.STRING)
    @Column(name = "exempt_gmf", nullable = false)
    private ExemptGMF exemptGMF;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDate updatedAt;


    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
}
