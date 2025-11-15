package ejercicio14;

public class AplicacionEmpresa {
    public static void main(String[] args) {
        Empresa emp1 = new Empresa("TecnoSoluciones S.A.");

        emp1.agregarEmpleado(new Empleado("Luis Gómez", "Desarrollador Senior", 60000.50));
        emp1.agregarEmpleado(new Empleado("Carlos Ruiz", "Diseñador Junior", 35000.00));
        emp1.agregarEmpleado(new Empleado("Elena Vázquez", "Analista QA", 45000.75));
        emp1.agregarEmpleado(new Empleado("Ana Pérez", "Gerente", 75000.00));

        emp1.mostrarInformacion();

        String nomBuscar = "Luis Gómez";
        System.out.println("\n--- Busqueda del empleado " + nomBuscar);
        Empleado encontrado = emp1.buscarEmpleado(nomBuscar);

        if (encontrado != null) {
            System.out.println("Empleado encontrado: " + encontrado);
        } else{
            System.out.println("Empleado con nombre " + nomBuscar + " no encontrado. ");

        }

        System.out.println("\n--- Promedio salarial ---");
        emp1.calcularPromSalarial();

        System.out.println("\n --- Listar salarios mayores a un valor");
        emp1.listarSalarioMayor(50000.00);

        System.out.println("\n--- Eliminación de un empleado");
        String nomEliminar = "Carlos Ruiz";
        boolean eliminado = emp1.eliminarEmpleado(nomEliminar);

        if (eliminado) {
            System.out.println("Empleado " + nomEliminar + " ha sido eleiminado.");
        } else{
            System.out.println("No se pudo eliminar al empleado " + nomEliminar);
        }

        System.out.println("\n--- Información después de la eliminación ---");
        emp1.mostrarInformacion();
        

    }
}
