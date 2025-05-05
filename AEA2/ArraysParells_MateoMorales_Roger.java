
public class ArraysParells_MateoMorales_Roger{
    public static void main ( String[] args){
    try {
        int nombres[] = new int[100];

        nombres[0] = 0;

        for (int i = 0; i< nombres.length; i++){
            nombres[i] = i*2;
        }
        System.out.println("La llista dels primers 100 nombres parells es:  ");
        for (int i = 0; i<= nombres.length; i++){

            System.out.print(nombres[i] + " ");
        }
        
    } catch (ArrayIndexOutOfBoundsException indexOut) {
        System.out.println("Hi ha hagut un error: " + indexOut);
    } catch(Exception e){
        System.out.println("Error " + e);
    }
    }
}


