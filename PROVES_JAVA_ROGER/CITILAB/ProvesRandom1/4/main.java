import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //EXECUCIÓ
        mostrarMenu();


    }

    public static void mostrarMenu(){
        System.out.println("Bienvenido al sistema de organización de mascotas:");
        System.out.println("1. Añadir nueva mascota");
        System.out.println("2. Ver todas las mascotas registradas");
        System.out.println("3. Escoger presentación de mascota");
        System.out.println("4. Salir del programa");
    }
}
