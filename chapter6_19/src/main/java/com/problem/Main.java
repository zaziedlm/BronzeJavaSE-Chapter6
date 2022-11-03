package com.problem;

/**
 * Chapter6_19
 *
 */
public class Main {
    public static void main(String[] args) {
        Food f = new Food("a food");
        f.name = "b food";
        f.print();
    }
}

class Food {
    private String name;

    public Food(String n) {
        name = n;
    }

    public void print() {
        System.out.println(name);
    }
}