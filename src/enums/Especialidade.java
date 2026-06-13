package enums;

public enum Especialidade {
    CLINICO_GERAL("Clínico geral"),
    DERMATOLOGIA("Dermatologia"),
    ORTOPEDIA("Ortopedia");
    
    private final String nomeExibicao;
    
    Especialidade(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
