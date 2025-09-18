package rw.rca.FirstProject.OOP;
//polymorphism
//Method can be overloaded if the number of parameters is different
//Method can be overloaded if the data types is different
//Return type can't lead to overloading
public class Overloading {
    int addition(){
        return 10 + 20;
    }

    int addition(int a, int b){
        return a + b;
    }

    int addition(int a, int b, int c){
        return a+b+c;
    }

    double addition(double a, double b, double c){
        return a+b+c;
    }

    double addition(double a, double c, int b){
        return a+b+c;
    }



}
