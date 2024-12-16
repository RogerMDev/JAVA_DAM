public class ProbaCity {

    public static void Ladrar(){
        System.out.println("GUAU, GUAU!");
    }
    public static String DarNombre(){
        return "Max";
    }
    public static int CalcularEdad(int a, int b){
        return a+b;
    }
    public static void main (String[] args){
    System.out.println("Hola soy " + DarNombre());
    Ladrar();
    System.out.println("Mi edad es:" + CalcularEdad(4,6));
    }
}



