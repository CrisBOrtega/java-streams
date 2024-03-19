package Streams;

import util.DataBase;
import util.VideoGame;

import java.util.stream.Stream;

public class StreamFinalOperators {

    public static void main(String[] args) {
        Stream<VideoGame> vgStream = DataBase.VideoGames.stream();
        countOperator(vgStream);
    }

    //metodos de prueba de metodos finales de un stream
    static void countOperator(Stream<VideoGame> stream) {
        System.out.println(stream.count());
    }
}
