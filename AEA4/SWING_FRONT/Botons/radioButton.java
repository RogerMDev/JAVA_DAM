import java.awt.*;
import javax.swing.*;

public class radioButton {

    public static void main(String[] args) {

        // Crear la finestra
        JFrame frame = new JFrame("Tria una opció");
        frame.setSize(600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        // Configuració de posicions
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 10, 0);

        // Enunciat
        JLabel enunciat = new JLabel("<html>Selecciona una de les següents opcions:<br>Només pots marcar-ne una.</html>");
        gbc.gridy = 0;
        frame.add(enunciat, gbc);

        // Crear radio buttons
        JRadioButton opcio1 = new JRadioButton("Opció 1");
        JRadioButton opcio2 = new JRadioButton("Opció 2");
        JRadioButton opcio3 = new JRadioButton("Opció 3");

        // Agrupar-los perquè només se'n pugui marcar un
        ButtonGroup grup = new ButtonGroup();
        grup.add(opcio1);
        grup.add(opcio2);
        grup.add(opcio3);

        // Afegir els components
        gbc.gridy = 1; frame.add(opcio1, gbc);
        gbc.gridy = 2; frame.add(opcio2, gbc);
        gbc.gridy = 3; frame.add(opcio3, gbc);

        // Botó validar (sense acció)
        JButton validar = new JButton("Validar");
        gbc.gridy = 4;
        gbc.insets = new Insets(20, 0, 0, 0);
        frame.add(validar, gbc);

        // Mostrar la finestra
        frame.setVisible(true);
    }
}
