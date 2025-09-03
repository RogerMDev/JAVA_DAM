public class Oso extends Animal {

    public Oso(){
    }
    
    public Oso(int id){
        this.setId(id);
    }


    private void SonidoOso(){
        System.out.println("El OSO HACE GRRRRRRR");
    }

    @Override
    public void sound(){
        SonidoOso();
    } 
}
