public class Main{
    public static void main(String[] args) {
        Coche coche1 = new Coche("Hyundai", "Santa Fe", 1998, 5);
        Coche coche2 = new Coche("Ferrari", "La Ferrari", 2023,3);

        Moto moto1 = new Moto("Kawasaki", "Z300",2013, 299);
        Moto moto2 = new Moto("Yahama", "R1", 2006, 998);

        coche1.mostrarInfo();
        moto2.mostrarInfo();
        moto1.mostrarInfo();
        coche2.mostrarInfo();
    }
}