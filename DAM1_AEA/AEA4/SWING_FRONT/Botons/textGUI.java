import java.awt.*;
import javax.swing.*;

public class textGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Etiqueta i camp petit
        JLabel petitLabel = new JLabel("Nom:");
        gbc.gridy = 0;
        frame.add(petitLabel, gbc);

        JTextField campPetit = new JTextField();
        campPetit.setPreferredSize(new Dimension(200, 25));
        gbc.gridy = 1;
        frame.add(campPetit, gbc);

        // Etiqueta i camp gran
        JLabel granLabel = new JLabel("Comentari:");
        gbc.gridy = 2;
        frame.add(granLabel, gbc);

        JTextArea campGran = new JTextArea(5, 20);
        JScrollPane scroll = new JScrollPane(campGran);
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(scroll, gbc);

        frame.setVisible(true);
    }
}

