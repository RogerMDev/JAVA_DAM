import java.awt.*;
import javax.swing.*;

public class BotoSimple {
    public static void main(String[] args) {
        
        // Creació de la finestra
        JFrame finestra = new JFrame("Botó centrat");
        finestra.setSize(300, 200);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new GridBagLayout()); 

        // Creació del botó
        JButton boto = new JButton("Fes click");
        boto.setPreferredSize(new Dimension(100, 30)); 

        // Afegir el botó
        finestra.add(boto);

        // Mostrar la finestra
        finestra.setVisible(true);
    }
}


