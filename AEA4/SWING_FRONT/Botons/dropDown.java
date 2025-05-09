import java.awt.*;
import javax.swing.*;

public class dropDown {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dropdown múltiple (simulat)");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton desplegable = new JButton("Tria opcions ▾");

        // Crear el menú popup amb opcions múltiples
        JPopupMenu menu = new JPopupMenu();
        JCheckBoxMenuItem opcio1 = new JCheckBoxMenuItem("Opció 1");
        JCheckBoxMenuItem opcio2 = new JCheckBoxMenuItem("Opció 2");
        JCheckBoxMenuItem opcio3 = new JCheckBoxMenuItem("Opció 3");

        menu.add(opcio1);
        menu.add(opcio2);
        menu.add(opcio3);

        // Mostrar el menú quan es clica el botó
        desplegable.addActionListener(e -> {
            menu.show(desplegable, 0, desplegable.getHeight());
        });

        frame.add(desplegable);
        frame.setVisible(true);
    }
}
