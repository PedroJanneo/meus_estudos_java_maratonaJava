package estudos.java.maratonajava.javacore.ZZEstreams.test;

import estudos.java.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99), // Elemento duplicado
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        // Imprime os elementos criando e consumindo o Stream numa só linha
        lightNovels.stream().forEach(System.out::println);
        System.out.println("-----");

        // Contagem simples (sem remover duplicados)
        long count = lightNovels.stream()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        // Contagem removendo duplicados com distinct()
        long count2 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);
        System.out.println(count2);

        // O mais usado e correto é encadear diretamente a partir da lista (como no count2):
        // pois assim faz apenas UM stream direto na coleção, em vez de guardar a variável do stream
        // (lembrando que um Stream guardado em variável não pode ser reutilizado após uma operação terminal).

        long count1 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count1);
    }
}