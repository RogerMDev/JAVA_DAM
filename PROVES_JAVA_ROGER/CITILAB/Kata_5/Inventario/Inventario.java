package Kata_5.Inventario;

import Kata_5.Objetos.Usable;
import Kata_5.Objetos.Pocion;
import Kata_5.Objetos.Arma;

import java.io.*;
import java.util.ArrayList;

public class Inventario {

    private ArrayList<Usable> objetos;

    public Inventario() {
        this.objetos = new ArrayList<>();
    }

    public void añadirObjeto(Usable objeto) {
        objetos.add(objeto);
        System.out.println("Objeto añadido: " + objeto.getNombre());
    }

    public void eliminarObjeto(String nombre) {
        objetos.removeIf(obj -> obj.getNombre().equalsIgnoreCase(nombre));
        System.out.println("Objeto eliminado (si existía): " + nombre);
    }

    public void mostrarInventario() {
        if (objetos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario:");
            for (Usable obj : objetos) {
                System.out.println("- " + obj.getNombre());
            }
        }
    }

    public Usable buscarObjeto(String nombre) {
        for (Usable obj : objetos) {
            if (obj.getNombre().equalsIgnoreCase(nombre)) {
                return obj;
            }
        }
        return null;
    }

    public void guardarEnArchivo(String ruta) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            for (Usable obj : objetos) {
                if (obj instanceof Pocion) {
                    writer.write("Pocion," + obj.getNombre() + "," + ((Pocion) obj).getCantidadCurada());
                } else if (obj instanceof Arma) {
                    writer.write("Arma," + obj.getNombre() + "," + ((Arma) obj).getDano());
                }
                writer.newLine();
            }
            System.out.println("Inventario guardado en archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar el inventario: " + e.getMessage());
        }
    }

    public void cargarDesdeArchivo(String ruta) {
        objetos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    String tipo = partes[0];
                    String nombre = partes[1];
                    int valor = Integer.parseInt(partes[2]);

                    if (tipo.equalsIgnoreCase("Pocion")) {
                        objetos.add(new Pocion(nombre, valor));
                    } else if (tipo.equalsIgnoreCase("Arma")) {
                        objetos.add(new Arma(nombre, valor));
                    }
                }
            }
            System.out.println("Inventario cargado desde archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public ArrayList<Usable> getObjetos() {
        return objetos;
    }
}

