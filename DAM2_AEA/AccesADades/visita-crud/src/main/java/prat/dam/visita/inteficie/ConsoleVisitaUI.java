package prat.dam.visita.inteficie;

import prat.dam.visita.aplicacio.VisitaService;
import prat.dam.visita.domini.Visita;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ConsoleVisitaUI {
    private final VisitaService visitaService;
    private final Scanner scanner;

    public ConsoleVisitaUI(VisitaService visitaService, Scanner scanner) {
        this.visitaService = visitaService;
        this.scanner = scanner;
    }

    public void iniciar() {
        int option;
        do {
            mostrarMenu();
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> crearVisita();
                case 2 -> mostrarTodas();
                case 3 -> buscarPorId();
                case 4 -> actualizarVisita();
                case 5 -> eliminarVisita();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (option != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n=== CRUD VISITA MÈDICA ===");
        System.out.println("1. Crear visita");
        System.out.println("2. Mostrar todas");
        System.out.println("3. Buscar por ID");
        System.out.println("4. Actualizar");
        System.out.println("5. Eliminar");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    private void crearVisita() {
        try {
            System.out.print("Nombre paciente: ");
            String nomPacient = scanner.nextLine();

            System.out.print("Nombre metge: ");
            String nomMetge = scanner.nextLine();

            System.out.print("Fecha (YYYY-MM-DD): ");
            LocalDate data = LocalDate.parse(scanner.nextLine());

            System.out.print("Diagnóstico: ");
            String diagnostic = scanner.nextLine();

            visitaService.crearVisita(new Visita(null, nomPacient, nomMetge, data, diagnostic));
            System.out.println("Visita creada correctamente.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void mostrarTodas() {
        try {
            List<Visita> visitas = visitaService.mostrarTodas();
            if (visitas.isEmpty()) {
                System.out.println("No hay visitas registradas.");
            } else {
                visitas.forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void buscarPorId() {
        try {
            System.out.print("Introduce ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            Optional<Visita> visita = visitaService.buscarPorId(id);
            if (visita.isPresent()) {
                System.out.println(visita.get());
            } else {
                System.out.println("No existe visita con ese ID.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void actualizarVisita() {
        try {
            System.out.print("ID a actualizar: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Nuevo nombre paciente: ");
            String nomPacient = scanner.nextLine();

            System.out.print("Nuevo nombre metge: ");
            String nomMetge = scanner.nextLine();

            System.out.print("Nueva fecha (YYYY-MM-DD): ");
            LocalDate data = LocalDate.parse(scanner.nextLine());

            System.out.print("Nuevo diagnóstico: ");
            String diagnostic = scanner.nextLine();

            boolean updated = visitaService.actualizarVisita(new Visita(id, nomPacient, nomMetge, data, diagnostic));
            if (updated) {
                System.out.println("Visita actualizada correctamente.");
            } else {
                System.out.println("No existe visita con ese ID.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void eliminarVisita() {
        try {
            System.out.print("ID a eliminar: ");
            int id = Integer.parseInt(scanner.nextLine());

            boolean deleted = visitaService.eliminarVisita(id);
            if (deleted) {
                System.out.println("Visita eliminada correctamente.");
            } else {
                System.out.println("No existe visita con ese ID.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
