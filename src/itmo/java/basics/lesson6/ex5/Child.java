package itmo.java.basics.lesson6.ex5;
public class Child extends Parent {

    public Child(int age) {
        this.age = age;
    }

    public Child() {
    }

    private String name;

    @Override
    protected void getInfo() {
        System.out.println("Введите своё имя: ");
        name = scanner.next();
    }

    @Override
    public String toString() {
        return "Имя пользователя - " + this.name + ".";
    }
}
