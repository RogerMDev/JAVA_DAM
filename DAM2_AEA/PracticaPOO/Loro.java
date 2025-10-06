package practicapoo;

public class Loro implements VelVuelo {
    
    double velVuelo = 12.4;

    @Override
    public void MostrarVelocidadVuelo(){
        System.out.println("La velocidad de vuelo es: " + velVuelo + " km por hora");
    }
}
