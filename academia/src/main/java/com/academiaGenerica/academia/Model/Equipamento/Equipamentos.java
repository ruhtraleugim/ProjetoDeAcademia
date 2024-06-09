package com.academiaGenerica.academia.Model.Equipamento;

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

@Entity(name = "Equipamentos")
@Table(name = "Equipamentos")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "idEquipamento")
public class Equipamentos {
    private String nomeEquipamento;
    private String descricao;
    private int quantidadeDisponivel;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipamento;
}
