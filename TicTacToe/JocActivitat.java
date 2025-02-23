package TicTacToe;

import java.util.Scanner;
import TICTACTOE_JAVA.TaulerActivitat;

public class JocActivitat {
    public char jugador; 
    private final TaulerActivitat NouTaulell = new TaulerActivitat();
    Scanner sc = new Scanner(System.in);
    public int fila;
    public int columna;
    public char jugador1;

    public boolean IniciarJoc(){
        jugador = EscollirJugador();
        while (!NouTaulell.ComprovarResultat() && !NouTaulell.TaulellPle()){
            jugadorActual();
            FerTorn(); 
            CambiarTorn();
            if (NouTaulell.ComprovarResultat()){
                break;
            } 
        }
        return true;
    }

    public void jugadorActual(){
        System.out.println("Torn del jugador: " + jugador);
    }

    public char EscollirJugador(){
        System.out.println("Digues quin jugador comença el joc");
        char jugador = sc.next().charAt(0);
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
        NouTaulell.IntroduirValors(fila, columna, jugador);
        return true;
    }    
}





