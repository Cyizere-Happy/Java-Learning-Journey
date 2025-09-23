package rw.rca.FirstProject.examples;

public class PowerOfNumber {
    public static int powerNumber(int a, int b){
        if(b == 1){
            return a;
        }
        if(b == 0){
            return 1;
        }else{
            return a * powerNumber(a, b-1);
        }
    }



    public static void main(String[] args){
        System.out.println("The power of 5 to 5 = " + powerNumber(5, 5));
    }
}
