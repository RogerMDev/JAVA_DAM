package arrayList;

import java.util.ArrayList;

public class Controller {  

    public String gestionarNombres(ArrayList<String> nombres){

        nombres.add("Roger");

        for (int i = 0; i < nombres.size(); i++){
            System.out.println("Posición "+ i + ", nombre: " + nombres.get(i));
        }

        if (nombres.size() >= 2){
            nombres.remove(1);
        }

        return String.join(" , ",nombres);
    }
}
    

