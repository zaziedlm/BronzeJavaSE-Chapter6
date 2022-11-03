package com.problem;

/**
 * Chapter6_11
 *
 */
public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.doMethod(0);
    }
}

class ClassA {
    public void doMethod() {
        System.out.println("doMethod-A");
    }

    public void doMethod(int a) {
        System.out.println("doMethod-B");
    }
}