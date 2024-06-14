package com.academiaGenerica.academia.Repositories.Planos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academiaGenerica.academia.Model.Planos.PlanosDeTreinoModel;
@Repository
public interface PlanosDeTreinoRepository extends JpaRepository<PlanosDeTreinoModel, Long> {
    
}
