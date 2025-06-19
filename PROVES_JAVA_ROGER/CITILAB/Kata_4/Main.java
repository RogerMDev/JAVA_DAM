package Kata_4;

public class Main {
    
    public static void main(String[] args) {
        Guerrero guerrero1 = new Guerrero("Juan el WARRIOR", 100);
        Mago mago1 = new Mago("Pedro el Lúcido", 100);

        int numRonda = 0;
        while(guerrero1.estaVivo() && mago1.estaVivo()){

            //TURNO DEL GUERRERO

            if (Math.random() < 0.5) {
                guerrero1.atacar(mago1);
            } else {
                System.out.println("El guerrero decide no atacar...");
            }

            //TURNO DEL MAGO
            if (mago1.estaVivo()){
                if (Math.random() < 0.5){
                    mago1.atacar(guerrero1);
                } else {
                    System.out.println("El mago decide no atacar...");
                }
            }

            if (guerrero1.estaVivo() && mago1.estaVivo()){
                numRonda++;
                System.out.println("-------- RONDA " + numRonda + " TERMINADA -------------");
            }

            if (guerrero1.estaVivo() && !mago1.estaVivo()){
                System.out.println("SE ACABÓ EL COMBATE, " + guerrero1.getNombre() + " HA GANADO!");
            } else if (!guerrero1.estaVivo() && mago1.estaVivo()) {
                System.out.println("SE ACABÓ EL COMBATE, " + mago1.getNombre() + " HA GANADO!");
            }
        }
    }
}
