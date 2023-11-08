package itmo.java.basics.lesson6.ex5;

public class _Main {
    public static void main(String[] args) {
        Parent child = new Child(32);
        child.getInfo();
        System.out.println(child);
    }
}
