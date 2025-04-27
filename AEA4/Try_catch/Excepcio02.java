package Try_catch;

public class Excepcio02 {
    public static void main (String args[]){
        String t[] = {"Hola", "Adéu", "Fins demà"};
        try {
            System.out.println("Abans d'executar el for");
            for (int i = 0; i <= t.length; i++){
                System.out.println("Posicio " + i + " : " + t[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El programador estava a la lluna... S'ha sortit dels limits");
        }
        finally {
            System.out.println("Final del programa");
        }
    }
}
