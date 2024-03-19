package RererenciasMetodos;

import java.util.UUID;
import java.util.function.Supplier;

public class StaticMethodReference_2 {

    public static void main(String[] args) {
        //System.out.println(UUID.randomUUID().toString());

        //lambda normal:
        //Supplier<UUID> getToken = ()->UUID.randomUUID();

        //con lambda normal:
        Supplier<UUID> getToken = UUID::randomUUID;
        System.out.println(getToken.get());
    }
}
