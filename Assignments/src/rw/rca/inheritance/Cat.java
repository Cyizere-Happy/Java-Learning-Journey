package rw.rca.inheritance;

public class Cat extends Feline{
    public Cat(){}
    public Cat(String sound){
        super(sound);
    }

    @Override
    public void hello(){
        System.out.println("Hello I'm a Cat " + getSound());
    }

}
