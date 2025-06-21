package arrayList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Marta");
        nombres.add("Joel");

        arrayList.Controller controller = new Controller();
        String resultado = controller.gestionarNombres(nombres);
        System.out.println("Resultado final: " + resultado);
    }
}
