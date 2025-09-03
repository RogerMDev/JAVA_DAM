package linkedList;

import java.util.LinkedList;

public class GestorTareas {
    
    LinkedList<String> tareas;

    public GestorTareas(){
        tareas = new LinkedList<>();
    }

    public void anadirTarea(String tarea){
        tareas.addLast(tarea);
    }

    public void mostrarTareas(){
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println("Tarea " + i + " : " + tareas.get(i));
        }
    }

    public void completarTarea(){
        if (!tareas.isEmpty()) {
            tareas.removeFirst();
            System.out.println("Tarea más antigua eliminada correctamente!");
        } else {
            System.out.println("No hay tareas por completar.");
        }
    }

public String resumenTareas() {
    return String.join(", ", tareas);
}

}
