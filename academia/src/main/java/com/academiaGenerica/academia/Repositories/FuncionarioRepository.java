package com.academiaGenerica.academia.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academiaGenerica.academia.Model.User.FuncionarioModel;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    
}
