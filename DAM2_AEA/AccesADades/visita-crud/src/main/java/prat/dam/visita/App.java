package prat.dam.visita;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final String URL = "jdbc:postgresql://localhost:5432/c2526_m0486_ra2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== CRUD VISITA MÈDICA ===");
            System.out.println("1. Crear visita");
            System.out.println("2. Mostrar todas");
            System.out.println("3. Buscar por ID");
            System.out.println("4. Actualizar");
            System.out.println("5. Eliminar");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> crearVisita(scanner);
                case 2 -> mostrarTodas();
                case 3 -> buscarPorId(scanner);
                case 4 -> actualizarVisita(scanner);
                case 5 -> eliminarVisita(scanner);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }

        } while (option != 0);

        scanner.close();
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private static void crearVisita(Scanner scanner) {
        try (Connection conn = getConnection()) {

            System.out.print("Nombre paciente: ");
            String nomPacient = scanner.nextLine();

            System.out.print("Nombre metge: ");
            String nomMetge = scanner.nextLine();

            System.out.print("Fecha (YYYY-MM-DD): ");
            LocalDate data = LocalDate.parse(scanner.nextLine());

            System.out.print("Diagnóstico: ");
            String diagnostic = scanner.nextLine();

            String sql = "INSERT INTO visitamedica (nompacient, nommetge, data, diagnostic) VALUES (?, ?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nomPacient);
                stmt.setString(2, nomMetge);
                stmt.setDate(3, Date.valueOf(data));
                stmt.setString(4, diagnostic);
                stmt.executeUpdate();
                System.out.println("Visita creada correctamente.");
            }

        } catch (Exception e) {
            System.out.println("Error al crear visita: " + e.getMessage());
        }
    }

    private static void mostrarTodas() {
        String sql = "SELECT * FROM visitamedica";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            List<String> visitas = new ArrayList<>();

            while (rs.next()) {
                visitas.add(
                        rs.getInt("idvisita") + " | " +
                        rs.getString("nompacient") + " | " +
                        rs.getString("nommetge") + " | " +
                        rs.getDate("data") + " | " +
                        rs.getString("diagnostic")
                );
            }

            if (visitas.isEmpty()) {
                System.out.println("No hay visitas registradas.");
            } else {
                visitas.forEach(System.out::println);
            }

        } catch (Exception e) {
            System.out.println("Error al mostrar visitas: " + e.getMessage());
        }
    }

    private static void buscarPorId(Scanner scanner) {
        System.out.print("Introduce ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        String sql = "SELECT * FROM visitamedica WHERE idvisita = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println(
                        rs.getInt("idvisita") + " | " +
                        rs.getString("nompacient") + " | " +
                        rs.getString("nommetge") + " | " +
                        rs.getDate("data") + " | " +
                        rs.getString("diagnostic")
                );
            } else {
                System.out.println("No existe visita con ese ID.");
            }

        } catch (Exception e) {
            System.out.println("Error al buscar: " + e.getMessage());
        }
    }

    private static void actualizarVisita(Scanner scanner) {
        try (Connection conn = getConnection()) {

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

            String sql = "UPDATE visitamedica SET nompacient = ?, nommetge = ?, data = ?, diagnostic = ? WHERE idvisita = ?";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nomPacient);
                stmt.setString(2, nomMetge);
                stmt.setDate(3, Date.valueOf(data));
                stmt.setString(4, diagnostic);
                stmt.setInt(5, id);

                int rows = stmt.executeUpdate();

                if (rows > 0) {
                    System.out.println("Visita actualizada correctamente.");
                } else {
                    System.out.println("No existe visita con ese ID.");
                }
            }

        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }

    private static void eliminarVisita(Scanner scanner) {
        System.out.print("ID a eliminar: ");
        int id = Integer.parseInt(scanner.nextLine());

        String sql = "DELETE FROM visitamedica WHERE idvisita = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Visita eliminada correctamente.");
            } else {
                System.out.println("No existe visita con ese ID.");
            }

        } catch (Exception e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }
}

