


public class Main_Animal {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        Animal a1 = new Animal();

        a.setId(0);
        a1.setId(1);

        System.out.println("El animal solicitado tiene el id:" + a.getId());
        System.out.println("El animal solicitado tiene el id:" + a1.getId());

        a.sound();
        a1.sound();

        //-------------------------------CLASE PERRO---------------------------------------------------

        Dog d = new Dog();
        Dog d1 = new Dog();

        d.setId(0);
        d1.setId(1);

        System.out.println(d.getId());
        System.out.println(d1.getId());

        d.sound();
        d1.sound();
        //--------------------------------CLASE OSO-------------------------------------------
        Oso o = new Oso(0);
        Oso o1 = new Oso(1);


        System.out.println("Oso 0 : " +o.getId());
        System.out.println("Oso 1 : " +o1.getId());
        o.sound();
        o1.sound();
    }
}
