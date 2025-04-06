import java.util.Scanner;

public class MasterMind {
    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public final static String ENCERTAT = "OOO";
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String secret = "";
    public static String resposta = "";
    public static String resposta2 = "";
    public static String[] adult_words = {"camaleo", "tempesta", "escorpi", "llibertat", "trencaclosques", "espectre", "desxifrar", "paraigua", "xocolata", "esquerra", "fletxa", "ocell", "tardor", "espasa", "escaleta", "tambori", "ventall", "esquirol", "llimona", "escalfor"};
    public static String[] child_words = {"poma", "llop", "casa", "peix", "llum", "bany", "cent", "cera", "sola", "tard", "eina", "vent", "roca", "foca", "brou", "clau", "flor", "cara", "tren", "olla"};
    public static String adult_random_word = "";
    public static String child_random_word = "";

    static Scanner sc = new Scanner(System.in);
    
    static HumanPlayer playerH = new HumanPlayer();
    static ChildPlayer playerC = new ChildPlayer();
    static FeedBack feedb = new FeedBack();
    static CodeGenerator codeGen = new CodeGenerator();

    //Mètodes associats al problema general
    public static void main(String[] args) {
        System.out.println("Digues si juegues com adult (A) o nen/a (C)");
        char modeJoc = sc.next().charAt(0);
        sc.nextLine();
        if (modeJoc == 'A' || modeJoc == 'a'){
            secret = codeGen.GenerateLongCode();
            IAPlayer iaPlayer = new IAPlayer();
            playerH.OmplirDades();
            playerH.presentacio();
            boolean encertat = false;
            while (!encertat) {
                resposta = playerH.makeGuess();
                encertat = feedb.resoldreResposta(secret, resposta);
                if (encertat){
                    break;
                }
                System.out.println("TORN DE LA IA");
                iaPlayer.IaPensant();
                resposta2 = iaPlayer.makeGuess();
                System.out.println("La IA proposa la combinació: " + resposta2);
                encertat = feedb.resoldreResposta(secret, resposta2);
                iaPlayer.recibirFeedback(feedb.res);
            }
        } {
            //JOC COM A NEN
            secret = codeGen.GenerateShortCode();
            playerC.OmplirDades();
            playerC.presentacio();
            boolean encertat = false;
            while (!encertat) {
                resposta = playerC.makeGuess();
                encertat = feedb.resoldreResposta(secret, resposta);
            }
        }
    }

    public static String[] getChild_words() {
        return child_words;
    }

    public static void setChild_words(String[] child_words) {
        MasterMind.child_words = child_words;
    }

    public static String[] getAdult_words() {
        return adult_words;
    }

    public static void setAdult_words(String[] adult_words) {
        MasterMind.adult_words = adult_words;
    }

/*    public void IaPensant(){
        try {
            // Pausa de 2 segundos (2000 milisegundos)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Manejo de la excepción (opcional pero recomendado)
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            System.err.println("El sleep fue interrumpido: " + e.getMessage());
        }
    } */
}

