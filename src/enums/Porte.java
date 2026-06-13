package enums;

public enum Porte {
    PEQUENO("Pequeno"),
    MEDIO("Medio"),
    GRANDE("Grande");
    
    private final String nomeExibicao;
    
    Porte(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
