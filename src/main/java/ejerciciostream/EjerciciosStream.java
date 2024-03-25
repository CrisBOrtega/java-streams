package ejerciciostream;

import util.Console;
import util.DataBase;
import util.Review;
import util.VideoGame;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjerciciosStream {

    public static void main(String[] args) {
        Stream<VideoGame> vgStream = DataBase.VideoGames.stream();
        //ejercicio1(vgStream);
        //Stream<?> resultadoEj2 = ejercicio2(vgStream);
        //resultadoEj2.forEach(System.out::println);
        //ejercicio2(vgStream);
        //var variable = ejercicio3(vgStream);
        //System.out.println(variable.getName() + " " + variable.getPrice() );
        //ejercicio4(vgStream).forEach(System.out::println);
        List<VideoGame> gamesLesser20 = ejercicio5(vgStream).collect(Collectors.toList());
        for(VideoGame g20 : gamesLesser20){
            System.out.println(g20.getName());
        }
    }

    /*
     *Regresar true si el stream contiene al menos un videojuego con número de ventas mayor a 10
     * y no este en descuento o su precio sea mayor a 9.99 de lo contrario regresar false.
     */
    static void ejercicio1(Stream<VideoGame> s){
        boolean r = s.anyMatch(videoGame -> videoGame.getTotalSold()>10 &&
                                            (  videoGame.getIsDiscount() || videoGame.getPrice() > 9.99));
        System.out.println(r);
    }

    /*
     *Regresar un Stream unicamente con los titulos de todas las consolas que sean de XBOX
     * durante el proceso imprimir los resultados ignorando los repetidos.
     */
    static Stream<?> ejercicio2(Stream<VideoGame> s){

        //Primera opcion
        //usanr disctinct filter y map y el foreach en el invocante
       /*return s.distinct()
               .filter(videoGame -> videoGame.getConsole().equals(Console.XBOX))
               .map(videoGame -> videoGame.getName());*/

        /* segunda opcion realizar el recorrido aqui mismo con peek */
        return s.distinct()
                .filter(videoGame -> videoGame.getConsole().equals(Console.XBOX))
                .peek(System.out::println)
                .map(VideoGame::getName);

    }

    /*
     *Regresar el videojuego con el mayor número de ventas
     * unicamente contemplando los primers 10 elementos del stream.
     */
    static VideoGame ejercicio3(Stream<VideoGame> s){
        /*Optional<VideoGame> k = s.limit(10)
                           .max((a,b)->a.getTotalSold().compareTo(b.getTotalSold()));
        return k.orElseThrow(NoSuchElementException::new);*/

        //o
        return s.limit(10)
                .max(Comparator.comparing(VideoGame::getTotalSold))
                .orElseThrow(NoSuchElementException::new);
    }

    /*
     *Regresar un stream con todos los comentarios del cada review de todos los videojuegos del stream.
     */
    static Stream<String> ejercicio4(Stream<VideoGame> s){
        return s.flatMap(
                videoGame -> videoGame.getReviews().stream().map(Review::getComment)
        );
    }

    /*
     *Regresar un stream con los todos los videojuegos con precio menores a 20.0
     * sin utilizar el operador filter().
     */
    static Stream<VideoGame> ejercicio5(Stream<VideoGame> s){
        return s.sorted(Comparator.comparing(VideoGame::getPrice))
                .takeWhile(v->v.getPrice()<20);

    }








}
