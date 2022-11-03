package com.problem;

/**
 * Chapter6_13
 *
 */
public class Main {
    public static void main(String[] args) {
        Station s = new Station(); // <- 引数なしのデフォルトコンストラクタ？？
        s.setName("santa clara");
        s.printName();

    }
}

class Station {
    private String name;

    public Station(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}