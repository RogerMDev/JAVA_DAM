package app2.nomines;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CalculNominaEnParalelAmbRetorn {

    private static final List<Treballador> llistaCompartida = new ArrayList<Treballador>();

    public static void main(String[] args) {

        System.out.println("=== Exemple 1: CompletableFuture amb retorn ===");

        // Llista inicial de treballadors
        List<Treballador> treballadors = List.of(
                new Treballador(1, "Anna", "Serra", 2000, 6.35, 15),
                new Treballador(2, "Marc", "Pons", 1800, 6.35, 12),
                new Treballador(3, "Laura", "Grau", 2500, 6.35, 18)
        );

        // Crear tasques
        List<CompletableFuture<Double>> futures = new ArrayList<>();

        for (Treballador t : treballadors) {
            futures.add(calcularSalariNetRetornant(t));
        }

        // Esperar totes les tasques
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        // Mostrar resultats retornats
        System.out.println("\nResultats retornats:");
        futures.forEach(f -> System.out.println("Salari net: " + f.join()));

        // Mostrar llista compartida
        System.out.println("\nLlista compartida:");
        synchronized (llistaCompartida) {
            llistaCompartida.forEach(System.out::println);
        }
    }

    // ---------------- MÈTODE QUE RETORNA CompletableFuture<Double> ----------------

    private static CompletableFuture<Double> calcularSalariNetRetornant(Treballador t) {
        return CompletableFuture.supplyAsync(() -> {
            t.calcularSalariNet();

            synchronized (llistaCompartida) {
                llistaCompartida.add(t);
            }

            return t.getSalariNet();
        });
    }
}
