package rw.rca.inheritance;

public class Animal extends Organism{
    private String sound;

    public Animal(){}
    public Animal(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void hello(){
        System.out.println(this.sound);
    }

}
