
public class Producto {
    String nombre;
    double precio;
    int cantidadDisp;

    public Producto(String nombre, double precio, int cantidadDisp){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisp = cantidadDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisp() {
        return cantidadDisp;
    }

    public void setCantidadDisp(int cantidadDisp) {
        this.cantidadDisp = cantidadDisp;
    }

    @Override
    public String toString() {
        return nombre + " - " + precio + "euros - Stock: " + cantidadDisp;
    }
}
