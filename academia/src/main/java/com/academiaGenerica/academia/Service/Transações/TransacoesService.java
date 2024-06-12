package com.academiaGenerica.academia.Service.Transações;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academiaGenerica.academia.Repositories.Transações.TransacoesRepository;

@Service
public class TransacoesService {

    @Autowired
    TransacoesRepository transacoesRepository;
    
}
