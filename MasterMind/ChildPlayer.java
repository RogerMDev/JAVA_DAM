import java.util.Scanner;

public class ChildPlayer extends Player{

    static Scanner lector = new Scanner(System.in);

    @Override
    public void OmplirDades() {   
        System.out.println("Digues el teu nom");
        String nomUser = lector.nextLine();
        this.setNom(nomUser); 
    }

    @Override
    public String makeGuess() {
        boolean lecturaOk = false;
        String res = null;
        do {
            System.out.print("Escriu " + MasterMind.child_random_word.length() + " lletres miníscules: ");
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
        if (resposta.length() != MasterMind.child_random_word.length()) {
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
    public void presentacio() {
        System.out.println("Benvingut/da " + this.getNom() + " , bona sort!!");
    }
    
    

}
