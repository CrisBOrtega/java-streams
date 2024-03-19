package PaqueteUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExp {

    static Predicate<Integer>  isGreatherhan10 = n->n>10;
    static Predicate<Integer>  isLesserThan100 = n->n<=100;
    static Predicate<Integer>  isBetween10and100 = isGreatherhan10.and(isLesserThan100);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6, 10, 50, 100, 150, 200, 500));
        //remove acepta un predicado: primer ejemplo
        //numbers.removeIf(isGreatherhan10);
        numbers.removeIf(isBetween10and100);
        System.out.println(numbers);
    }
}
