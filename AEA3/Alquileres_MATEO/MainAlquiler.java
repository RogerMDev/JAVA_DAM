import java.util.Arrays;
import java.util.Scanner;

public class MainAlquiler {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cuantos alquileres quieres registrar?");
        int cant = s.nextInt();
        s.nextLine();
        Alquiler[] alq = new Alquiler[cant];
        mostrarMenu(alq);
    }

    public static void mostrarMenu(Alquiler[] alq){
    //for para guardar los distintos alojamientos en el vector ( arreglo )
    boolean mostrarMenu = true;
    for (int i = 0; i < alq.length; i++) {
        System.out.println("Que tipo de alquiler quieres registrar? (Habitacion, Apartamento, Casa Rural)");
        String tipo = s.nextLine().trim().toLowerCase();
        switch (tipo) {
            case "habitacion":
                System.out.println("Introduce el nombre de la habitacion: ");
                String nombre = s.nextLine();
                System.out.println("Introduce la capacidad de la habitacion: ");
                int capacidad = s.nextInt();
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
                s.nextLine();
                System.out.println("Tiene cocina? (Y/N) ");
                boolean cocina = (s.nextLine().equalsIgnoreCase("Y"));
                alq[i] = new Apartamento(nombre, capacidad, hab, cocina);
                break;
            case "casa rural":
                System.out.println("Introduce el nombre de la casa rural: ");
                nombre = s.nextLine();
                System.out.println("Introduce la capacidad de la casa rural: ");
                capacidad = s.nextInt();
                s.nextLine();
                System.out.println("Tiene piscina: (Y/N)");
                boolean piscina = (s.nextLine().equalsIgnoreCase("Y"));
                System.out.println("Tiene jardin: (Y/N)");
                boolean jardin = (s.nextLine().equalsIgnoreCase("Y"));
                alq[i] = new CasaRural(nombre, capacidad, piscina, jardin);
                break;
            default:
                System.out.println("Opcion no valida");
                i--;
                break;
            }
        }
    while (mostrarMenu) {
        System.out.println("\nMenú:");
        System.out.println("1. Mostrar alquileres disponibles");
        System.out.println("2. Reservar alquileres");
        System.out.println("3. Liberar alquileres");
        System.out.println("4. Buscar con filtros");
        System.out.println("5. Salir");
        System.out.print("Escoge una opción: ");
        int opcion = s.nextInt();

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
                System.out.print("Introduce el nombre del alquiler a reservar: ");
                s.nextLine();
                String nom = s.nextLine();
                System.out.println(nom);
                for (int i = 0; i < alq.length; i++)
                    if (alq[i].getNombre().equalsIgnoreCase(nom)) 
                        alq[i].reservar();
                break;
            case 3:
                System.out.print("Introduce el nombre del alquiler a liberar: ");
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
                        System.out.println("Introduce el máximo de precio por noche: ");
                        max = s.nextInt();
                        System.out.println("Introduce el numero total de noches previstas a reservar");
                        int numNochesH = s.nextInt();
                        System.out.println("Para cuantas personas?");
                        numPersonas = s.nextInt();
                        s.nextLine();

                        // Preguntar el orden de los resultados
                        System.out.println("¿Cómo quieres ordenar los resultados según el precio total?");
                        System.out.println("A - Ascendente | D - Descendente | P - Predeterminado");
                        char ordenMostradoH = s.next().charAt(0);
                        s.nextLine(); // Limpiar el buffer

                        // Contar cuántas habitaciones cumplen los requisitos
                        int countH = 0;
                        for (int i = 0; i < alq.length; i++) {
                            if (alq[i] instanceof Habitacion) {
                                Habitacion h = (Habitacion) alq[i];
                                if (h.costeNoche(numPersonas) <= max) {
                                    countH++;
                                }
                            }
                        }

                        // Si no hay resultados, salir del case
                        if (countH == 0) {
                            System.out.println("No hay alojamientos disponibles con esas características.");
                            break;
                        }

                        // Crear un array con los precios totales
                        double[] preciosTotalesH = new double[countH];
                        int indexH = 0;

                        for (int i = 0; i < alq.length; i++) {
                            if (alq[i] instanceof Habitacion) {
                                Habitacion h = (Habitacion) alq[i];
                                if (h.costeNoche(numPersonas) <= max) {
                                    preciosTotalesH[indexH++] = h.costeTotal(numPersonas, numNochesH);
                                }
                            }
                        }

                        // Ordenar los precios según el criterio del usuario
                        if (ordenMostradoH == 'A' || ordenMostradoH == 'a') {
                            Arrays.sort(preciosTotalesH); // Orden ascendente
                        } else if (ordenMostradoH == 'D' || ordenMostradoH == 'd') {
                            Arrays.sort(preciosTotalesH);
                            for (int i = 0; i < preciosTotalesH.length / 2; i++) {
                                double temp = preciosTotalesH[i];
                                preciosTotalesH[i] = preciosTotalesH[preciosTotalesH.length - 1 - i];
                                preciosTotalesH[preciosTotalesH.length - 1 - i] = temp;
                            }
                        }

                        // Mostrar las habitaciones en el orden correcto
                        for (double precio : preciosTotalesH) {
                            for (int i = 0; i < alq.length; i++) {
                                if (alq[i] instanceof Habitacion) {
                                    Habitacion h = (Habitacion) alq[i];
                                    if (h.costeTotal(numPersonas, numNochesH) == precio) {
                                        h.mostrarInformacio();
                                        System.out.println("Coste total: " + precio + " euros");
                                        System.out.println("----------------");
                                        break;
                                    }
                                }
                            }
                        }
                        break;

                    case "apartamento":
                        System.out.println("Introduce el máximo de precio por noche: ");
                        max = s.nextInt();
                        System.out.println("Introduce el numero total de noches previstas a reservar");
                        int numNochesA = s.nextInt();
                        s.nextLine();
                        System.out.println("Quieres que tenga cocina? (Y/N)");
                        boolean cocina = (s.nextLine().equalsIgnoreCase("Y"));
                        System.out.println("Para cuantas personas?");
                        numPersonas = s.nextInt();

                        // Preguntar el orden de los resultados
                        System.out.println("¿Cómo quieres ordenar los resultados según el precio total?");
                        System.out.println("A - Ascendente | D - Descendente | P - Predeterminado");
                        char ordenMostradoA = s.next().charAt(0);
                        s.nextLine(); // Limpiar el buffer

                        // Contar cuántos apartamentos cumplen los requisitos
                        int contadorA = 0;
                        for (int i = 0; i < alq.length; i++) {
                            if (alq[i] instanceof Apartamento) {
                                Apartamento a = (Apartamento) alq[i];
                                if (a.costeNoche(numPersonas) <= max && a.getCocina() == cocina) {
                                    contadorA++;
                                }
                            }
                        }

                        // Si no hay resultados, salir del case
                        if (contadorA == 0) {
                            System.out.println("No hay alojamientos disponibles con esas características.");
                            break;
                        }

                        // Crear un array con los precios totales
                        double[] preciosTotalesA = new double[contadorA];
                        int indexA = 0;

                        for (int i = 0; i < alq.length; i++) {
                            if (alq[i] instanceof Apartamento) {
                                Apartamento a = (Apartamento) alq[i];
                                if (a.costeNoche(numPersonas) <= max && a.getCocina() == cocina) {
                                    preciosTotalesA[indexA++] = a.costeTotal(numPersonas, numNochesA);
                                }
                            }
                        }

                        // Ordenar los precios según el criterio del usuario
                        if (ordenMostradoA == 'A' || ordenMostradoA == 'a') {
                            Arrays.sort(preciosTotalesA); // Orden ascendente
                        } else if (ordenMostradoA == 'D' || ordenMostradoA == 'd') {
                            Arrays.sort(preciosTotalesA);
                            for (int i = 0; i < preciosTotalesA.length / 2; i++) {
                                double temp = preciosTotalesA[i];
                                preciosTotalesA[i] = preciosTotalesA[preciosTotalesA.length - 1 - i];
                                preciosTotalesA[preciosTotalesA.length - 1 - i] = temp;
                            }
                        }

                        // Mostrar los apartamentos en el orden correcto
                        for (double precio : preciosTotalesA) {
                            for (int i = 0; i < alq.length; i++) {
                                if (alq[i] instanceof Apartamento) {
                                    Apartamento a = (Apartamento) alq[i];
                                    if (a.costeTotal(numPersonas, numNochesA) == precio) {
                                        a.mostrarInformacio();
                                        System.out.println("Coste total: " + precio + " euros");
                                        System.out.println("----------------");
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case "casa rural":
                        System.out.println("Introduce el máximo de precio por noche: ");
                        max = s.nextInt();
                        System.out.println("Introduce el numero total de noches previstas a reservar");
                        int numNochesCR = s.nextInt();
                        System.out.println("¿Para cuantas personas?");
                        numPersonas = s.nextInt();
                        s.nextLine();
                        System.out.println("¿Quieres que tenga piscina? (Y/N)");
                        boolean piscina = (s.nextLine().equalsIgnoreCase("Y"));
                        System.out.println("¿Quieres que tenga jardin? (Y/N)");
                        boolean jardin = (s.nextLine().equalsIgnoreCase("Y"));
                        System.out.println("¿Cómo quieres ordenar los resultados según el precio total: Ascendente(A), Descendente (D), Predeterminado (P)?");
                        char ordenMostradoCR = s.next().charAt(0);
                        s.nextLine();

                        int contador = 0;
                        for (int i = 0; i < alq.length; i++) {
                            if (alq[i] instanceof CasaRural) {
                                CasaRural cR = (CasaRural) alq[i];
                                if (cR.costeNoche(numPersonas) <= max && cR.getPiscina() == piscina && cR.getJardin() == jardin) {
                                    contador++;
                                }
                            }
                        }

                        // Si no hay resultados, salir del case
                        if (contador == 0) {
                            System.out.println("No hay alojamientos disponibles con esas características.");
                            break;
                        }

                        // Crear un array con los precios totales
                        double[] preciosTotales = new double[contador];
                        int indice = 0;

                        for (int i = 0; i < alq.length; i++) {
                            if (alq[i] instanceof CasaRural) {
                                CasaRural cR = (CasaRural) alq[i];
                                if (cR.costeNoche(numPersonas) <= max && cR.getPiscina() == piscina && cR.getJardin() == jardin) {
                                    preciosTotales[indice++] = cR.costeTotal(numPersonas, numNochesCR);
                                }
                            }
                        }

                        // Ordenar los precios según el criterio del usuario
                        if (ordenMostradoCR == 'A' || ordenMostradoCR == 'a') {
                            Arrays.sort(preciosTotales); // Orden ascendente
                        } else if (ordenMostradoCR == 'D' || ordenMostradoCR == 'd') {
                            Arrays.sort(preciosTotales);
                            for (int i = 0; i < preciosTotales.length / 2; i++) {
                                double temp = preciosTotales[i];
                                preciosTotales[i] = preciosTotales[preciosTotales.length - 1 - i];
                                preciosTotales[preciosTotales.length - 1 - i] = temp;
                            }
                        }

                        // Mostrar los alojamientos en el orden correcto
                        for (double precio : preciosTotales) {
                            for (int i = 0; i < alq.length; i++) {
                                if (alq[i] instanceof CasaRural) {
                                    CasaRural cR = (CasaRural) alq[i];
                                    if (cR.costeTotal(numPersonas, numNochesCR) == precio) {
                                        cR.mostrarInformacio();
                                        System.out.println("Coste total: " + precio + " euros");
                                        System.out.println("----------------");
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                default :
                mostrarMenu = false;
                }
            }
        }
    }
}