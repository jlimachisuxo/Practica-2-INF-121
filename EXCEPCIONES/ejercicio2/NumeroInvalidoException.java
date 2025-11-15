public class NumeroInvalidoException extends Exception{
    // constructor
    public NumeroInvalidoException(String mensaje){
        super(mensaje);
    }
    
    // constructor sin argumento
    public NumeroInvalidoException(){
        super("Este valor no es un número entero válido.");
    }
}