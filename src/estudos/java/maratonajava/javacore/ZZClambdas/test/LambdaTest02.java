package estudos.java.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {


        List<String> strings = List.of("Homem de Ferro", "Homem Aranha", "Homem formiga");
        List<Integer> list = map(strings, (String s) -> s.length()); // lambda
        list = map(strings, String::length); //  metodo de refencia

        System.out.println(map(strings, s -> s.toUpperCase()));
        System.out.println(map(strings, String::toUpperCase));
        System.out.println(list);


    }
    // recebe (T) e retorna (R)
    private static <T,R> List<R> map(List<T> list, Function<T,R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);

        }
            return result;
    }
}
