public class ProductoInvalidoException extends RuntimeException {
    public ProductoInvalidoException() {
        super("Tienes que rellenar el dato nombre del producto ");
    }
}
