package com.academiaGenerica.academia.Repositories.Transações;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academiaGenerica.academia.Model.Transações.TransacoesModel;
@Repository
public interface TransacoesRepository extends JpaRepository<TransacoesModel, Long>{
    
}
