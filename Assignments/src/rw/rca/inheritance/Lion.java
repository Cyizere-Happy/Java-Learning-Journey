package rw.rca.inheritance;

public class Lion extends Feline{
    public Lion(){

    }

    public Lion(String sound){
        super(sound);
    }

    @Override
    public void hello(){
        System.out.println("Hello I'm a Lion " + getSound());
    }
}
