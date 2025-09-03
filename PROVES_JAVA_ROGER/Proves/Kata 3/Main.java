public class Main {
    public static void main(String[] args){
        Producto producto1 = new Producto("Hacha",29.99,4);
        Producto producto2 = new Producto("Cuchillo jamón",9.99,2);
        Producto producto3 = new Producto("Sierra electrica",49.99,10);

        Inventario inventario = new Inventario();
        inventario.anadirProducto(producto1);
        inventario.anadirProducto(producto2);
        inventario.anadirProducto(producto3);

        inventario.mostrarProductos();

        inventario.buscarProductoPorNombre("Hacha");
        inventario.buscarProductoPorNombre("piscina");
        inventario.buscarProductoPorNombre("Cuchillo jamón");
        inventario.buscarProductoPorNombre("Sierra electrica");
    }
}
