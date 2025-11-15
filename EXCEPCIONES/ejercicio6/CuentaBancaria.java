package ejercicio6;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void deposiar(double monto){
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso de: Bs." + monto);
        }else {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) throws FondosInsuficientesException{
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        if (monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso de: Bs." + this.saldo);
        }else{
            throw new FondosInsuficientesException(
                "Fondos insuficientes. Saldo actual: Bs." + this.saldo + " Monto solicitado Bs." + monto
            );
        }
    }

    public void mostrarInfo(){
        System.out.println("\n--- Información de la cuenta ---");
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Titular: " + this.titular);
        System.out.printf("Saldo: Bs.%.2f%n", this.saldo);
        System.out.println("");
    }

    public double getSaldo() {
        return saldo;
    }
}
