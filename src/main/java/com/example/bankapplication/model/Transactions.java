package com.example.bankapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "transaction_id", nullable = false)
    private Long transactionId;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "trasaction_date", nullable = false)
    private LocalDateTime trasactionDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "operation_type", nullable = false)
    private OperationType operationType;


    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Client client;
}
