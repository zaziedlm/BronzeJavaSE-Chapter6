package com.problem;

/**
 * Chapter6_25
 *
 */
public class Main {
    public static void main(String[] args) {
        int n = ClassA.getNumber();
        System.out.println(n);
    }
}

class ClassA {
    private int number = 0;

    public static int getNumber() {
        return number;  // Cannot make a static reference to the non-static field number
    }
}
