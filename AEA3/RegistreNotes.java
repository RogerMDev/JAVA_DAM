public class RegistreNotes {
  public static void main(String[] args) {
    RegistreNotes programa = new RegistreNotes();
    programa.inici();
  }
  public void inici() {
    double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
    double max = calcularMaxim(notes);
    double min = calcularMinim(notes);
    double mitjana = calcularMitjana(notes);
    System.out.println("La nota màxima és " + max + ".");
    System.out.println("La nota mínima és " + min + ".");
    System.out.println("La mitjana de les notes és " + mitjana + ".");

    //double[] temperatura = {12.0, 15.5, 17.25, 13.0, 19.5, 1.25, 17.0, 17.5};
    //double max2 = calcularMaxim(temperatura);

  }

  public double calcularMaxim(double[] array) {
    double max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    return max;
  }

  public double calcularMinim(double[] vector) {
    double min = vector[0];
    for (int i = 1; i < vector.length; i++) {
      if (min > vector[i]) {
        min = vector[i];
      }
    }
    return min;
  }

  public double calcularMitjana(double[] array) {
    double suma = 0;
    for (int i = 0; i < array.length; i++) {
      suma = suma + array[i];
    }
    return suma/array.length;
  }
}
