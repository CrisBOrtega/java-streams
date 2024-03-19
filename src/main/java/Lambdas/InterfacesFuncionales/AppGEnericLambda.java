package Lambdas.InterfacesFuncionales;

import Repaso.Generics.Product;

public class AppGEnericLambda {

    public static void main(String[] args) {

        //APrimera manera de instanciar una interface
        //Generica
        IPrinter<String> printString = new IPrinter<String>() {
            @Override
            public void print(String toPrint) {

            }
        };

        //Segunda manera
        IPrinter<String> ps2 = string-> System.out.println(string);
        ps2.print("shaman");

        //objeto
        IPrinter<Product> printerProduct = product -> System.out.println(product);
        printerProduct.print(new Product(1L, "farsight", 34.3));


    }
}
