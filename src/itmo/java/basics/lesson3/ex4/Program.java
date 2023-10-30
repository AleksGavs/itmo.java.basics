package itmo.java.basics.lesson3.ex4;

public class Program {
    public static void main(String[] args) {
        Tree appleTree = new Tree("Яблоня", 8);
        Tree oak = new Tree("Дуб", 48, false);
        Tree unknownTree = new Tree();

        System.out.println(appleTree);
        System.out.println(oak);
    }
}
