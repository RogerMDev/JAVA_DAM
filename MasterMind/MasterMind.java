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
    public static int LONG_SECRET = 6;
    public static int SHORT_SECRET = 3;

    static Scanner sc = new Scanner(System.in);

    static HumanPlayer playerH = new HumanPlayer();
    static ChildPlayer playerC = new ChildPlayer();
    static FeedBack feedb = new FeedBack();
    static CodeGenerator codeGen = new CodeGenerator();

    //Mètodes associats al problema general
    public static void main(String[] args) {
        System.out.println("Digues si juegues com adult (A) o nen/a (C)");
        char modeJoc = sc.next().charAt(0);
        if (modeJoc == 'A'){
            secret = codeGen.GenerateLongCode();
            playerH.OmplirDades();
            playerH.presentacio();
            boolean encertat = false;
            while (!encertat) {
                resposta = playerH.makeGuess();
                encertat = feedb.resoldreResposta(secret, resposta);
            }
        } {
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
}

