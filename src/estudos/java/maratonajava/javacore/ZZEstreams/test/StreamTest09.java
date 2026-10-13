package estudos.java.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
//        IntStream.range(0,10).forEach(System.out::println); // começando do 1 ao 9
//        IntStream.rangeClosed(0,10).forEach(System.out::println); // comecando do 0 ate 10

        IntStream.rangeClosed(1, 10).filter(x -> x % 2 == 0).forEach(System.out::println);

        Stream.of("Eleve", "o", "Cosmo", "no seu coração")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        int numeros[] = {1, 2, 3, 4, 5};

        Arrays.stream(numeros)
                .average()
                .ifPresent(System.out::println);

        System.out.println();
        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
//                lines.forEach(System.out::println);

                lines.filter( l -> l.contains("Java"))
                        .forEach(System.out::println); // filtrando e printando oq tem java no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
