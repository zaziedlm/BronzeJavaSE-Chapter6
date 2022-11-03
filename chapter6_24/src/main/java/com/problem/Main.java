package com.problem;

/**
 * Chapter6_24
 *
 */
public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        // The static method doMethod() from the type ClassA should be accessed in a
        // static way
        String str = a.doMethod();
        System.out.println(str);

        // 以下は、警告の出ないコーディング例
        String str2 = ClassA.doMethod();
        System.out.println(str2);
    }
}

class ClassA {
    static String doMethod() {
        return "hoge";
    }
}
