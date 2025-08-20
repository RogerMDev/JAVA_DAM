import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean ejecucion = true;
        int eleccion;
        Scanner sc = new Scanner(System.in);

        //EXECUCIÓ
        while (ejecucion){
            mostrarMenu();
            eleccion = sc.nextInt();
            if (eleccion == 1){
                String nombre;
                int edad;
                String tipoDeMascota;

                System.out.println("Di el nombre de la nueva mascota a añadir:");
                nombre = sc.nextLine();
                System.out.println("Di la edad de la mascota a añadir:");
                edad = sc.nextInt();
                System.out.println("Di el tipo de mascota que es (perro,gato, etc..)");
                tipoDeMascota = sc.nextLine();

                Mascota mascota1 = new Mascota(nombre, edad, tipoDeMascota);
                mascota1.anadirMascotaALista(mascota1);
                continue;
            }
            if (eleccion == 2){
                Mascota.mostrarListaDeMascotas();
                continue;
            }
            if (eleccion == 3){
                String nombre;
                System.out.println("Di el nombre de la mascota que quieres que se presente:");
                nombre = sc.nextLine();
                Mascota.mostrarPresentacionPorNombre(nombre);
                
            }
        }
    }

    public static void mostrarMenu(){
        System.out.println("Bienvenido al sistema de organización de mascotas:");
        System.out.println("1. Añadir nueva mascota");
        System.out.println("2. Ver todas las mascotas registradas");
        System.out.println("3. Escoger presentación de mascota");
        System.out.println("4. Salir del programa");
    }
}
