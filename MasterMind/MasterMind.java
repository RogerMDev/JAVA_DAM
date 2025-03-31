public class MasterMind {
    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public final static String ENCERTAT = "OOO";
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String secret = "";
    public static String resposta = "";
    public static int LONG_SECRET = 3;

    static HumanPlayer playerH = new HumanPlayer();
    static FeedBack feedb = new FeedBack();
    static CodeGenerator codeGen = new CodeGenerator();

    //Mètodes associats al problema general
    public static void main(String[] args) {
        secret = codeGen.GenerateCode();
        playerH.OmplirDades();
        System.out.println("holapadel");
        playerH.presentacio();
        boolean encertat = false;
        while (!encertat) {
            resposta = playerH.makeGuess();
            encertat = feedb.resoldreResposta(secret, resposta);
        }
    }
}