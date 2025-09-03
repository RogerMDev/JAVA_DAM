public abstract class Animal {
    int ojos;
    int patas;
    String nombre;
    String sexo;

    public Animal(String nombre, String sexo,int ojos, int patas){
        this.nombre = nombre;
        this.sexo = sexo;
        this.ojos = ojos;
        this.patas = patas;
    }

    public abstract void comer();

    void comer2(){
        System.out.println("Tengo " + ojos + " ojos y " + patas + " patas." );
    }
}
