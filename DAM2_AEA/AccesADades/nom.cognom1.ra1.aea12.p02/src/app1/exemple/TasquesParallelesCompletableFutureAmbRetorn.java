package app1.exemple;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TasquesParallelesCompletableFutureAmbRetorn {

	private static final List<Integer> dadesCompartides = new ArrayList<Integer>();

	public static void main(String[] args) {

		System.out.println("=== CompletableFuture amb retorn de valors ===");

		CompletableFuture<Integer> tasca1 = crearTascaAfegir(10, 20, 30);
		CompletableFuture<Integer> tasca2 = crearTascaAfegir(5, 15, 20);
		CompletableFuture<Integer> tasca3 = crearTascaSuma(100, 200);
		CompletableFuture<Integer> tasca4 = crearTascaLenta(1500, 999);

		// Esperar totes les tasques i obtenir resultats
		CompletableFuture<Void> totes = CompletableFuture.allOf(tasca1, tasca2, tasca3, tasca4);

		totes.join(); // Espera que totes acabin

		System.out.println("\nResultats:");
		System.out.println("Tasca 1: " + tasca1.join());
		System.out.println("Tasca 2: " + tasca2.join());
		System.out.println("Tasca 3: " + tasca3.join());
		System.out.println("Tasca 4: " + tasca4.join());

		synchronized (dadesCompartides) {
			System.out.println("\nDades compartides finals: " + dadesCompartides);
		}
	}

	// ---------------- MÈTODES QUE RETORNEN COMPLETABLEFUTURE ----------------

	private static CompletableFuture<Integer> crearTascaAfegir(int a, int b, int resultat) {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("Afegint " + a + " i " + b);
			synchronized (dadesCompartides) {
				dadesCompartides.add(a);
				dadesCompartides.add(b);
			}
			return resultat;
		});
	}

	private static CompletableFuture<Integer> crearTascaSuma(int x, int y) {
		return CompletableFuture.supplyAsync(() -> {
			int suma = x + y;
			System.out.println("Suma de " + x + " + " + y + " = " + suma);
			synchronized (dadesCompartides) {
				dadesCompartides.add(suma);
			}
			return suma;
		});
	}

	private static CompletableFuture<Integer> crearTascaLenta(int ms, int valor) {
		return CompletableFuture.supplyAsync(() -> {
			try {
				System.out.println("Tasca lenta: esperant " + ms + " ms...");
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (dadesCompartides) {
				dadesCompartides.add(valor);
			}
			return valor;
		});
	}
}
