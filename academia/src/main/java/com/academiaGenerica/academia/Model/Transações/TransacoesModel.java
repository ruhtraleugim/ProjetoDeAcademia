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

@Entity(name = "transaction")
@Table(name = "transaction")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "idTransaction")
public class TransacoesModel {
    
    private String razaoPagamento;
    private Long cpfDoRecebedor;
    private Long cpfDoEnviador;
    private double valorDoPagamento;    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTransaction;
}
