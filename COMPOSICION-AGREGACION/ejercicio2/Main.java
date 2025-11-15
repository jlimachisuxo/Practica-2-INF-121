public class Main {
    public static void main(String[] args) {
        System.out.println("---Instancia de departamentos y empleados---");

        // creando empleados
        Empleado emp1 = new Empleado("Ana Gomez", "Desarrolladora", 50000);
        Empleado emp2 = new Empleado("Luis Perez", "Diseñador", 45000);
        Empleado emp3 = new Empleado("Marta Ruiz", "Gerente", 70000);
        Empleado emp4 = new Empleado("Carlos Lopez", "Analista", 48000);
        Empleado emp5 = new Empleado("Sofia Torres", "Desarrolladora", 52000);

        // instancia de dos departamentos
        // departamento 1
        Departamento depto1 = new Departamento("Tecnología", "Desarrollo de Software");
        depto1.agregarEmpleado(emp1);
        depto1.agregarEmpleado(emp2);
        depto1.agregarEmpleado(emp3);
        depto1.agregarEmpleado(emp4);
        depto1.agregarEmpleado(emp5);
        System.out.println("\nDepartamento 1 creado: " + depto1);

        // departamento 2
        Departamento depto2 = new Departamento("Recursos Humanos", "Gestión del Talento");
        System.out.println("\nDepartamento 2 creado: " + depto2);
        System.out.println("");

        // b) Agregar el metodo mostrarEmpleados()
        System.out.println("---Mostrando empleados de cada departamento---");
        depto1.mostrarEmpleados();
        depto2.mostrarEmpleados();
        System.out.println("-------------------------------");

        // c) Implementar cambioSalario()
        System.out.println("---Aplicando cambios de salario: Aumento del 10% al departamento de Tecnologia---");
        depto1.cambioSalario(10.0);
        depto1.mostrarEmpleados();
        System.out.println("");

        // d) Verificar si algun empleado del departamento 1 pertenece al departamento 2
        System.out.println("---Verificando si algun empleado del departamento 1 pertenece al departamento 2---");
        boolean encontrado = false;

        for(Empleado emppleado : depto1.getEmpleados()){
            if (depto2.getEmpleados().contains(emppleado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Si hay empleados del departamento 1 que pertenecen al departamento 2.");

        } else{
            System.out.println("No hay empleados del departamento 1 que pertenezcan al departamento 2.");
        }
        System.out.println("");

        // e) Mover los empleados del departamento 1 al departamento 2
        System.out.println("---Moviendo empleados del departamento 1 al departamento 2---");
        depto2.getEmpleados().addAll(depto1.getEmpleados());
        // vaciar empleados del departamento 1
        depto1.getEmpleados().clear();

        System.out.println("Estado de los departamentos despues del movimiento:");
        System.out.println("Estado final del departamento: " + depto1.getNombre());
        depto1.mostrarEmpleados();
        System.out.println("Estado final del departamento: " + depto2.getNombre());
        depto2.mostrarEmpleados();
        System.out.println("");


    }
}
