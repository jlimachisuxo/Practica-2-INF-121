package ejercicio14;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>(); // Inicializa la lista de empleados
    }

    // Agregar varios empleados
    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
        System.out.println("Empleado " + empleado.getNombre() + " agregado a " + this.nombre);
    }

    // Mostrar la información de la empresa y sus empleados
    public void mostrarInformacion(){
        System.out.println("\n=== Informacion de la empresa ===");
        System.out.println("Nombre de la empresa: " + this.nombre);
        System.out.println("Total de empleados: " + this.empleados.size());

        if (this.empleados.isEmpty()) {
            System.out.println("La empresa no tiene empleados actualmente.");
            return;
        }
        System.out.println("--- Lista de empleados ---");
        for(Empleado e : empleados){
            System.out.println(e);
        }
        System.out.println("");
    }

    // Buscar un empleado por nombre
    public Empleado buscarEmpleado(String nombre){
        for(Empleado empl : empleados){
            if (empl.getNombre().equals(nombre)) {
                return empl;
            }
        }
        return null;
    }

    // Eliminar un empleado de la empresa por nombre
    public boolean eliminarEmpleado(String nombre){
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Calcular y mostrar el promedio salarial
    public void calcularPromSalarial(){
        if (this.empleados.isEmpty()) {
            System.out.println("No hay empleados para calcular el promedio salarial.");
            return;
        }

        double sumSalario = 0;
        for(Empleado e : empleados){
            sumSalario += e.getSalario();
        }

        double promedio = sumSalario / this.empleados.size();
        System.out.println("\n El promedio salarial de la empresa " + this.nombre +  " es Bs." + String.format("%2f", promedio) );
    }

    // Listar empleados con salario mayor a un valor dado
    public void listarSalarioMayor(double salarioMinimo){
        System.out.println("\n--- Empleados con salario mayor a Bs." + String.format("%2f", salarioMinimo) + " ---");
        boolean encontrado = false;
        for(Empleado e : empleados){
            if (e.getSalario() > salarioMinimo) {
                System.out.println(e);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron empleados con salario mayor a Bs." + String.format("%2f", salarioMinimo));
            System.out.println("");
        }
    }


}
