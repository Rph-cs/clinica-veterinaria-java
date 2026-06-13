package model;

import model.animais.Pet;

import java.util.ArrayList;
import java.util.List;

public class Dono extends Pessoa {
    List<Pet> pets;
    
    public Dono(String nome, String cpf) {
        super(nome, cpf);
        this.pets = new ArrayList<>();
    }
    

}
