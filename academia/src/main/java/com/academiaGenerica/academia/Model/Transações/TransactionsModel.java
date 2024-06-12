package com.academiaGenerica.academia.Model.Transações;

import com.academiaGenerica.academia.Model.Planos.PlanosMonetariosModel;
import com.academiaGenerica.academia.Model.User.AlunoModel;
import com.academiaGenerica.academia.Model.User.FuncionarioModel;

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

@Entity(name = "Transaction")
@Table(name = "Transaction")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "idTransaction")
public class TransactionsModel {

    private AlunoModel alunoNome;
    private FuncionarioModel cpf;
    private PlanosMonetariosModel planodeacademia;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTransaction;
}
