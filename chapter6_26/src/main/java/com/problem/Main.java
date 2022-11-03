package com.problem;

/**
 * Chapter6_26
 *
 */
public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.incrementCount(); // The static method incrementCount() from the type Counter should be accessed
                             // in a static way
        c2.incrementCount(); // he static method incrementCount() from the type Counter should be accessed in
                             // a static way
        System.out.println(Counter.getCount());
    }
}

class Counter {
    static int count = 0;

    public static int getCount() {
        return count;
    }

    public static void incrementCount() {
        count++;
    }
}
