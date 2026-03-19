package app2.nomines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CalculNominaEnParalelSenseRetorn {

    private static final List<Treballador> llistaCompartida = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Exemple 2: CompletableFuture amb Runnable (sense retorn) ===");

        // Llista inicial de treballadors
        List<Treballador> treballadors = List.of(
                new Treballador(1, "Anna", "Serra", 2000, 6.35, 15),
                new Treballador(2, "Marc", "Pons", 1800, 6.35, 12),
                new Treballador(3, "Laura", "Grau", 2500, 6.35, 18)
        );

        List<CompletableFuture<Void>> futures = new ArrayList<>();

        for (Treballador t : treballadors) {
            futures.add(calcularSalariNetSenseRetorn(t));
        }

        // Esperar totes les tasques
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        // Mostrar llista compartida
        System.out.println("\nLlista compartida:");
        synchronized (llistaCompartida) {
            llistaCompartida.forEach(System.out::println);
        }

        System.out.println("Execució finalitzada.");
    }

    // ---------------- MÈTODE QUE RETORNA CompletableFuture<Void> ----------------

    private static CompletableFuture<Void> calcularSalariNetSenseRetorn(Treballador t) {
        return CompletableFuture.runAsync(() -> {
            t.calcularSalariNet();

            synchronized (llistaCompartida) {
                llistaCompartida.add(t);
            }
        });
    }
}
