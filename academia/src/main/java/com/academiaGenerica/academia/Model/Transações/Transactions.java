package com.academiaGenerica.academia.Model.Transações;

public class Transactions {
    private String nome ;
     private int cpf;
   private  String planodeacademia;

   public Transactions(String nome, int cpf, String planodeacademia) {
        this.nome = nome;
        this.cpf = cpf;
        this.planodeacademia = planodeacademia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getPlanodeacademia() {
        return planodeacademia;
    }
    
    public void setPlanodeacademia(String planodeacademia) {
        this.planodeacademia = planodeacademia;
    }





    {
        
    }
}
