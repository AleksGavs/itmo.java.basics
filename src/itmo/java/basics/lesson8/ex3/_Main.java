package itmo.java.basics.lesson8.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static itmo.java.basics.lesson8.ex3.ScoreGenerator.addScores;

public class _Main {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Tom"));
        userList.add(new User("Gina"));
        userList.add(new User("Mike"));
        userList.add(new User("John"));
        userList.add(new User("Alice"));
        userList.add(new User("Peter"));
        userList.add(new User("Maria"));
        userList.add(new User("Alfred"));
        userList.add(new User("Scarlett"));

        Scanner sc = new Scanner(System.in);

        Map<String,Integer> scoreBoard = new HashMap<>(addScores(userList));

        System.out.print("Введите имя пользователя: ");
        String name = sc.next();
        if (!scoreBoard.containsKey(name)) {
            System.out.println("Пользователь с именем не найден");
        }
        else{
            System.out.println(name + " набрал " + scoreBoard.get(name) + " очков.");
        }

        System.out.println(scoreBoard);
    }
}
