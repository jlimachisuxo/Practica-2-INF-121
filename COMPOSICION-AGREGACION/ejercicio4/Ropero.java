package ejercicio4;

public class Ropero {
    private String material;
    private Ropa[] ropas;
    private int nroRopas;

    // contructor
    public Ropero(String material) {
        this.material = material;
        this.ropas = new Ropa[20];
        this.nroRopas = 0;
    }

    // b) Adicionar N prendas al ropero
    public void adicionarPrendas(Ropa ropa){
        if (nroRopas < ropas.length) {
            this.ropas[nroRopas] = ropa;
            this.nroRopas++;
            System.out.println("Prenda añadida: " + ropa);

        }else{
            System.out.println("Error: El ropero esta lleno.");
        }
        
    }

    // c) Eliminar las prendas de material x o de tipo y
    public void eliminarPrendas(String materialX, String tipoY){
        System.out.println("Eliminando prendas de material " + materialX + " o de tipo " + tipoY);
        for (int i = 0; i < nroRopas; i++) {
            Ropa ropa = ropas[i];
            if (ropa.getMaterial().equalsIgnoreCase(materialX) || ropa.getTipo().equalsIgnoreCase(tipoY)) {
                System.out.println("Prenda eliminada: " + ropa);
                // Mover la última prenda a la posición actual
                ropas[i] = ropas[nroRopas - 1];
                ropas[nroRopas - 1] = null;
                nroRopas--;
                i--; // para revisar la prenda que se movió a esta posición
            }
        }
        System.out.println("");
    }

    // d) mostrar las prendas de materia X y de tipo Y
    public void mostrarPrendas(String materialX, String tipoY){
        System.out.println("Mostrando prendas de material " + materialX + " y de tipo " + tipoY);
        for (int i = 0; i < nroRopas; i++) {
            Ropa ropa = ropas[i];
            if (ropa.getMaterial().equalsIgnoreCase(materialX) && ropa.getTipo().equalsIgnoreCase(tipoY)) {
                System.out.println(ropa);
            }
        }
        System.out.println("");
    }

    // mostrar todas las prendas
    public void mostrarPrendas(){
        System.out.println("Mostrando todas las prendas:");
        for (int i = 0; i < nroRopas; i++) {
            System.out.println(ropas[i]);
        }
        System.out.println("");
    }
}
