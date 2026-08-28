package estudos.java.maratonajava.javacore.ZZBcomportamento.interfaces;

import estudos.java.maratonajava.javacore.ZZBcomportamento.dominio.Car;

/**
 * Isto é uma interface funcional, interfaces funcional, so pode ter 1 metodo abstrato
 */
@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
    // (parametro) -> <expressao>
    //  (Car car ) -> car.getColor().equals("Green");
    // lambdas funcoes anonimas / codigo mais conciso
    // pra usar lambda, tem que ter uma interface funcional
}
