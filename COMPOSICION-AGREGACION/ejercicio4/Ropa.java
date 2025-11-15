package ejercicio4;

public class Ropa {
    private String tipo;
    private String material;

    // contructor
    public Ropa(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }

    // getters
    public String getTipo() {
        return tipo;
    }
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Ropa [tipo=" + tipo + ", material=" + material + "]";
    }
}
