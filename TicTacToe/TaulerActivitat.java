package TicTacToe;

public class TaulerActivitat {
    private char[][] tauler;

    public TaulerActivitat(){

        tauler = new char[3][3];
        for (int i = 0; i < tauler.length; i++ ){
            for (int j = 0; j < tauler[i].length; j++){
                tauler[i][j] = '-';
            }
        }
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
        
        if (fila >= 0 && fila <= 2 && columna >= 0 && columna <= 2){
            if (tauler[fila][columna] == '-'){
                tauler[fila][columna] = jugador;             
            }
            else{
                System.out.println("Introdueix una casella buida");
            }
        }
        MostrarTaulell();
    }

    public boolean ComprovarResultat(){
        for (int i = 0; i < 3; i++){
            if ((tauler[i][0] == 'X' && tauler[i][1] =='X' && tauler[i][2] == 'X') || 
            (tauler[0][i] == 'X' && tauler[1][i] == 'X' && tauler[2][i] == 'X')||
            (tauler [0][0] == 'X' && tauler [1][1] == 'X' && tauler [2][2] == 'X' )){  
                System.out.println("Ha guanyat el jugador X");
                return true;
                
            }
            if ((tauler[i][0] == 'O' && tauler[i][1] =='O' && tauler[i][2] == 'O') || 
            (tauler[0][i] == 'O' && tauler[1][i] == 'O' && tauler[2][i] == 'O')||
            (tauler [0][0] == 'O' && tauler [1][1] == 'O' && tauler [2][2] == 'O' )){ 
                System.out.println("Ha guanyat el jugador O");
                return true;
            }
        }
        return false;
    }

    public boolean TaulellPle(){

        for (int i = 0; i < tauler.length; i++ ){
            for (int j = 0; j < tauler[i].length; j++){
                if (tauler[i][j] == '-'){
                System.out.println("El taulell no està ple");
                return false;
                }
            }
        }
        System.out.println("El taulell està ple");
        return true;
    }
}
