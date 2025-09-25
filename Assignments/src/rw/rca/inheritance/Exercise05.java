package rw.rca.inheritance;

public class Exercise05 {
    public static void main(String[] args) {
       Animal[] animals = {new Cat("Meow"), new Dog("Bark"), new Lion("Roar"), new Wolf("howl")};

       for(Animal animal: animals){
          animal.hello();
       }
    }
}
