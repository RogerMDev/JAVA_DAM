package HerenciaSimple;

public class Main {

    public static void main(String[] args){

        Persona p = new Persona(1,25,"Roger", "Mateo", "Av Barcelona");

        String[] assignaturesAndreaMartinez = {"LLMarques", "Programació", "BBDD", "Desenvolupament"};
        double[] notesAndreaMartinez = {5.6,2.1,8.9,9.9};

        Estudiant e = new Estudiant(1,31,"Andrea","Martinez","Carrer Balmes",
        "Segon de DAM", assignaturesAndreaMartinez,"Bon Salvador",notesAndreaMartinez);

        System.out.println("La adreça d'en " + p.getNom() + " " + p.getCognom() + " és: " + p.getAdreca());
        System.out.println("En " + p.getNom() + " " + p.getCognom() + " té l'identificador: " + p.getId() + "i té " + p.getEdat() + " anys.");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("L'" + e.getNom() + " " + e.getCognom() + " ha estudiat a l'escola " + e.getEscola() + 
        " " + e.getCurs());
        System.out.println("L'" + e.getNom() + " " + e.getCognom() + " té " + e.getEdat() + 
        " anys i viu al " + e.getAdreca());
        System.out.print("Les notes de l'" + e.getNom() + " " + e.getCognom()+ " són: [" );
        for (int i = 0; i < notesAndreaMartinez.length; i++){
            System.out.print(notesAndreaMartinez[i] + "  ");
        }
        System.out.print("],  en les assignatures de : [");
        for (int i = 0; i < assignaturesAndreaMartinez.length; i++){
            System.out.print(assignaturesAndreaMartinez[i] +"  ");
        }
        System.out.print(" ] ");


        
    }
    
}
