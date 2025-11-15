package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // agregar productos
        try{
            inv.agregarProducto(new Producto("A001", "Laptop G-Pro", 1200.50, 15));
            inv.agregarProducto(new Producto("B002", "Mouse Óptico", 25.00, 50));
            inv.agregarProducto(new Producto("C003", "Monitor 27", 350.99, 5));
        }catch (DatosProductoInvalidoException e){
            System.out.println("Error al agregar producto inicial: " + e.getMessage());
        }

        inv.mostrarInventario();
        System.out.println("");

        System.out.println("--- Pruebas de agregar productos con errores ---");
        try{
            inv.agregarProducto(new Producto("A001", "Smartphone X", 800.00, 20));
        }catch (DatosProductoInvalidoException e){
            System.out.println("Error (código duplicado): " + e.getMessage());
        }
        System.out.println("");

        System.out.println("--- Pruebas de buscar producto ---");
        try{
            inv.buscarProducto("Z999");
        }catch (ProductoNoEncontradoException e){
            System.out.println("Error (No encontrado): " + e.getMessage());
        }
        System.out.println("");

        System.out.println("--- Pruebas de vender producto ---");
        try{
            inv.venderProducto("A001", 3);
        }catch (ProductoNoEncontradoException | StockInsuficienteException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            inv.venderProducto("C003", 10);
        }catch (ProductoNoEncontradoException | StockInsuficienteException e){
            System.out.println("Error (Stock insuficiente): " + e.getMessage());
        }

        System.out.println("");
        inv.mostrarInventario();
    }
}
