import java.util.*;

public class IAPlayer extends Player {
    private List<Character> lletresDisponibles;
    private List<Character> lletresSegures;
    private List<Character> lletresDescartades;
    private char[] posicionsConegudes;
    private char[] posicionsConegudesChild;
    private String ultimIntent;
    private int longitudParaulaLlarga;
    private int longitudParaulaCurta;
    private Random random;

    public IAPlayer() {
        this.random = new Random();
        this.lletresDisponibles = new ArrayList<>();
        this.lletresSegures = new ArrayList<>();
        this.lletresDescartades = new ArrayList<>();
        this.longitudParaulaLlarga = MasterMind.adult_random_word.length();
        this.longitudParaulaCurta = MasterMind.child_random_word.length();
        this.posicionsConegudes = new char[longitudParaulaLlarga];
        this.posicionsConegudesChild = new char[longitudParaulaCurta];

        for (char c : MasterMind.abc.toCharArray()) {
            lletresDisponibles.add(c);
        }
    }

    @Override
    public String makeGuess() {
        char[] intento = new char[longitudParaulaLlarga];

        // Paso 1: Colocar letras en posiciones conocidas
        for (int i = 0; i < longitudParaulaLlarga; i++) {
            if (posicionsConegudes[i] != 0) {
                intento[i] = posicionsConegudes[i];
            } else {
                intento[i] = seleccionarMejorLetra();
            }
        }
    
        this.ultimIntent = new String(intento);
        return ultimIntent;
    }

    public String makeGuessChild() {
        char[] intento = new char[longitudParaulaCurta];

        // Paso 1: Colocar letras en posiciones conocidas
        for (int i = 0; i < longitudParaulaCurta; i++) {
            if (posicionsConegudesChild[i] != 0) {
                intento[i] = posicionsConegudesChild[i];
            } else {
                intento[i] = seleccionarMejorLetraChild();
            }
        }
        this.ultimIntent = new String(intento);
        return ultimIntent;
    }

    private char seleccionarMejorLetra() {
        // Seleccionar una letra no descartada al azar
        List<Character> opciones = new ArrayList<>(lletresDisponibles);
        opciones.removeAll(lletresDescartades);

        // Priorizar letras seguras que no estén ya colocadas
        for (char letraSegura : lletresSegures) {
            if (!yaEstaColocada(letraSegura)) {
                return letraSegura;
            }
        }
        return opciones.isEmpty() ? getLetraAleatoria() : opciones.get(random.nextInt(opciones.size()));
    }

    private char seleccionarMejorLetraChild() {
        List<Character> opciones = new ArrayList<>(lletresDisponibles);
        opciones.removeAll(lletresDescartades);
    
        for (char letraSegura : lletresSegures) {
            if (!yaEstaColocadaChild(letraSegura)) {
                return letraSegura;
            }
        }
        return opciones.isEmpty() ? getLetraAleatoria() : opciones.get(random.nextInt(opciones.size()));
    }
    

    private boolean yaEstaColocada(char letra) {
        for (char posicion : posicionsConegudes) {
            if (posicion == letra) {
                return true;
            }
        }
        return false;
    }

    private boolean yaEstaColocadaChild(char letra) {
        for (char posicion : posicionsConegudesChild) {
            if (posicion == letra) {
                return true;
            }
        }
        return false;
    }
    

    private char getLetraAleatoria() {
        return lletresDisponibles.get(random.nextInt(lletresDisponibles.size()));
    }

    public void recibirFeedback(String feedback) {
        if (ultimIntent == null || feedback == null) return;

        for (int i = 0; i < feedback.length(); i++) {
            char letra = ultimIntent.charAt(i);
            char simbolo = feedback.charAt(i);

            if (simbolo == MasterMind.TOT_CORRECTE) {
                posicionsConegudes[i] = letra; // Fijar posición correcta
                if (!lletresSegures.contains(letra)) lletresSegures.add(letra);
            } else if (simbolo == MasterMind.MALA_POSICIO) {
                if (!lletresSegures.contains(letra)) lletresSegures.add(letra);
            } else if (simbolo == MasterMind.INCORRECTE) {
                lletresDescartades.add(letra);
            }
        }
        lletresDisponibles.removeAll(lletresDescartades); // Limpiar letras descartadas
    }

    public void recibirFeedbackChild(String feedback) {
        if (ultimIntent == null || feedback == null) return;
    
        for (int i = 0; i < feedback.length(); i++) {
            char letra = ultimIntent.charAt(i);
            char simbolo = feedback.charAt(i);
    
            if (simbolo == MasterMind.TOT_CORRECTE) {
                posicionsConegudesChild[i] = letra; // Fijar posición correcta
                if (!lletresSegures.contains(letra)) lletresSegures.add(letra);
            } else if (simbolo == MasterMind.MALA_POSICIO) {
                if (!lletresSegures.contains(letra)) lletresSegures.add(letra);
            } else if (simbolo == MasterMind.INCORRECTE) {
                lletresDescartades.add(letra);
            }
        }
        lletresDisponibles.removeAll(lletresDescartades);
    }
    

    public void IaPensant(){
        try {
            // Pausa de 2 segundos (2000 milisegundos)
            System.out.println("Pensant...");
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
