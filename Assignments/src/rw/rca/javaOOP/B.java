package rw.rca.javaOOP;
//1) .2
public class B extends A {

    public String message;

//    4) 3.
    public B(){
        super("Hello from B");
    }

    public B(String message) {
        super(message);
    }

//    2) 1.
    @Override
    public void hello(){
//        3) 2.
        super.hello();
    }
}
