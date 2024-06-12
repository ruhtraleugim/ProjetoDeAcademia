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

@Entity(name = "PlanosMonetarios")
@Table(name = "PlanosMonetarios")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "idPlanosMonetarios")
public class PlanosMonetariosModel {
    
    private String tipoDoPlano;
    private String descricao;
    private double preco;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPlanosMonetarios;
}
