package itmo.java.basics.lesson6.ex4;

public class Child extends Parent {
    @Override
    void displayParentNum() {
        System.out.println("Введенное число = " + parentNum);
    }
}
