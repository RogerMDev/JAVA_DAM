package linkedList;

public class main {
    
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();

        gestor.anadirTarea("Estudiar Java");
        gestor.anadirTarea("Hacer deporte");
        gestor.anadirTarea("Leer un capitulo de un libro");

        gestor.mostrarTareas();

        gestor.completarTarea();
        System.out.println("Resumen: " + gestor.resumenTareas());
    }
}
