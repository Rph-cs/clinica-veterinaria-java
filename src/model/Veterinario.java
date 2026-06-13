package model;

import enums.Especialidade;

public class Veterinario extends Pessoa {
    private Especialidade especialidade;
    
    public Veterinario(String nome, String cpf, Especialidade especialidade) {
        super(nome, cpf);
        
        this.especialidade = especialidade;
    }
}
