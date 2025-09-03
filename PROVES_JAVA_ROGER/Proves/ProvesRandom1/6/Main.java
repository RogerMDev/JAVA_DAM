public class Main {
    public static void main(String[] args) {
        Ave ave1 = new Ave("Paloma", "Macho", 2,2,2);
        Mamifero mamifero1 = new Mamifero("Oso", "Hembra", 2, 4, 4);
        
        System.out.println("");
        ave1.comer();
        ave1.comer2();

        System.out.println("");
        System.out.println("");

        mamifero1.comer();
        mamifero1.comer2();
    }
}
