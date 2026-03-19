package app1.exemple;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TasquesParallelesCompletableFutureSenseRetorn {

	private static final List<Integer> dadesCompartides = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("=== CompletableFuture amb Runnable (sense retorn) ===");

		CompletableFuture<Void> tasca1 = crearTascaAfegir(10, 20);
		CompletableFuture<Void> tasca2 = crearTascaAfegir(5, 15);
		CompletableFuture<Void> tasca3 = crearTascaSuma(100, 200);
		CompletableFuture<Void> tasca4 = crearTascaLenta(1500, 999);

		CompletableFuture<Void> totes = CompletableFuture.allOf(tasca1, tasca2, tasca3, tasca4);

		totes.join(); // Esperar totes

		synchronized (dadesCompartides) {
			System.out.println("\nDades compartides finals: " + dadesCompartides);
		}

		System.out.println("Execució finalitzada.");
	}

	// ---------------- MÈTODES QUE RETORNEN COMPLETABLEFUTURE<Void>
	// ----------------

	private static CompletableFuture<Void> crearTascaAfegir(int a, int b) {
		return CompletableFuture.runAsync(() -> {
			System.out.println("Afegint " + a + " i " + b);
			synchronized (dadesCompartides) {
				dadesCompartides.add(a);
				dadesCompartides.add(b);
			}
		});
	}

	private static CompletableFuture<Void> crearTascaSuma(int x, int y) {
		return CompletableFuture.runAsync(() -> {
			int suma = x + y;
			System.out.println("Suma de " + x + " + " + y + " = " + suma);
			synchronized (dadesCompartides) {
				dadesCompartides.add(suma);
			}
		});
	}

	private static CompletableFuture<Void> crearTascaLenta(int ms, int valor) {
		return CompletableFuture.runAsync(() -> {
			try {
				System.out.println("Tasca lenta: esperant " + ms + " ms...");
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (dadesCompartides) {
				dadesCompartides.add(valor);
			}
		});
	}
}
