public class Alquiler {
    private String nombre;
    private int capacidad;
    private boolean disp;

    Alquiler(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disp = true;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public boolean getDisp() {
        return disp;
    }
    public void setDisp(boolean disp) {
        this.disp = disp;
    }

    public double costeNoche(int numPersones) {
        return 0;
    }

    public double costeTotal(int numPersones, int numNoches) {
        return 0;
    }

    public void mostrarInformacio() {
        System.out.println(this.getNombre());
        System.out.println("Capacidad: " + this.getCapacidad());
        System.out.print("Disponible: ");
        if (this.getDisp()){
            System.out.println("Sí");
        } else{
            System.out.println("No");
        }
        System.out.println("Coste de noche: " + costeNoche(capacidad) + " euros");
    }

    public void reservar() {
        if (this.disp){
            this.disp = false;
            System.out.println("Reservado correctamente");
        }
        else 
            System.out.println("Ya esta reservada");
    }

    public void liberar() {
        if (!this.disp){
            this.disp = true;
            System.out.println("Liberado correctamente");
        }
        else 
            System.out.println("No esta reservada");
    }

    public boolean disponible() {
        return disp;
    }
}