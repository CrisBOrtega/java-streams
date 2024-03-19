package RererenciasMetodos;

import java.util.function.BiPredicate;

public class ArbitraryMethodReference {

    public static void main(String[] args) {

        //lambda con dos parametros
        //BiPredicate<String, String> igual = (s1, s2) -> s1.equals(s2);

        //utilizando equals con referencia arbitraria primero se pone la clase
        //los dos parametros se omiten
        BiPredicate<String, String> igual = String::equals;

        Boolean bool = igual.test("a", "a");
        System.out.println(bool);


    }
}
