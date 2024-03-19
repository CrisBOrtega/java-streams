package Lambdas.InterfacesFuncionales;

public class App {

    public static void main(String[] args) {

        //Definimos una clase anonima de la interface
        Mates resta = new Mates() {

            //implementacion del metodo abstracto
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };

        //uso
        System.out.println(resta.execute(5.8  , 4.8));

        //ahora lo hacemos estilo lambda
        Mates multiplicar = (a, b) -> a * b;
        //es decir, una manera mas facil de implementar una interface
        //desde una clase abstracta
        System.out.println(multiplicar.execute(3.4 , 3.4));

        //un lambda en bloque
        Mates dividir = (Double a , Double b )-> {
            System.out.println("multiplicando");
            return a/b;
        };
        System.out.println(dividir.execute(10.0, 5.0));

    }
}
