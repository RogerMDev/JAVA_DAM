import java.util.Scanner;

public class Endevina{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int[] vec = new int[5];
    vec[0]=1;
    vec[1]=2;        
    vec[2]=3;
    vec[3]=4;
    vec[4]=5;
    
        for (int i=0;i <5; i++){
            System.out.println("Posicio  " + i + "=" + vec[i]);
        }
    }
}

