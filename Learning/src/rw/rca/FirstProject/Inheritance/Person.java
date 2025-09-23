package rw.rca.FirstProject.Inheritance;
//its all about the order fo the data type during string overloading
//Encapsulation is achieved by making the properties private and we make the methods public to access them
//Setter is a method use to set value of the property


public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(){

    }
    public Person(String fname, String lname, int age){
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
    }
    public Person(String fname, int age, String lname){
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
    }

    public Person( int age, String lname, String fname){
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
    }

    public Person( String lname, String fname){
        this.firstName = fname;
        this.lastName = lname;
    }
    //override means changing the implementation
    @Override
    //since Sout always search for toString we are overriding the normal way of doing thing
    public String toString(){
        return this.firstName + " " + this.lastName + " is " + this.age + " years old.";
    }
    //Constructor should be public for now until we reach Design pattern

    //Setter is a one for setting the values of
    public  void setFirstName(String fname) {
        this.firstName = fname;
    }
    public  void setLastName(String lname) {
        this.lastName = lname;
    }
    public  void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    //Getter no parameter should be passed in
    public  String getFirstName(){
        return this.firstName;
    }
    public  String getLastName(){
        String lastName = "manzi";
        //Reason why you should always use this it is to properly access the properties of it and now if in get there is another variable it will always print that variable
        return this.lastName;
    }
    public  int getAge(){
        return this.age;
    }

}
