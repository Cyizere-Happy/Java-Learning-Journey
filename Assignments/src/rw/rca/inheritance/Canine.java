package rw.rca.inheritance;

public class Canine extends Animal {

    public Canine(){}

    public Canine(String sound){
        super(sound);
    }

    @Override
    public void hello(){
        System.out.println("Hello I'm a Canine");
    }

}
