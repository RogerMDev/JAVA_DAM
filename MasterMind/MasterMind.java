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

    HumanPlayer playerH = new HumanPlayer();
    FeedBack feedb = new FeedBack();

    //Mètodes associats al problema general
    public static void main(String[] args) {
        MasterMind programa = new MasterMind();
        programa.inici();
    }

    public void inici() {
        CodeGenerator codeGen = new CodeGenerator();
        secret = codeGen.GenerateCode();
        boolean encertat = false;
        while (!encertat) {
            resposta = playerH.makeGuess();
            encertat = feedb.resoldreResposta(secret, resposta);
        }
    }
}


