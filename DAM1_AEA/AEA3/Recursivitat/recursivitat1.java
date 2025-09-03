import java.util.Scanner;

public class recursivitat1{

static Scanner sc = new Scanner(System.in);

//Queremos calcular:
//potencia(base,exponente)=base^exponente

//Con los casos base:
//potencia(base,0)=1

//🎯 Ejemplo
//potencia(2, 3) = 2 × 2 × 2 = 8

    public static int potencia(int base, int exponent){
        if (exponent == 0){
            return 1;
        }
        return base * potencia(base,exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println("Digues quina és la base");
        int base = sc.nextInt();
        System.out.println("Digues quin és l'exponent");
        int exponent = sc.nextInt();
        System.out.println("La potencia de " + base + " elevat a " + exponent + " és " + potencia(base,exponent) + ".");
    }
}