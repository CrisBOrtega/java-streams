package Streams;

import util.DataBase;
import util.VideoGame;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConstructorsStreams {



    public static void main(String[] args) {
        Stream<VideoGame> vgStream = DataBase.VideoGames.stream();
        //copiar en jsoneditoronline.org
        //vgStream.forEach(System.out::println);
        //trabajar como una lista tradicional
        //Integer[] myArray={1,2,3,4,5,6,7};
        //Stream<Integer> intStream = (Stream<Integer>) Arrays.stream(myArray);
        //intStream.forEach(System.out::println);

        countOperator(vgStream);


    }

    public static void  countOperator(Stream<VideoGame> stream){
        System.out.println(stream.count());
    }



}
