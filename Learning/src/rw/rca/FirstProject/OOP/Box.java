package rw.rca.FirstProject.OOP;

public class Box {
    //Variables to be used in the class
        double width;
        double height;
        double depth;

        //Constructor is a method having the same name as the class no return type
        // If a constructor has no parameter its a default constructor
    public Box(){

    }
    //A class can have many constructors its different always starts with a capital letter yet methods are of small letters
    public Box(double wd, double ht, double dp){
        this.depth = dp;
        this.height = ht;
        this.width = wd;
    }

    double volume(){
        return this.width * this.depth * this.height;
    }

    //Overloaded method is a method which is the same but has many different times and number of parameters and values


}
