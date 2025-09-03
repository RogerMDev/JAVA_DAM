public class Mamifero extends Animal {
    int numeroDeMamas;


    public Mamifero(String nombre, String sexo, int ojos, int patas,int numeroDeMamas ){
        super(nombre, sexo, ojos, patas);
        this.numeroDeMamas = numeroDeMamas;
    }

    @Override
    public void comer(){
        System.out.println("Soy mamifero y estoy comiendo!");
    }
    

}

