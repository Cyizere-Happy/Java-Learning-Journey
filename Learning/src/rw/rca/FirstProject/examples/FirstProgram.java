package rw.rca.FirstProject.examples;

import java.util.Set;
import java.util.TreeSet;

public class FirstProgram {
    public static void main(String[] args) {

        System.out.printf("Hello World!\n!");
        Set<String> districts = new TreeSet<String>();

        districts.add("Nyabihu");
        districts.add("Rubavu");
        districts.add("Gasabo");
        districts.add("Bugesera");
        districts.add("Muhanga");

        for (String district : districts) {
            System.out.println(district);
        }

        Integer []nums = new Integer[10];
    }
}

