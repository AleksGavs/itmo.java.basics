package itmo.java.basics.lesson3.ex4;

import java.util.stream.Stream;

public class Tree {
    private String name;
    private int age;
    private boolean isAlive;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        if (isAlive) {
            return "Живое дерево " + this.name + " возрастом " + this.age + " лет.";
        } else {
            return "Неживое дерево " + this.name + " возрастом " + this.age + " лет.";
        }
    }
}
