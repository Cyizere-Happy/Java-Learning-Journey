package rw.rca.inheritance;

public class Feline extends Animal{
    public Feline(){}
    public Feline(String sound){
        super(sound);
    }

    @Override
    public void hello(){
        System.out.println("Hello I'm a Feline");
    }

}
