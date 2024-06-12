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

@Entity(name = "PlanosDeTreino")
@Table(name = "PlanosDeTreino")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "idPlanosDeTreino")
public class PlanosDeTreinoModel {

    public String grupoDeMusculos;
    public String nomeDoExercicio;
    public int tempoEmMInutos;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idPlanosDeTreino;
}
