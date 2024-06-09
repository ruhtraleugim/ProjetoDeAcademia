package com.academiaGenerica.academia.Model.Planos;

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

@Entity(name = "Planos")
@Table(name = "Planos")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "idPlano")
public class Planos {
    private String nomePlano;
    private String descricao;
    private double precoMensal;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPlano;
}
