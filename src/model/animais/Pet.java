package model.animais;

import enums.Porte;
import enums.TipoPet;

public abstract class Pet {
    private Porte porte;
    
    public Pet(Porte porte) {
        this.porte = porte;
    }
    
    protected abstract TipoPet getTipo();
    
}
