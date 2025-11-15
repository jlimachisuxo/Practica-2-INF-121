package ejercicio4;

public class DatosProductoInvalidoException extends Exception {
    public DatosProductoInvalidoException(String mensaje){
        super("Error de datos del producto: " + mensaje);
    }
}
