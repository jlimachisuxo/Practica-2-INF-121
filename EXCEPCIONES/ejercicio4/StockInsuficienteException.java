package ejercicio4;

public class StockInsuficienteException extends Exception {
    public StockInsuficienteException(String nombre, int stockActual, int cantSolicitada){
        super("Error: Stock insuficiente para " + nombre + "  Stock actual: " + stockActual + "  Solicitado: " + cantSolicitada);
    }
}
