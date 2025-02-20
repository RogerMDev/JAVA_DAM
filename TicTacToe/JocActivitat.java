package TicTacToe;

import java.util.Scanner;

public class JocActivitat {
    private TaulerActivitat tauler;
    private char jugadorActual;
    private boolean guanyador;
    private Scanner scanner;
    private char jugador = 'X';
    private boolean CrearJoc;
    private final TaulerActivitat NouTaulell = new TaulerActivitat();
    Scanner sc = new Scanner(System.in);
    public int fila;
    public int columna;
    public char jugador1;

    public boolean IniciarJoc(){
        while (!NouTaulell.ComprovarResultat() || !NouTaulell.TaulellPle()){
            NouTaulell.MostrarTaulell();
            jugadorActual();
            FerTorn();
            NouTaulell.ComprovarResultat();
            CambiarTorn();
            if (NouTaulell.ComprovarResultat()){
                break;
            } 
        }
        return true;
    }

    public char jugadorActual(){
        System.out.println("Torn del jugador: " + jugador);
        return jugador;
    }

    public char CambiarTorn(){
        if (jugador =='X'){
            jugador = 'O';
        } else{
            jugador = 'X';
        }
        return jugador;
    }
    public boolean FerTorn(){
        System.out.println("Diques les coordenades amb : (1: fila , 2: columna)");
        fila = sc.nextInt();
        columna = sc.nextInt();
        //jugador1 = sc.next().charAt(0);
        NouTaulell.IntroduirValors(fila, columna, jugador);
        return true;
    }    
}
