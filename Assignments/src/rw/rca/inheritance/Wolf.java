package rw.rca.inheritance;

public class Wolf extends Canine {
    public Wolf(){}
    public Wolf(String sound){
        super(sound);
    }

    @Override
    public void hello(){
        System.out.println("Hello I'm a Wolf " + getSound());
    }
}
