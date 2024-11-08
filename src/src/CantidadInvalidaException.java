public class CantidadInvalidaException extends RuntimeException {
    public CantidadInvalidaException() {
        super("La cantidad invalida (no se pueden cantidades negativos)");
    }
}