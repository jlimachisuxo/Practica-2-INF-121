package ejercicio6;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Pérez", 1000.00);
        cuenta.mostrarInfo();

        // 2. Realizar un depósito válido
        System.out.println("\n*** Intento de Depósito Válido ***");
        try{
            cuenta.deposiar(500.00);
            cuenta.mostrarInfo();
        }catch (IllegalArgumentException e){
            System.out.println("Error de depósito: " + e.getMessage());
        }

        System.out.println("\n*** Intento de Depósito Negativo ***");
        try {
            cuenta.deposiar(-100.00);
        } catch (IllegalArgumentException e) {
            System.err.println("Error de depósito: " + e.getMessage());
        }
        cuenta.mostrarInfo();


        System.out.println("\n*** Intento de Retiro Válido: Retirando Bs. 200.00 ***");
        try {
            cuenta.retirar(200.00);
            cuenta.mostrarInfo();
        } catch (FondosInsuficientesException e) {
            System.err.println("Error de retiro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error de retiro: " + e.getMessage());
        }

 
        System.out.println("\n*** Intento de Retiro Excesivo. Retiro = 2000.00 ***");
        try {
            cuenta.retirar(2000.00); 
        } catch (FondosInsuficientesException e) {
            // Captura la excepción personalizada
            System.err.println("Error de retiro (Fondos Insuficientes): " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error de retiro: " + e.getMessage());
        }
        cuenta.mostrarInfo();


        System.out.println("\n*** Intento de Retiro Negativo. Retiro = -50.00 ***");
        try {
            cuenta.retirar(-50.00); 
        } catch (FondosInsuficientesException e) {
            System.err.println("Error de retiro (Fondos Insuficientes): " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error de retiro: " + e.getMessage());
        }

        System.out.println("");
    }
}
