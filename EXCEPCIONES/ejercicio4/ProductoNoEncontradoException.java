package ejercicio4;

public class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String codigo){
        super("Error: Producto con código " + codigo + " no encontrado en el inventario.");
    }
}
