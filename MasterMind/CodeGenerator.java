public class CodeGenerator {

    public int LONG_SECRET = 3;

    public String GenerateCode(){
        String res = "";
        for (int i = 0; i < MasterMind.LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }

    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % MasterMind.abc.length());
        return MasterMind.abc.charAt(index);
    }
}

