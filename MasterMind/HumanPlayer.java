import java.util.Scanner;

public class HumanPlayer extends Player{

    CodeGenerator codi = new CodeGenerator();
    MasterMind joc = new MasterMind();

    @Override
    public String makeGuess(){
                Scanner lector = new Scanner(System.in);
        boolean lecturaOk = false;
        String res = null;
        do {
            System.out.print("Escriu " + codi.LONG_SECRET + " lletres miníscules: ");
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
        if (resposta.length() != joc.LONG_SECRET) {
        //Ja sabem que no és correcte.
        //Podem acabar l’execució del mètode immediatament.
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if ( -1 == abc.indexOf(c)){
            //Ja sabem que no és correcte.
            //Podem acabar l’execució del mètode immediatament.
                return false;
            }
        }
        //Si tot es compleix, segur que és correcte
        return true;
    }
}
