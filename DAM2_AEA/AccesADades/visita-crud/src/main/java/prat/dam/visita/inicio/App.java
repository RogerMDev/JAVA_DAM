package prat.dam.visita.inicio;

import prat.dam.visita.aplicacio.VisitaService;
import prat.dam.visita.infraestructura.JdbcVisitaRepository;
import prat.dam.visita.inteficie.ConsoleVisitaUI;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            VisitaService visitaService = new VisitaService(new JdbcVisitaRepository());
            ConsoleVisitaUI consoleVisitaUI = new ConsoleVisitaUI(visitaService, scanner);
            consoleVisitaUI.iniciar();
        } finally {
            scanner.close();
        }
    }
}
