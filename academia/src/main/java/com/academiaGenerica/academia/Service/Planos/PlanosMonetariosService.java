package com.academiaGenerica.academia.Service.Planos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academiaGenerica.academia.Repositories.Planos.PlanosMonetariosRepository;

@Service
public class PlanosMonetariosService {

    @Autowired
    PlanosMonetariosRepository planosMonetariosRepository;
    
}
