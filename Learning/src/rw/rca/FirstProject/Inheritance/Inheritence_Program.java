package rw.rca.FirstProject.Inheritance;

public class Inheritence_Program {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.age = 10;
        p1.firstName = "John";
        p1.lastName = "Mugisha";

        // Parent reference to a child object (Upcasting)
        Person p2 = new Student();
        p2.age = 15;
        p2.firstName = "Jane";
        p2.lastName = "Muhire";

        Student s1 = new Student();
        s1.age = 12;
        s1.firstName = "Mary";
        s1.lastName = "Ganza";
        s1.school = "Rwanda Coding Academy";

        // ❌ Not valid: cannot assign a parent object to a child variable
        // Student s3 = new Person(); // Compile-time error

    }
}
