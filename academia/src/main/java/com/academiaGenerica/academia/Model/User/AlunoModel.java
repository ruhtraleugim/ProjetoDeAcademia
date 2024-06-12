package com.academiaGenerica.academia.Model.User;

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

@Entity(name = "Aluno")
@Table(name = "Aluno")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "idAluno")
public class AlunoModel {
    
    private String nome;
    private String cpf;
    private String cel;
    private String email;
    private String aulas;
    private double peso;
    private double altura;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAluno;
}
