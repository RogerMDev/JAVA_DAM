import java.util.Scanner;

public class SistemaGestionVehiculos {

    Scanner sc = new Scanner(System.in);

    Vehiculo[] vehiculos = new Vehiculo[4];


    public SistemaGestionVehiculos(){

        vehiculos[0] = new Coche("Ferrari", "812 Superfast", 1990,290,2);
        vehiculos[1] = new Moto("Kawasaki", "z300", 2015,170,"hierro");
        vehiculos[2] = new Coche("BMW","320", 2000, 240, 5 );
        vehiculos[3] = new Camion("Volvo", "XDS150", 1978, 120, 11000);

        boolean bucle = true;
        while(bucle){
            
            System.out.println("1. Mostrar información de todos los vehículos");
            System.out.println("2. Acelerar un vehículo especifico");
            System.out.println("3. Salir del menú");

            int eleccion = sc.nextInt();

            if (eleccion == 1) {
                for (Vehiculo v : vehiculos){
                    v.mostrarInfo();
                    System.out.println("");
                }
            } else if (eleccion ==2){
                System.out.println("Di que posición ocupa el vehiculo que quieres acelerar (0 - 3)");
                int eleccionacceleracion = sc.nextInt();
                vehiculos[eleccionacceleracion].acelerar();
            }else if (eleccion == 3){
                bucle = false;
    
            } else{
                System.out.println("Introduce un valor válido");
            }
        }
    }
}


