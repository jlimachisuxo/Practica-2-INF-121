package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Ropero ropero = new Ropero("Madera");
        // adicionando 5 prendas
        System.out.println("Adicionando prendas:");
        ropero.adicionarPrendas(new Ropa("Camisa", "Algodon"));
        ropero.adicionarPrendas(new Ropa("Pantalon", "Jean"));
        ropero.adicionarPrendas(new Ropa("Falda", "Seda"));
        ropero.adicionarPrendas(new Ropa("Camisa", "Seda"));
        ropero.adicionarPrendas(new Ropa("Chaqueta", "Cuero"));
        System.out.println("");

        ropero.mostrarPrendas();

        // eliminando prendas de material Seda o de tipo Pantalon
        ropero.eliminarPrendas("Seda", "Pantalon");
        ropero.mostrarPrendas();

        // mostrando prendas de material Algodon y de tipo Camisa
        ropero.mostrarPrendas("Algodon", "Camisa");
    }
}
