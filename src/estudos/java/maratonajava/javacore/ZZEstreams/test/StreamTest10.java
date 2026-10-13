package estudos.java.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        // sequência de Fiobonnati
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a))); // gerar com anterior e novo
        System.out.println("-------");
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0]) // gerar apenas com o novo
                .forEach(System.out::println);

        System.out.println("------");

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 500)) // numeros aleatorios de 1 a 500
                .limit(90) // gerar 90 numeros aleatorios
                .forEach(System.out::println);
    }
}
