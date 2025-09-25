package rw.rca.inheritance;

public class Dog extends Canine{
    public Dog(){

    }
    public Dog(String sound){
        super(sound);
    }

    @Override
    public void hello(){
        System.out.println("Hello I'm a Dog " + getSound());
    }
}
