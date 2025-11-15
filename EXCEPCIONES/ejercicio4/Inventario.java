package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario(){
        this.productos = new ArrayList<>();
    }

    // Método auxiliar para buscar un producto
    private Producto buscarProductoAux(String codigo){
        for(Producto p : productos){
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    // c) Implementar agregarProducto(Producto p)
    public void agregarProducto(Producto p) throws DatosProductoInvalidoException{
        if (p.getPrecio() < 0) {
            throw new DatosProductoInvalidoException("El precio no puede ser negativo: " + p.getPrecio());
        }
        if (p.getStock() < 0) {
            throw new DatosProductoInvalidoException("El stock no puede ser negativo: " + p.getStock());
        }

        if (buscarProductoAux(p.getCodigo()) != null) {
            throw new DatosProductoInvalidoException("El códigp " + p.getCodigo() + " ya existe en el inventario.");

        }

        productos.add(p);
        System.out.println("Agregado: " + p.getNombre());
    }

    // d) Implementar buscarProducto(String codigo)
    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException{
        Producto resultado = buscarProductoAux(codigo);

        if (resultado != null) {
            return resultado;
        }else{
            throw new ProductoNoEncontradoException(codigo);
        }
    }

    // e) Implementar venderProducto(String codigo, int cantidad)
    public void venderProducto(String codigo, int cantidad) throws ProductoNoEncontradoException, StockInsuficienteException{
        Producto p = buscarProducto(codigo);

        if (p.getStock() < cantidad) {
            throw new StockInsuficienteException(p.getNombre(), p.getStock(), cantidad);
        }

        p.setStock(p.getStock() - cantidad);
        System.out.println("    Venta exitosa: " + cantidad + " unidades de " + p.getNombre());
        System.out.println("    Nuevo Stock: " + p.getStock());
        
    }

    public void mostrarInventario(){
        System.out.println("---- INVENTARIO ACTUAL " + productos.size() + " productos ----");
        if (productos.isEmpty()) {
            System.out.println("Inventario vacío.");
        }else{
            for(Producto p: productos){
                System.out.println(p);
            }
        }
        System.out.println("");
    }
}
