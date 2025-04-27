package Gestionar_Documents_amb_Java;
import java.io.File;
public class FileObtenirRuta {

    public static void main(String[] args){
        File carpetaAbs = new File("c:/Temp");
        File fitxerAbs = new File ("c:/Temp/Document.txt");
        File carpetaRel = new File ("Temp");
        File fitxerRel = new File ("Temp/Document.txt");
        mostrarRutes(carpetaAbs);
        mostrarRutes(fitxerAbs);
        mostrarRutes(carpetaRel);
        mostrarRutes(fitxerRel);
    }

    public static void mostrarRutes(File f){
        System.out.println("La ruta és " + f.getAbsolutePath());
        System.out.println("El seu pare és " + f.getParent());
        System.out.println("El seu nom és " + f.getName() + "\n");
    }

}