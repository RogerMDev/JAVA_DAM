import java.util.Scanner;

public class MainAlquiler {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion;
        System.out.println("Cuantos alquileres quieres registrar?");
        int cant = s.nextInt();
        Alquiler[] alq = new Alquiler[cant];
        String nombre;
        int capacidad;
        s.nextLine();
        //for para guardar los distintos alojamientos en el vector ( arreglo )
        for (int i = 0; i < cant; i++) {
            System.out.println("Que tipo de alquiler quieres registrar? (Habitacion, Apartamento, Casa Rural)");
            String tipo = s.nextLine().trim().toLowerCase();
            switch (tipo) {
                case "habitacion":
                    System.out.println("Introduce el nombre de la habitacion: ");
                    nombre = s.nextLine();
                    System.out.println("Introduce la capacidad de la habitacion: ");
                    capacidad = s.nextInt();
                    System.out.println("Introduce el numero de camas: ");
                    int numCamas = s.nextInt();
                    alq[i] = new Habitacion(nombre, capacidad, numCamas);
                    s.nextLine();
                    break;
                case "apartamento":
                    System.out.println("Introduce el nombre del apartamento: ");
                    nombre = s.nextLine();
                    System.out.println("Introduce la capacidad del apartamento: ");
                    capacidad = s.nextInt();
                    System.out.println("Habitaciones: ");
                    int hab = s.nextInt();
                    System.out.println("Tiene cocina? (Y/N) ");
                    boolean cocina = (s.nextLine().equalsIgnoreCase("Y"));
                    alq[i] = new Apartamento(nombre, capacidad, hab, cocina);
                    s.nextLine();
                    break;
                case "casa rural":
                    System.out.println("Introduce el nombre de la casa rural: ");
                    nombre = s.nextLine();
                    System.out.println("Introduce la capacidad de la casa rural: ");
                    capacidad = s.nextInt();
                    System.out.println("Tiene piscina: (Y/N)");
                    boolean piscina = (s.nextLine().equalsIgnoreCase("Y"));
                    System.out.println("Tiene jardin: (Y/N)");
                    boolean jardin = (s.nextLine().equalsIgnoreCase("Y"));
                    alq[i] = new CasaRural(nombre, capacidad, piscina, jardin);
                    s.nextLine();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    i--;
                    break;
            }
        }
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar allotjaments disponibles");
            System.out.println("2. Reservar allotjament");
            System.out.println("3. Alliberar allotjament");
            System.out.println("4. Buscar con filtros");
            System.out.println("5. Sortir");
            System.out.print("Tria una opció: ");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < alq.length; i++)
                        if (alq[i].getDisp()) {
                            System.out.println("---------------------");
                            alq[i].mostrarInformacio();
                        }
                        s.nextLine();
                    break;
                case 2:
                    System.out.print("Introdueix el nom de l'allotjament a reservar: ");
                    s.nextLine();
                    String nom = s.nextLine();
                    System.out.println(nom);
                    for (int i = 0; i < alq.length; i++)
                        if (alq[i].getNombre().equalsIgnoreCase(nom)) 
                            alq[i].reservar();
                    break;
                case 3:
                    System.out.print("Introdueix el nom de l'allotjament a alliberar: ");
                    s.nextLine();
                    nom = s.nextLine();
                    for (int i = 0; i < alq.length; i++)
                        if (alq[i].getNombre().equalsIgnoreCase(nom))
                            alq[i].liberar();
                    break;
                case 4:
                    System.out.println("Que tipo de alquiler quieres buscar? (habitacion, apartamento, casa rural)");
                    s.nextLine();
                    String tipo = s.nextLine().trim().toLowerCase();
                    int max;
                    int numPersonas;
                    switch (tipo) {
                        case "habitacion":
                            System.out.println("Introdue el máximo de precio por noche: ");
                            max = s.nextInt();
                            System.out.println("Para cuantas personas?");
                            numPersonas = s.nextInt();
                        for (int i = 0; i < alq.length; i++)
                            if (alq[i].getClass().equals(Habitacion.class)){
                                Habitacion h = (Habitacion) alq[i];
                                if (h.costeNoche(numPersonas) <= max)
                                    h.mostrarInformacio();
                            }
                        break;
                        case "apartamento":
                            System.out.println("Introdue el máximo de precio por noche: ");
                            max = s.nextInt();
                            System.out.println("Quieres que tenga cocina? (Y/N)");
                            boolean cocina = (s.nextLine().equalsIgnoreCase("Y"));
                            System.out.println("Para cuantas personas?");
                            numPersonas = s.nextInt();
                            for (int i = 0; i < alq.length; i++)
                                if (alq[i].getClass().equals(Apartamento.class)){
                                    Apartamento a = (Apartamento) alq[i];
                                    if (a.costeNoche(numPersonas) <= max && a.getCocina() == cocina)
                                        a.mostrarInformacio();
                                }
                            break;
                        case "casa rural":
                            System.out.println("Introdue el máximo de precio por noche: ");
                            max = s.nextInt();
                            System.out.println("Para cuantas personas?");
                            numPersonas = s.nextInt();
                            System.out.println("Quieres que tenga piscina? (Y/N)");
                            boolean piscina = (s.nextLine().equalsIgnoreCase("Y"));
                            System.out.println("Quieres que tenga jardin? (Y/N)");
                            boolean jardin = (s.nextLine().equalsIgnoreCase("Y"));
                            for (int i = 0; i < alq.length; i++)
                                if (alq[i].getClass().equals(CasaRural.class)){
                                    CasaRural cR = (CasaRural) alq[i];
                                    if (cR.costeNoche(numPersonas) <= max && cR.getPiscina() == piscina && cR.getJardin() == jardin)
                                        cR.mostrarInformacio();
                                }
                            break;
                        }
                        break;
            }
        } while (opcion != 5);
    }
}









