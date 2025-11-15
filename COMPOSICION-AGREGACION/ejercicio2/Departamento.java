import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private String area;
    private List<Empleado> empleados;
    // constructor
    public Departamento(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados(){
        return empleados;
    }

    // metodo agregar empleados
    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    // metodo mostrar empleados
    public void mostrarEmpleados(){
        System.out.println("Empleados del departamento: " + nombre + " (" + area + ")");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en este departamento.");
            return;
        }
        for(Empleado emp : empleados){
            System.out.println("- " + emp);
        }
        System.out.println("---------------------------");
    }

    // metodo cambio de salario
    public void cambioSalario(double porcentaje){
        System.out.println("\nAplicando " + (porcentaje > 0 ? "aumento" : "disminucion") + " del " + Math.abs(porcentaje) + "% a los empleados de " + nombre );
        for(Empleado empp : empleados){
            double aumento = empp.getSueldo() * (porcentaje / 100.0);
            empp.setSueldo(empp.getSueldo() + aumento);
        }
        System.out.println("Salarios actualizados.");
    }

    @Override
    public String toString() {
        return "Departamento[" +
                "nombre=" + nombre +
                ", area=" + area +
                ", empleados=" + empleados +
                ']';
    }
}