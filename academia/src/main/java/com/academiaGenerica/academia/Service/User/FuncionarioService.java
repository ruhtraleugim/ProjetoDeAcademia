package com.academiaGenerica.academia.Service.User;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academiaGenerica.academia.Repositories.User.FuncionarioRepository;
import com.academiaGenerica.academia.Model.User.FuncionarioModel;
@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> GetAll(){
        return funcionarioRepository.findAll();
    }
    public Optional<FuncionarioModel> GetById(Long id){
        return funcionarioRepository.findById(id);
    }
    public FuncionarioModel CreateNewUser(FuncionarioModel newFunciorario){
        return funcionarioRepository.save(newFunciorario);
    }
    public void DeleteFuncionario(FuncionarioModel idFuncionario){
        funcionarioRepository.delete(idFuncionario);
    }
    public FuncionarioModel UpadeteFuncionario(Long idFuncionario, FuncionarioModel funcionario){
        funcionario.setIdFuncionario(idFuncionario);
        DeleteFuncionario(funcionario);
        return CreateNewUser(funcionario);
    }
}
