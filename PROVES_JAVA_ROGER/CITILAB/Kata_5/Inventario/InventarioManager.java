package Kata_5.Inventario;

import Kata_5.Objetos.*;
import Kata_5.personajes.Personaje;

import java.io.*;
import java.util.ArrayList;

public class InventarioManager {

    private static final String RUTA_ARCHIVO = "inventario.txt";

    // Guarda el inventario del personaje actual en el archivo
    public static void guardarInventario(ArrayList<Usable> inventario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Usable obj : inventario) {
                if (obj instanceof Arma) {
                    Arma arma = (Arma) obj;
                    writer.write("ARMA;" + arma.getNombre() + ";" + arma.getDano());
                } else if (obj instanceof Pocion) {
                    Pocion pocion = (Pocion) obj;
                    writer.write("POCION;" + pocion.getNombre() + ";" + pocion.getCantidadCurada());
                }
                writer.newLine();
            }
            System.out.println("✅ Inventario guardado correctamente en " + RUTA_ARCHIVO);
        } catch (IOException e) {
            System.err.println("❌ Error al guardar el inventario: " + e.getMessage());
        }
    }

    // Carga un inventario desde el archivo y lo devuelve
    public static ArrayList<Usable> cargarInventario() {
        ArrayList<Usable> inventario = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                String tipo = partes[0];
                String nombre = partes[1];
                int valor = Integer.parseInt(partes[2]);

                if (tipo.equals("ARMA")) {
                    inventario.add(new Arma(nombre, valor));
                } else if (tipo.equals("POCION")) {
                    inventario.add(new Pocion(nombre, valor));
                }
            }
            System.out.println("✅ Inventario cargado correctamente desde " + RUTA_ARCHIVO);
        } catch (IOException e) {
            System.err.println("❌ Error al cargar el inventario: " + e.getMessage());
        }
        return inventario;
    }
}
