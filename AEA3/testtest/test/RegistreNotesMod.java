package test;
public class RegistreNotesMod {
  public static void main(String[] args) {
    RegistreNotesMod programa = new RegistreNotesMod();
    programa.inici();
  }

  public void inici() {
    double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
    //Per cridar els mètodes cal inicialitzar la classe que els conté
    CalculsArrayReals calculador = new CalculsArrayReals();
    //Un cop fet, cal cridar−los usant com a prefix l’identificador
    double max = calculador.calcularMaxim(notes);
    double min = calculador.calcularMinim(notes);
    double mitjana = calculador.calcularMitjana(notes);
    System.out.println("La nota màxima és " + max + ".");
    System.out.println("La nota mínima és " + min + ".");
    System.out.println("La mitjana de les notes és " + mitjana + ".");
  }
}
