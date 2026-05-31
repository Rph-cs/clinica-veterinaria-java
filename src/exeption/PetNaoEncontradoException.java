package exeption;

public class PetNaoEncontradoException extends RuntimeException {
    public PetNaoEncontradoException(String message) {
        super(message);
    }
}
