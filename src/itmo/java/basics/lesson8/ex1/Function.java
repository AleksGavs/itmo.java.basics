package itmo.java.basics.lesson8.ex1;

import java.util.*;

public class Function {
    public static  <T> ArrayList noDuplicates(List<T> list){
        LinkedHashSet<T> tempSet = new LinkedHashSet<>(list);
        //В задании не сказано про порядок объектов в коллекции,
        //мне показался логичным тот же порядок, что и во входящей коллекции
        return new ArrayList(tempSet);
    }
}
