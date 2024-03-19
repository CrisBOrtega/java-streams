package Streams;

import util.DataBase;
import util.VideoGame;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConstructorsStreams {



    public static void main(String[] args) {
        Stream<VideoGame> vgStream = DataBase.VideoGames.stream();

        //countOperator(vgStream);
        anyMatchOperator(vgStream);


    }

    public static void  countOperator(Stream<VideoGame> stream){
        System.out.println(stream.count());
    }

    public static void anyMatchOperator(
            Stream<VideoGame> stream
    ){
        boolean r = stream.anyMatch(videoGame -> videoGame.getTotalSold()>1000);
        System.out.println(r);
    }


    public static void allMatchOperator(
            Stream<VideoGame> stream
    ){
        boolean r = stream.allMatch(videoGame -> videoGame.getTotalSold()>1000);
        System.out.println(r);
    }


}
