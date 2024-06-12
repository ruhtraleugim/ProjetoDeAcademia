package com.academiaGenerica.academia.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academiaGenerica.academia.Repositories.User.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

}
