package com.academiaGenerica.academia.Repositories.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academiaGenerica.academia.Model.User.AlunoModel;
@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
    
}
