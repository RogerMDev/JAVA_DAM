public class Dog extends Animal{

    public Dog(){

    }

    public Dog(int id){
        this.setId(id);
    }

    // Own behavior
    private void bark() {
        System.out.println("Dog '" + this.getId() + "' does: GUAU, GUAU!!");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}