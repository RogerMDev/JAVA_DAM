import java.awt.*;
import javax.swing.*;

public class botoDoble {
    public static void main(String[] args) {
        // Crear la finestra
        JFrame finestra = new JFrame("Exemple dos botons");
        finestra.setSize(400, 500);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.NONE;

        // Crear el primer botó
        JButton boto1 = new JButton("Fes click al primer botó");
        boto1.setPreferredSize(new Dimension(100, 30));
        gbc.gridy = 0;
        gbc.insets = new Insets(0,0,10,0); // S'afegeix un marge inferior de 10px
        finestra.add(boto1,gbc);

        // Crear el segon botó
        JButton boto2 = new JButton("Fes click al segon botó");
        boto2.setPreferredSize(new Dimension(100,30));
        gbc.gridy = 1;
        gbc.insets = new Insets(10,0,0,0); // S'afegeix un marge superior de 10 px
        finestra.add(boto2,gbc);
        
        // Mostrar la finestra
        finestra.setVisible(true);
    }
}

