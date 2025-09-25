package rw.rca.javaOOP;
//1) 1.
public class A {
    public String message;

    public A(){

    }
    public A(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "simpleInheritance{" +
                "message='" + message + '\'' +
                '}';
    }

    public void hello() {
        System.out.println(this.message);
    }


}
