import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean ejecucion = true;
        int eleccion;
        Scanner sc = new Scanner(System.in);
        
        //EXECUCIÓ
        System.out.println("Bienvenido al sistema de organización de mascotas:");
        while (ejecucion){
            mostrarMenu();
            eleccion = sc.nextInt();
            if (eleccion == 1){
                String nombre;
                int edad;
                String tipoDeMascota;

                System.out.println("Di el nombre de la nueva mascota a añadir:");
                sc.nextLine();
                nombre = sc.nextLine();
                System.out.println("Di la edad de la mascota a añadir:");
                edad = sc.nextInt();
                System.out.println("Di el tipo de mascota que es (perro,gato, etc..)");
                sc.nextLine();
                tipoDeMascota = sc.nextLine();

                Mascota mascota1 = new Mascota(nombre, edad, tipoDeMascota);
                Mascota.anadirMascotaALista(mascota1);
                System.out.println("Mascota añadida correctamente! :D");
                continue;
            }
            if (eleccion == 2){
                Mascota.mostrarListaDeMascotas();
                continue;
            }
            if (eleccion == 3){
                String nombre;
                System.out.println("Di el nombre de la mascota que quieres que se presente:");
                sc.nextLine();
                nombre = sc.nextLine();
                Mascota.mostrarPresentacionPorNombre(nombre);
                continue;
            }
            if (eleccion == 4){
                System.out.println("Hasta luego!!! :)");
                return;
            } else {
                System.out.println("Selecciona un numero valido!!");
                continue;
            }
        }
    }

    public static void mostrarMenu(){
        System.out.println("1. Añadir nueva mascota");
        System.out.println("2. Ver todas las mascotas registradas");
        System.out.println("3. Escoger presentación de mascota");
        System.out.println("4. Salir del programa");
    }
}
