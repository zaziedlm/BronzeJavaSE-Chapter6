package com.problem;

/**
 * Chapter6_22
 *
 */
public class Main {
    public static void main(String[] args) {
        Part p1 = new Part();
        Part p2 = new Part();
        p1.count = 1; // The static field Part.count should be accessed in a static way
        System.out.println(p2.count); // The static field Part.count should be accessed in a static way
    }
}

class Part {
    public static int count = 0;

}