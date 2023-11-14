package itmo.java.basics.lesson8.ex2;

import java.util.LinkedList;
import java.util.Scanner;

import static itmo.java.basics.lesson8.ex2.Function.*;

public class _Main {
    public static void main(String[] args) {
//        System.out.println(arrayList("boolean", 5));
//        System.out.println(arrayList("INTEGER", 6));
//        System.out.println(arrayList("Float", 3));
//        System.out.println(arrayList("string", 5));

        long startTime;
        long finishTime;

        startTime = System.currentTimeMillis();
        getElementsFromLinkedList(linkedList("integer", 1000000), 10000);
        finishTime = System.currentTimeMillis();
        System.out.println("LinkedList: " + (finishTime - startTime) + " мс.");

        startTime = System.currentTimeMillis();
        getElementsFromArrayList(arrayList("integer", 1000000), 10000);
        finishTime = System.currentTimeMillis();
        System.out.println("ArrayList: "+ (finishTime-startTime) + " мс.");


    }
}


