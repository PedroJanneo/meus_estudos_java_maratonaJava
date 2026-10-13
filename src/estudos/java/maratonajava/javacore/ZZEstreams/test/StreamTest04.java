package estudos.java.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {

    public static void main(String[] args) {
        // Criamos uma lista bidimensional (uma Lista que contém outras Listas de Strings)
        List<List<String>> devdojo = new ArrayList<>();

        List<String> graphicDesigner = List.of("Wildney Suane", "Catarina", "Sandy");
        List<String> developers = List.of("Willian", "David", "Harisson");
        List<String> student = List.of("Édipo", "Gustavo", "Gustavo 2", "Guilherme");

        // Agrupando as sublistas dentro da lista principal 'devdojo'
        devdojo.add(graphicDesigner);
        devdojo.add(developers);
        devdojo.add(student);

        // --- ABORDAGEM TRADICIONAL (For Imperativo) ---
        // Para iterar sobre elementos aninhados, precisamos de dois loops encadeados.
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("----");

        // --- ABORDAGEM COM STREAMS E FLATMAP ---
        // devdojo.stream() produz um Stream<List<String>> (um fluxo de listas).
        devdojo.stream()
                /*
                 * flatMap: Usado quando cada elemento do Stream original gera um novo Stream.
                 * Ele "achata" (flatten) a estrutura, transformando um Stream de Listas
                 * em um único Stream contendo diretamente os elementos das listas (Stream<String>).
                 *
                 * Collection::stream é um Method Reference equivalente a: list -> list.stream()
                 */
                .flatMap(Collection::stream)

                // Exibe cada elemento individualmente do Stream retornado
                .forEach(System.out::println);
    }
}