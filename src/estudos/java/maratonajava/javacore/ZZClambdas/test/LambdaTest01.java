package estudos.java.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {

        List<String> nomes = List.of("Pedro", "Janneo", "Luffy", "Zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(nomes,(String s) -> System.out.println(s));
        forEach(integers,(Integer i) -> System.out.println(i));
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T o : list) {
            consumer.accept(o);
        }
    }
}
