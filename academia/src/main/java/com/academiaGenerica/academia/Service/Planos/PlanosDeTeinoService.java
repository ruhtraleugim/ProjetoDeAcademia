package com.academiaGenerica.academia.Service.Planos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academiaGenerica.academia.Repositories.Planos.PlanosDeTreinoRepository;

@Service
public class PlanosDeTeinoService {

    @Autowired
    PlanosDeTreinoRepository planosDeTreinoRepository;

}
