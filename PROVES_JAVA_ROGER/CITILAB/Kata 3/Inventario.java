
public class Inventario {

    Producto[] productos = new Producto[4];
    
    public void anadirProducto(Producto productoAnadido){

        boolean sePuedeAnadir = false;

        for (int i = 0; i< productos.length;i++){
            if (productos[i]== null){
                productos[i] = productoAnadido;
                System.out.println("Producto " + productoAnadido + " añadido correctamente!");
                sePuedeAnadir = true;
                break;
            }
        }
        if (!sePuedeAnadir){
            System.out.println("No se ha podido añadir el producto deseado :( ");
        }
    }

    public void mostrarProductos(){
        for (int i = 0; i < productos.length;i++){
            if (productos[i] == null){
                System.out.println("Producto " + i + " : (vacío)");
            } else{
                System.out.println("Producto " + i + " :" + productos[i]);
            }
        }
    }

    public void buscarProductoPorNombre(String nombreBuscado){
        boolean productoEncontrado = false;
        for (int i = 0; i< productos.length; i++){
            Producto producto = productos[i];
            if (productos[i] != null && producto.getNombre().equals(nombreBuscado)){
                System.out.println("Nombre : " + producto.getNombre());
                System.out.println("Precio : " + producto.getPrecio());
                System.out.println("Cantidad disponible : " + producto.getCantidadDisp());
                productoEncontrado = true;
                break;
            }
        }
        if (!productoEncontrado){
            System.out.println("Producto no encontrado!");
        }
    }
}
