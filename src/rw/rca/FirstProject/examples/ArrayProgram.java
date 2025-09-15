package rw.rca.FirstProject.examples;

import java.util.Arrays;

public class ArrayProgram {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Jack";
        names[3] = "Bob";
        names[4] = "Smith";

        String[] nms = {"Elvin", "Mike", "Mary", "Ange", "John"};

        int [] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
//        nums[5] = 5;

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
