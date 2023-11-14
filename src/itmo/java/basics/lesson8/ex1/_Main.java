package itmo.java.basics.lesson8.ex1;

import java.util.ArrayList;

import static itmo.java.basics.lesson8.ex1.Function.noDuplicates;

public class _Main {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add("Kate");


        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(22);
        ints.add(15);
        ints.add(22);
        ints.add(154);
        ints.add(8888);
        ints.add(22);

        System.out.println(people);
        System.out.println(noDuplicates(people));
        System.out.println(ints);
        System.out.println(noDuplicates(ints));
    }
}
