package itmo.java.basics.lesson8.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ScoreGenerator {
    public static Map<String, Integer> addScores(ArrayList<User> users){
        Map scoreBoard = new HashMap<String,Integer>();
        Random random = new Random();
        for (User user : users){
            int r = random.nextInt(100);
            scoreBoard.put(user.getName(), r);
        }
        return scoreBoard;
    }
}
