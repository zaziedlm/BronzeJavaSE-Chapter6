package com.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Chapter6_7
 * Java標準のクラスに置き換えています。オブジェクトidを出力させます。
 */
public class Main 
{
    public static void main( String[] args )
    {
        List<String> list1 = null;
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = list2;
        List<String> list4 = list3;

        System.out.println( "list1 hashCode ? " + System.identityHashCode(list1) );
        System.out.println( "list2 hashCode ? " + System.identityHashCode(list2) );
        System.out.println( "list3 hashCode ? " + System.identityHashCode(list3) );
        System.out.println( "list4 hashCode ? " + System.identityHashCode(list4) );
    }
}
