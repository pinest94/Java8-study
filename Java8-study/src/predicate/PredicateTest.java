package predicate;

import model.Apple;

import java.util.ArrayList;
import java.util.List;

public class PredicateTest {

    public interface Predicate<T> {
        boolean test(T t);
    }

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Apple> appleList = new ArrayList<>();

        appleList.add(new Apple(260, 1500, "brown"));
        appleList.add(new Apple(210, 3200, "green"));
        appleList.add(new Apple(280, 4300, "red"));
        appleList.add(new Apple(230, 2500, "red"));
        appleList.add(new Apple(190, 2200, "green"));

        List<Apple> resultList = filterApples(appleList, (Apple a) -> "green".equals(a.getColor()));
        System.out.println(resultList);

        resultList = filterApples(appleList, (Apple a)-> a.getWeight()>250 || "red".equals(a.getColor()));
        System.out.println(resultList);
    }
}




