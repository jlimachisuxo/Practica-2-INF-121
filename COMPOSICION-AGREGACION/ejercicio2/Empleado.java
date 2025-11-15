import java.util.Objects;

public class Empleado {
    private String nombre;
    private String cargo;
    private double sueldo;
    // contructor
    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    // getters y setters
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado[" +
                "nombre=" + nombre +
                ", cargo=" + cargo +
                ", sueldo=" + sueldo +
                ']';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) &&
               Objects.equals(cargo, empleado.cargo) &&
               Double.compare(empleado.sueldo, sueldo) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cargo, sueldo);
    }
}
