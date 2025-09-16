package rw.rca.FirstProject.OOP;

public class Box_Demo {
    public static void main(String[] args) {
        //this is called implicit default constructor (indirectly defined by the compiler)
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 30;

        vol = mybox.width* mybox.depth* mybox.height;
        System.out.println("Volume is "+ vol);

        //Parameterised constructor
        Box box2 = new Box(20, 50, 60);
        System.out.println("Volume is "+ box2.volume());

    }

}
