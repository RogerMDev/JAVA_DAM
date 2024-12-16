public class Funcions1 {

    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int c = 15;
        CalcularMax(a,b,c);
        int d = 55;
        int e = 68;
        int f = 77;
        
        int mitjana2 = Mitjana(d,e,f);
        int mitjana = Mitjana(a,b,c);
        int min = CalcularMin(a,b,c);
        System.out.println("El nombre més petit és el :" + min );
        System.out.println("La mitjana és : " + mitjana);
        System.out.println("La mitjana és : " + mitjana2);
    }

    public static void CalcularMax(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println("El nombre més gran es el nombre 1");
        } 
        else if (num2 > num1 && num2 > num3){
            System.out.println("El nombre més gran es el nombre 2");
        } 
        else {
            System.out.println("El nombre més gran es el nombre 3");
        }  
    }

    public static int CalcularMin(int num1,int num2,int num3){
        if(num1 < num2 && num1 < num3){
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else if (num3 < num1 && num3 < num2){
            return num3;
        } else{
            return 0;
        }   
    }
    public static int Mitjana(int num1, int num2, int num3){
        int mitjana = (num1+num2+num3)/3;
        return mitjana;
    }
}
