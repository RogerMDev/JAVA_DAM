package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;

/**
 * Programa independent que executa un subprocés del sistema operatiu.
 * Demana per consola el contingut i el fitxer de destinació, i guarda
 * el text en aquest fitxer mitjançant una comanda de sistema.
 */
public class SubprocesMain {

    public static void main(String[] args) {
        System.out.println("=== Execució d'un subprocés del sistema operatiu ===");

        try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8)) {
            System.out.print("Introdueix el contingut del fitxer: ");
            String contingut = scanner.nextLine();

            System.out.print("Introdueix la ruta i nom del fitxer (ex: C:\\temp\\sortida.txt): ");
            String rutaFitxer = scanner.nextLine();

            ProcessBuilder pb = new ProcessBuilder(
                    "powershell",
                    "-NoProfile",
                    "-Command",
                    "$text = $env:TEXT_TO_WRITE; $path = $env:OUTPUT_FILE; Set-Content -Path $path -Value $text -Encoding UTF8");

            Map<String, String> env = pb.environment();
            env.put("TEXT_TO_WRITE", contingut);
            env.put("OUTPUT_FILE", rutaFitxer);

            Process p = pb.start();

            BufferedReader errorReader = new BufferedReader(
                    new InputStreamReader(p.getErrorStream(), StandardCharsets.UTF_8));

            String liniaError;
            while ((liniaError = errorReader.readLine()) != null) {
                System.err.println("[ERROR SUBPROCÉS] " + liniaError);
            }

            int exitCode = p.waitFor();
            if (exitCode == 0) {
                System.out.println("Text guardat correctament a: " + rutaFitxer);
            } else {
                System.err.println("El subprocés ha fallat amb codi: " + exitCode);
            }

        } catch (Exception e) {
            System.err.println("Error executant subprocés: " + e.getMessage());
        }
    }
}
