package com.academiaGenerica.academia.Repositories.User;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academiaGenerica.academia.Model.User.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
    
}