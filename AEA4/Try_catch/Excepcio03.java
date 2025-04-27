package Try_catch;

public class Excepcio03 {
    public static void main (String args[]){
        String t[] = {"Hola", "Adéu", "Fins demà"};
        try {
            System.out.println("Abans d'executar el for");
            for (int i = 0; i <= t.length; i++){
                System.out.println("Posicio " + i + " : " + t[i]);
            }
            System.out.println("Després d'executar el for");
        
        } catch (Exception e) {
            if (e instanceof StringIndexOutOfBoundsException) {
                System.out.println("El programador estava a la lluna... S'ha sortit dels límits!!");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("El programador és tonteet!!");
                System.out.println("Error :" + e);
            } else {
                System.out.println("Ha passat una altra cosa inesperada...");
            }
            System.out.println("Error: " + e);
        }
        finally {
            System.out.println("Aquest codi s'executa, peti qui peti!!!");
        }
        System.out.println("Final del programa");
    }
}


