package TicTacToe;
import java.util.Scanner;

public class TaulerActivitat {
    private char[][] tauler;
    Scanner sc = new Scanner(System.in);

    public TaulerActivitat(){
        System.out.println("Digues cuantes files i columnes vols");
        int filesicolumnes = sc.nextInt();
        tauler = new char[filesicolumnes][filesicolumnes];
        for (int i = 0; i < tauler.length; i++ ){
            for (int j = 0; j < tauler[i].length; j++){
                tauler[i][j] = '-';
            }
        }
        MostrarTaulell();
    }

    public void MostrarTaulell(){
        System.out.println("-------------------");
        for (int i = 0; i < tauler.length; i++ ){
            for (int j = 0; j < tauler[i].length; j++){
                System.out.print(tauler[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------");
    }

    public void IntroduirValors(int fila, int columna, char jugador){
        
        if (fila >= 0 && fila <= tauler.length && columna >= 0 && columna <= tauler.length){
            if (tauler[fila][columna] == '-'){
                tauler[fila][columna] = jugador;             
            }
            else{
                System.out.println("Introdueix una casella buida");
            }
        }
        MostrarTaulell();
    }

    /*public boolean ComprovarResultat() {---  ALGORITME PER EL 3 EN RATLLA CONVENCIONAL  ------------------------
        
        for (int i = 0; i < tauler.length; i++){
            for (int j = 0; j < tauler.length; j++) {
                if ((tauler[j][0] == 'X' && tauler[j][1] == 'X' && tauler[j][2] == 'X') || 
                    (tauler[0][j] == 'X' && tauler[1][j] == 'X' && tauler[2][j] == 'X')) {
                    System.out.println("Ha guanyat el jugador X");
                    return true;
                }
                if ((tauler[j][0] == 'O' && tauler[j][1] == 'O' && tauler[j][2] == 'O') || 
                    (tauler[0][j] == 'O' && tauler[1][j] == 'O' && tauler[2][j] == 'O')) {
                    System.out.println("Ha guanyat el jugador O");
                    return true;
                }
            }
            if ((tauler[0][0] == 'X' && tauler[1][1] == 'X' && tauler[2][2] == 'X') || 
                (tauler[0][2] == 'X' && tauler[1][1] == 'X' && tauler[2][0] == 'X')) {
                System.out.println("Ha guanyat el jugador X");
                return true;
            }
            if ((tauler[0][0] == 'O' && tauler[1][1] == 'O' && tauler[2][2] == 'O') || 
                (tauler[0][2] == 'O' && tauler[1][1] == 'O' && tauler[2][0] == 'O')) {
                System.out.println("Ha guanyat el jugador O");
                return true;
            }
        }
        return false;
    }  ---------------------------  ALGORITME PER EL 3 EN RATLLA CONVENCIONAL  -----------------------------------*/

    public boolean ComprovarResultat() {
        // Comprobar files y columnes
        for (int i = 0; i < tauler.length; i++) {
            if (comprovarLinia(tauler[i]) || comprovarLinia(getColumna(i))) {
                return true;
            }
        }
        
        if (comprovarLinia(getDiagonalPrincipal()) || comprovarLinia(getDiagonalSecundaria())) {
        return true;
        }
        return false;
    }

    // Comprobar si una fila te el mateix simbol i no hi ha '-'
    private boolean comprovarLinia(char[] linia) {
        char simbol = linia[0];
        if (simbol == '-') return false; // Si el primer element de la linea es '-'  es retorna fals i no es segueix mirant

        for (char c : linia) {
            if (c != simbol) return false; // Si ha un caràcter diferent al simbol, es retorna fals
        }

        System.out.println("Ha guanyat el jugador " + simbol); //si no es compleixen cap de les due
        return true;
    }

    // Obtenir una columna com array
    private char[] getColumna(int col) {
        char[] columna = new char[tauler.length];
        for (int i = 0; i < tauler.length; i++) {
            columna[i] = tauler[i][col];
        }
        return columna;
    }

    // Obtenir la diagonal principal
    private char[] getDiagonalPrincipal() {
        char[] diagonal = new char[tauler.length];
        for (int i = 0; i < tauler.length; i++) {
            diagonal[i] = tauler[i][i];
        }
        return diagonal;
    }

    // Obtenir la diagonal principal
    private char[] getDiagonalSecundaria() {
        char[] diagonal = new char[tauler.length];
        for (int i = 0; i < tauler.length; i++) {
            diagonal[i] = tauler[i][tauler.length - 1 - i];
        }
        return diagonal;
    }

    public boolean TaulellPle(){

        for (int i = 0; i < tauler.length; i++ ){
            for (int j = 0; j < tauler[i].length; j++){
                if (tauler[i][j] == '-'){
                return false;
                }
            }
        }
        System.out.println("El taulell està ple");
        return true;
    }
}
