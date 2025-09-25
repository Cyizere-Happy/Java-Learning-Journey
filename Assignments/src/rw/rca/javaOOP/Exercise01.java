package rw.rca.javaOOP;

public class Exercise01 {
    public static void main(String[] args) {
//        1) 4.
        A object1 = new A("Hello World");
        B object2 = new B("Hi Siri");

        object1.hello();
//        3) 3.
        object2.hello();

//        2) 2.
        A c = new B();
//        2) 3.
        c.hello();






    }
}
