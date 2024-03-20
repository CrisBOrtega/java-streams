package Streams;

import util.BasicVideoGame;
import util.DataBase;
import util.VideoGame;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConstructorsStreams {



    public static void main(String[] args) {
        Stream<VideoGame> vgStream = DataBase.VideoGames.stream();

        //countOperator(vgStream);
        //anyMatchOperator(vgStream);
        //firstOperator(vgStream);
        //reduceOperator(vgStream);
        //maxOperator(vgStream);
        //minOperator(vgStream);
        //distinctOperator(vgStream);
        //limitOperator(vgStream);
        //filterOperator(vgStream);
        mapOperator(vgStream);

    }

    /*
         operadores finales
     */

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

    public static void firstOperator(Stream<VideoGame> str){
        Optional<VideoGame> opt = str.findFirst();
        if(opt.isPresent()){
            System.out.println(opt.get().getName());
        }else{
            System.out.println("no hay videoj");
        }
    }

    public static void reduceOperator(Stream<VideoGame> stream){
        Optional<Integer>  r =  stream.
                                   filter(v->v.getIsDiscount()).
                                   map(v->v.getTotalSold()).
                                   reduce((a,b) -> a+b);


        /*Optional<Integer>  r =  stream.
                filter(VideoGame::getIsDiscount).
                map(VideoGame::getTotalSold).
                reduce(Integer::sum);*/
        System.out.println(r.get());
    }

    public static void maxOperator(Stream<VideoGame> stream){
        //Optional<VideoGame> r = stream.max((a,b)->a.getName().compareTo(b.getName()));
        Optional<VideoGame> r = stream.max(Comparator.comparing(VideoGame::getPrice));
        System.out.println(r.get().getName());
    }

    public static void minOperator(Stream<VideoGame> stream){
        //Optional<VideoGame> r = stream.max((a,b)->a.getName().compareTo(b.getName()));
        Optional<VideoGame> r = stream.min((a,b)->a.getPrice().compareTo(b.getPrice()));
        System.out.println(r.get().getName());
    }

    /*
    operadores intermedios
     */

    public static void distinctOperator(Stream<VideoGame> stream){
        System.out.println(stream.distinct().count());
    }

    public static void filterOperator(Stream<VideoGame> stream){
        //saca los primeros 5 elementos
        List<VideoGame> st = stream.filter(v-> v.getPrice() > 50.0)
                .filter(v->!v.getIsDiscount())
                .collect(Collectors.toList());
        st.forEach(System.out::println);
    }

    public static void mapOperator(Stream<VideoGame> stream){
        //saca los primeros 5 elementos
        List<BasicVideoGame> st = stream.map(v->{
            return BasicVideoGame.builder()
                    .name(v.getName())
                    .price(v.getPrice())
                    .console(v.getConsole())
                    .build();
        }).collect(Collectors.toList());

        st.forEach(System.out::println);

        System.out.println("---------------");

        /*List<String> titulos = st.stream().map( basicVideoGame -> {
            return basicVideoGame.getName();
        }).collect(Collectors.toList());
        */
        List<String> titulos = st.stream().map(BasicVideoGame::getName).collect(Collectors.toList());

        titulos.forEach(System.out::println);
    }






}
