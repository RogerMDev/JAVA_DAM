public class CodeGenerator {

    public int LONG_SECRET = 3;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";

    public String GenerateCode(){
        String res = "";
        for (int i = 0; i < LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }

    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % abc.length());
        return abc.charAt(index);
    }

}
