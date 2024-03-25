package Streams;

import util.DataBase;
import util.VideoGame;

import java.util.Comparator;
import java.util.stream.Stream;

public class DebugStreamIDE {

    public static void main(String[] args) {
        Stream<VideoGame> videogames = DataBase.VideoGames.stream();
        var myArray = videogames
                .distinct()
                .sorted(Comparator.comparing(VideoGame::getTotalSold))
                .toArray();

        System.out.println(myArray);


    }

}
