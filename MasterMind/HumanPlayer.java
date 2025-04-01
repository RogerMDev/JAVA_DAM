import java.util.Scanner;

public class HumanPlayer extends Player{

    static Scanner lector = new Scanner(System.in);

    @Override
    public String makeGuess(){
        boolean lecturaOk = false;
        String res = null;
        do {
            System.out.print("Escriu " + MasterMind.LONG_SECRET + " lletres miníscules: ");
            res = lector.next();
            lector.nextLine();
            lecturaOk = comprovarResposta(res);
            if (!lecturaOk) {
                System.out.println("Aquesta resposta no és vàlida!");
            }
        } while (!lecturaOk);
        return res;
    }

    public boolean comprovarResposta(String resposta) {
        if (resposta.length() != MasterMind.LONG_SECRET) {
        //Ja sabem que no és correcte.
        //Podem acabar l’execució del mètode immediatament.
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if ( -1 == MasterMind.abc.indexOf(c)){
            //Ja sabem que no és correcte.
            //Podem acabar l’execució del mètode immediatament.
                return false;
            }
        }
        //Si tot es compleix, segur que és correcte.
        return true;
    }

    @Override
    public void OmplirDades(){
        System.out.println("Digues el teu nom");
        String nomUser = lector.nextLine();
        this.setNom(nomUser);
        System.out.println("Digues el teu cognom");
        String cognomUser = lector.nextLine();
        this.setCognom(cognomUser);
        System.out.println("Digues la teva edat");
        int edatUser = lector.nextInt();
        this.setEdat(edatUser);
        System.out.println("Digues el teu nivell (0 --> principant | 1 --> Intermig |2 --> Expert)");
        int nivellUser = lector.nextInt();
        this.setNivell(nivellUser);
    }

    @Override
    public void presentacio(){
        System.out.println("Benvingut/da " + this.getNom() + " " + this.getCognom() + " , bona sort!!");
    }
}


