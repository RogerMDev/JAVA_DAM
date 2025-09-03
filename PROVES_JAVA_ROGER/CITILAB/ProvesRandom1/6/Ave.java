public class Ave extends Animal{
    int numeroDeAlas;

    public Ave(String nombre, String sexo, int ojos, int patas, int numeroDeAlas){
        super(nombre, sexo, ojos,patas);
        this.numeroDeAlas = numeroDeAlas;
    }

    @Override
    public void comer(){
        System.out.println("Soy un ave y estoy comiendo!");
    }
}
