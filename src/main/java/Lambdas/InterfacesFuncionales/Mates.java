package Lambdas.InterfacesFuncionales;

@FunctionalInterface
public interface Mates {

    Double execute(Double a , Double b);

    default double sum(Double a , Double b){
        return a + b;
    }

}
