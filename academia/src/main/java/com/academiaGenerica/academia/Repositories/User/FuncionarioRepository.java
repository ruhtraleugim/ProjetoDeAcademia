package com.academiaGenerica.academia.Repositories.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academiaGenerica.academia.Model.User.FuncionarioModel;
@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    
}
