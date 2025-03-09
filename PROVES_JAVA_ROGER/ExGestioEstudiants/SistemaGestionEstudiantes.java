import java.util.Arrays;
import java.util.Scanner;

public class SistemaGestionEstudiantes {

    Estudiante[] estudiantes = new Estudiante[5];
    Scanner sc = new Scanner(System.in);

    public SistemaGestionEstudiantes(){

        estudiantes[0] = new Estudiante("Juan", 20, new int[]{8, 7, 9, 6, 7});
        estudiantes[1] = new Estudiante("Ana", 19, new int[]{6, 5, 7, 8, 6});
        estudiantes[2] = new Estudiante("Carlos", 21, new int[]{9, 8, 10, 7, 9});
        estudiantes[3] = new Estudiante("María", 22, new int[]{5, 6, 4, 7, 6});
        estudiantes[4] = new Estudiante("Pedro", 20, new int[]{7, 8, 6, 7, 9});

        boolean mostrarmenu = true;

        while (mostrarmenu){
            System.out.println("Opciones del menu:");
            System.out.println("1. Ver las calificaciones y el promedio de un estudiante.");
            System.out.println("2. Modificar las calificaciones de un estudiante.");
            System.out.println("3. Ver si un estudiante ha aprobado o no.");
            System.out.println("4. Ver el promedio general de todos los estudiantes.");
            System.out.println("5. Salir del programa");

            int eleccionmenu = sc.nextInt();

            if (eleccionmenu == 1){
                System.out.println("Dí el numero del estudiante que quieres consultar");
                int consultaestudiante = sc.nextInt();
                int[] estudianteseleccionado = estudiantes[consultaestudiante].getCalificaciones();
                System.out.println("Las calificaciones del estudiante " + estudiantes[consultaestudiante].getNombre() + " son: " + Arrays.toString(estudianteseleccionado));
                System.out.println("El promedio de las cualificaciones del estudiante " + consultaestudiante + " es:" 
                + estudiantes[consultaestudiante].promedioQualificaciones());
                System.out.println("");

            }else if (eleccionmenu == 2){
                System.out.println("Dí el numero del estudiante que quieres modificar las calificaciones");
                int consultaestudiante = sc.nextInt();
                System.out.println("Las cualificaciones del estudiante " + estudiantes[consultaestudiante].getNombre() + " son las siguientes: " + Arrays.toString(estudiantes[consultaestudiante].getCalificaciones()));
                System.out.println("Di en que posición está la calificacion que quieres modificar : ( 0, 1, 2, 3, 4 )");
                int notaamodificar = sc.nextInt();
                System.out.println("Pon un valor en forma de numero entero que para modificar la calificación seleccionada" + " ( " + estudiantes[consultaestudiante].getCalificaciones()[notaamodificar] + " ) ");
                int notamodificada = sc.nextInt();
                estudiantes[consultaestudiante].getCalificaciones()[notaamodificar] = notamodificada;
                System.out.println("Calificacion modificada correctamente");
                System.out.println("Las nuevas calificaciones del estudiante " + consultaestudiante + " son: " + Arrays.toString(estudiantes[consultaestudiante].getCalificaciones()));

            }else if (eleccionmenu == 3) {
                System.out.println("Dí el numero del estudiante que quieres consultar");
                int consultaestudiante = sc.nextInt();
                if (estudiantes[consultaestudiante].estudianteAprobado(estudiantes[consultaestudiante].promedioQualificaciones())){
                    System.out.println("EL/LA ESTUDIANTE " + estudiantes[consultaestudiante].getNombre() +  " HA APROBADO!!");
                } else{
                    System.out.println("El/la estudiante" + estudiantes[consultaestudiante].getNombre() + " no ha aprobado :( ");
                }

            } else if (eleccionmenu == 4) {
                double sumapromediogeneral = 0;
                for(int i = 0; i < estudiantes.length; i++){
                    sumapromediogeneral += estudiantes[i].promedioQualificaciones();
                }
                System.out.println("El promedio general de todos los estudiantes es: " + sumapromediogeneral/estudiantes.length);
            } else{
                mostrarmenu = false;
            }
        }

    }
}
