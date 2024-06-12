package com.academiaGenerica.academia.Repositories.Planos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academiaGenerica.academia.Model.Planos.PlanosDeTreinoModel;

public interface PlanosDeTreinoRepository extends JpaRepository<PlanosDeTreinoModel, Long> {
    
}
