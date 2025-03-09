import java.util.Scanner;

public class Compres{
    private final CompresMOD CompresMOD = new CompresMOD();
    public int[] NumCompres;
    public int articlescomprats;
    public Scanner sc = new Scanner(System.in);
    public boolean quantitatproductescomprats = false;
    

    public  void main(String[] args){
        Inici();
        Seleccio();
    }

    public int[] Inici(){

        System.out.println("Digues la cuantitat de productes que has comprat: ");

        boolean preguntacuantitat = true;

        while (preguntacuantitat){
            
            if (sc.hasNextInt()){
                articlescomprats = sc.nextInt();
                preguntacuantitat = false;
            } else {
                System.out.println("Introdueix un nombre enter");
                sc.nextLine();
            }
        }
        NumCompres = new int[articlescomprats];

        System.out.println("Digues els preus dels productes comprats: ");
        
        boolean preguntaproductes = true;
        
        while (preguntaproductes){
            if (sc.hasNextInt()){
                for (int i = 0; i < articlescomprats; i++) {
                    System.out.println("Article " + (i+1) + " : ");
                            if (sc.hasNextInt()) {
                                NumCompres[i] = sc.nextInt();
                                break;
                            }
                        }
                    
                } else {
                System.out.println("Introdueix un nombre enter");
                sc.next();
            }
        }
        System.out.println("Ja has omplert tots els preus");
        return NumCompres;
    }

    public void Seleccio(){

        System.out.println("Selecciona una opció : ");
        System.out.println("1. Calcular Maxim");
        System.out.println("2. Calcular Minim");
    
        while (true){
            
            if (sc.hasNextInt()){
                int opcioreal = sc.nextInt();
                switch (opcioreal) {
                    case 1:
                    CompresMOD.TrobarMax(NumCompres);
                    break;
                    case 2:
                    CompresMOD.TrobarMin(NumCompres);
                    break;
                    default :
                    System.out.println("Introdueix un nombre vàlid");
                    sc.nextLine();
                    }
                } 
            }
    }
}