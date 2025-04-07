import java.util.Random;

public class CodeGenerator {

    public static Random rand = new Random();

    public CodeGenerator(){
        
    }
    public String GenerateLongCode(){
        String paraulaLlargaSeleccionada = (MasterMind.getAdult_words())[rand.nextInt(20)];
        MasterMind.adult_random_word = paraulaLlargaSeleccionada;
        return paraulaLlargaSeleccionada;
    }

    public String GenerateShortCode(){
        String paraulaCurtaSeleccionada = (MasterMind.getChild_words())[rand.nextInt(20)];
        MasterMind.child_random_word = paraulaCurtaSeleccionada;
        return paraulaCurtaSeleccionada;
    }

    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % MasterMind.abc.length());
        return MasterMind.abc.charAt(index);
    }
}

