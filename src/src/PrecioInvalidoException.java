public class PrecioInvalidoException extends RuntimeException {
    public PrecioInvalidoException() {
        super("El precio es invalido (menor o igual a 0)");
    }
}