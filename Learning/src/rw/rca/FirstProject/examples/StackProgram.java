package rw.rca.FirstProject.examples;

public class StackProgram {
    public static void printMessage(){
        System.out.println("Message");
        printMessage();
    }
    public static void main(String[] args) {
        printMessage();
    }
}
