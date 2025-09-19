package rw.rca.FirstProject.Pillars;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;


    //    constructor
    public Person(int age, String lastName, String firstName) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person() {

    }

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person(String gender, int age, String lastName, String firstName) {
        this.gender = gender;
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    //    Getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    //    setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //    toString()
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    //methods used to make many forms of the method

    public void printMe(){
        System.out.println("I am a person");
    }

    public void printMe(String title){
        System.out.println("I am " + title);
    }



}
