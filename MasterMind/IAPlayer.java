import java.util.*;

public class IAPlayer extends Player {
    private List<Character> letrasDisponibles;
    private List<Character> letrasSeguras;
    private List<Character> letrasDescartadas;
    private char[] posicionesConocidas;
    private String ultimoIntento;
    private int longitudPalabra;
    private Random random;

    public IAPlayer() {
        this.random = new Random();
        this.letrasDisponibles = new ArrayList<>();
        this.letrasSeguras = new ArrayList<>();
        this.letrasDescartadas = new ArrayList<>();
        this.longitudPalabra = MasterMind.adult_random_word.length();
        this.posicionesConocidas = new char[longitudPalabra];

        for (char c : MasterMind.abc.toCharArray()) {
            letrasDisponibles.add(c);
        }
    }

    @Override
    public String makeGuess() {
        char[] intento = new char[longitudPalabra];

        // Paso 1: Colocar letras en posiciones conocidas
        for (int i = 0; i < longitudPalabra; i++) {
            if (posicionesConocidas[i] != 0) {
                intento[i] = posicionesConocidas[i];
            } else {
                intento[i] = seleccionarMejorLetra();
            }
        }

        this.ultimoIntento = new String(intento);
        return ultimoIntento;
    }

    private char seleccionarMejorLetra() {
        // Seleccionar una letra no descartada al azar
        List<Character> opciones = new ArrayList<>(letrasDisponibles);
        opciones.removeAll(letrasDescartadas);

        // Priorizar letras seguras que no estén ya colocadas
        for (char letraSegura : letrasSeguras) {
            if (!yaEstaColocada(letraSegura)) {
                return letraSegura;
            }
        }

        return opciones.isEmpty() ? getLetraAleatoria() : opciones.get(random.nextInt(opciones.size()));
    }

    private boolean yaEstaColocada(char letra) {
        for (char posicion : posicionesConocidas) {
            if (posicion == letra) {
                return true;
            }
        }
        return false;
    }

    private char getLetraAleatoria() {
        return letrasDisponibles.get(random.nextInt(letrasDisponibles.size()));
    }

    public void recibirFeedback(String feedback) {
        if (ultimoIntento == null || feedback == null) return;

        for (int i = 0; i < feedback.length(); i++) {
            char letra = ultimoIntento.charAt(i);
            char simbolo = feedback.charAt(i);

            if (simbolo == MasterMind.TOT_CORRECTE) {
                posicionesConocidas[i] = letra; // Fijar posición correcta
                if (!letrasSeguras.contains(letra)) letrasSeguras.add(letra);
            } else if (simbolo == MasterMind.MALA_POSICIO) {
                if (!letrasSeguras.contains(letra)) letrasSeguras.add(letra);
            } else if (simbolo == MasterMind.INCORRECTE) {
                letrasDescartadas.add(letra);
            }
        }

        letrasDisponibles.removeAll(letrasDescartadas); // Limpiar letras descartadas
    }

    public void IaPensant(){
        try {
            // Pausa de 2 segundos (2000 milisegundos)
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // Manejo de la excepción (opcional pero recomendado)
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            System.err.println("El sleep fue interrumpido: " + e.getMessage());
        }
    }

    @Override
    public void presentacio() {}

    @Override
    public void OmplirDades() {}
}
