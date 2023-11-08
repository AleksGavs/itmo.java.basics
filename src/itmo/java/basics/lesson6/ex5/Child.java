package itmo.java.basics.lesson6.ex5;

import java.time.Year;

public class Child extends Parent{
    private String name;
    @Override
    protected String getInfo(){
        super.getInfo();
        System.out.println("Введите своё имя: ");
        name = scanner.next();
        return name;
    }

    @Override
    public String toString(){
        return "Имя пользователя - " + this.name + ", возраст пользователя " + this.age + ".";
    }
}
