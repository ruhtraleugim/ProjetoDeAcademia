package com.academiaGenerica.academia.Repositories.Transações;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academiaGenerica.academia.Model.Transações.TransacoesModel;

public interface TransacoesRepository extends JpaRepository<TransacoesModel, Long>{
    
}
