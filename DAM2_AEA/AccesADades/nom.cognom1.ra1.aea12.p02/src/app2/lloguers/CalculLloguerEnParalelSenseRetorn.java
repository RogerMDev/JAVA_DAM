package app2.lloguers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CalculLloguerEnParalelSenseRetorn {

    private static final List<Immoble> llistaCompartida = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Exemple 2: Calcul de lloguers amb Runnable (sense retorn) ===");

        List<Immoble> immobles = List.of(
                new Immoble(1, "Carrer Major 10, Barcelona", "Pis", 1200, 19, 12),
                new Immoble(2, "Avinguda Mar 25, Girona", "Local", 950, 15, 10),
                new Immoble(3, "Carrer Estacio 3, Lleida", "Garatge", 200, 10, 5)
        );

        List<CompletableFuture<Void>> futures = new ArrayList<>();

        for (Immoble i : immobles) {
            futures.add(calcularIngresNetSenseRetorn(i));
        }

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        System.out.println("\nLlista compartida:");
        synchronized (llistaCompartida) {
            llistaCompartida.forEach(System.out::println);
        }

        System.out.println("Execucio finalitzada.");
    }

    private static CompletableFuture<Void> calcularIngresNetSenseRetorn(Immoble i) {
        return CompletableFuture.runAsync(() -> {
            i.calcularIngresNet();

            synchronized (llistaCompartida) {
                llistaCompartida.add(i);
            }
        });
    }
}
