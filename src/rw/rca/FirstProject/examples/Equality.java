package rw.rca.FirstProject.examples;

public class Equality {
    public static void main(String[] args){
        // AUto generated method stub
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = new String("World");
        String s4 = s1;

        Integer a = 10;
        Integer b = 10;

        //Testing Equality

        //Refference Equality
        if(s1 == s2){
            System.out.println("s1 and s2 are equal ");
        }else{
            System.out.println("s1 adn s2 are not equal");
        }

        if(s1 == s4){
            System.out.println("s1 and s4 are equal ");
        }else{
            System.out.println("s1 adn s4 are not equal");
        }

        //Object equality
        if(s1.equals(s2)){
            System.out.println("s1 and s2 have the same content");
        }else{
            System.out.println("They are of different content");
        }

        if(a == b){
            System.out.println("a and b are equal ");
        }else{
            System.out.println("a and b are not equal");
        }

        if(a.equals(b)){
            System.out.println("s1 and s2 have the same content");
        }else{
            System.out.println("They are of different content");
        }
    }
}
