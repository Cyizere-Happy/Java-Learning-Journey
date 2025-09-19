package rw.rca.FirstProject.Inheritance;

public class Person_Program {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Mugisha", 10, "Nick");
        Object person3 = new Person("Anitha", "Irakoze Gikundiro", 14);
        System.out.println(person2.getFirstName() + " " + person2.getLastName() + " " + person2.getAge());
        person1.setFirstName("Mary");
        person1.setLastName("Iradukunda");
        person1.setAge(15);
        System.out.println(person1.getFirstName() + " " + person1.getLastName() + " " + person1.getAge());
        System.out.println(person3);
        Person person4 = new Person();
        person4.setAge(-20);
        System.out.println(person4.getAge());

        //Strings are initialized by null and null while integer is 0
        Person person5 = new Person();
        System.out.println(person5);

    }
}
