package Try_catch;

public class Excepcio01 {
    
    public static void main (String args[] ){
        String t[] = {"Hola", "Adéu", "Fins demà"};

        try {
        
            for (int i = 0; i <= t.length; i++){
                System.out.println("Posició " + i + " : " + t[i]);
            }
            
        } catch (Exception e) {
            System.out.println("Hi ha hagut un error durant l'execució: " + e );
        }
        System.out.println("El programa s'ha acabat.");
        
    }
}
