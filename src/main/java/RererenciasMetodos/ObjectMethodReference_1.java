package RererenciasMetodos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectMethodReference_1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        IntStream repeat = IntStream.range(1, 11);
        //Con lambda normal:
        //repeat.forEach(i -> numbers.add(i));
       // System.out.println(numbers);

        //Con metodos referenciados:
        repeat.forEach(numbers::add);
        System.out.println(numbers);


    }
}
