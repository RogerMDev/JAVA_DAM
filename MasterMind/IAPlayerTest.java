import java.util.*;

public class IAPlayerTest extends Player { 

    Random rand = new Random();
    private char[] lletresCorrectes = new char[MasterMind.adult_random_word.length() - 1 ];
    private String respostaFinal = "";

    public IAPlayerTest() {

    }

    @Override
    public String makeGuess() {
        boolean full = false;

        for (int i = 0; 0 < MasterMind.adult_random_word.length(); i++){
                int indexRandom = rand.nextInt(MasterMind.abc.length());
                respostaFinal += MasterMind.abc.charAt(indexRandom);
        }
        return respostaFinal;
    }

    public void recibirFeedback(String feedback) {
        if (feedback.)
    }

    public void IaPensant(){
        try {
            // Pausa de 2 segundos (2000 milisegundos)
            Thread.sleep(2000);
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

