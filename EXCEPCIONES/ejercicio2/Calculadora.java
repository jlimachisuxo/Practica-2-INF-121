public class Calculadora {
    public static int sumar(int a, int b){
        return a + b;
    }

    public static int restar(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static double dividir(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero.");
        }
        return (double) a / b;
    }

    // Método para convertir String a int con excepción personalizada
    public static int convertirEntero(String cadena) throws NumeroInvalidoException{
        try{
            return Integer.parseInt(cadena);
        } catch (NumberFormatException e){
            throw new NumeroInvalidoException("El texto " + cadena + " no es un formato numérico válido para un entero.");
        }
    }

    
    //-----------PROGRAMA PRINCIPAL--------------------
    public static void main(String[] args) {
        System.out.println("--- Pruebas de la calculadora ---");

        System.out.println("\n Pruebas de operaciones básicas: ");
        System.out.println("Suma (10 + 6): " + sumar(10, 6));
        System.out.println("Restar (10 - 7): " + restar(10, 7));
        System.out.println("Multiplicación (5 * 8): " + multiplicar(5, 8));

        // Prueba del método dividir (caso correcto)
        try{
            System.out.println("Divición (10 / 5): " + dividir(10, 5));
        }catch (ArithmeticException e){
            System.out.println("Divición (10 / 5) - Error: " + e.getMessage());
        }

        // Prueba del método dividir (caso de error: división por cero)
        System.out.println("\n Prueba de error, división por cero");
        try{
            System.out.println("División (5 / 0 ): " + dividir(5, 0));
        }catch (ArithmeticException e){
            System.out.println("División (5 / 0 ) - Error capturado: " + e.getMessage());
        }

        // Prueba del método convertirAEntero (caso correcto)
        System.out.println("\n Prueba de conversión a entero:");
        try{
            int numero = convertirEntero("123");
            System.out.println("Conversión de '123': " + numero);
        }catch (NumeroInvalidoException e){
            System.out.println("Conversión de '123' - Error: " + e.getMessage());
        }

        // Prueba del método convertirAEntero (caso de error: no numérico)
        System.out.println("\n Prueba de Error: Conversión inválida");
        try{
            int numero = convertirEntero("abc");
            System.out.println("Conversión de 'abc': " + numero);
        }catch (NumeroInvalidoException e){
            System.out.println("Conversión de 'abc' - Error capturado: " + e.getMessage());
        }

        System.out.println("");
        
    }

}
