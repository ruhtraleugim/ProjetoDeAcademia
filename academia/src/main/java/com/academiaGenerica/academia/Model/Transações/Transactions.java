package com.academiaGenerica.academia.Model.Transações;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Transactions")
@Table(name = "Transactions")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "idTransaction")
public class Transactions {
    private String nome;
    private int cpf;
    private String planodeacademia;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTransaction;
}
