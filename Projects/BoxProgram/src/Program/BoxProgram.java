package Program;

import Classes.Box;
import Classes.BoxShipping;
import Classes.BoxWeight;

public class BoxProgram {
    public static void main(String[] args) {
        Box box_1 = new Box(1, 2, 3, 4);
        BoxWeight box_2 = new BoxWeight(5, 6, 7, 8, 9);
        BoxShipping box_3 = new BoxShipping(10, 11, 12, 13, 14,15,16);

        System.out.println(box_1);
        System.out.println(box_2);
        System.out.println(box_3);

        System.out.println(box_1.printMe());
        System.out.println(box_2.printMe());
        System.out.println(box_3.printMe());

    }
}
