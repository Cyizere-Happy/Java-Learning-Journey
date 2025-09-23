package rw.rca.FirstProject.examples;

public class Casting {
    public static void main(String[] args) {
//        In java you can assign the value of a small primitive to a larger one

        short big = 10;
        int bigger = big;
        long biggest = bigger;

//        In java you can't assign the value of a large primitive to a small primitive
//        long a = 20;
//        int b = a;

//        Solution: explicit cast means you force conversion of datatype into another type
        long a = 20;
        int b = (int) a;

        System.out.println(biggest);
    }
}
