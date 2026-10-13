package estudos.java.maratonajava.javacore.ZZEstreams.test;

import estudos.java.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Overload", 3.99),
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99), // Elemento duplicado
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {

        System.out.println(lightNovels.stream()
                .anyMatch( ln -> ln.getPrice() > 8)); //anyMatch retorna um BOOLEAN / verifica se ALGUM da match (neste caso, se existe algum com valro maior que 8
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); // retorna um BOOLEAN / verifica se TODOS da match (neste caso, se todos sao maior que 0
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 10)); // retorna um BOOLEAN / verifica se NENHUM da match (neste caso, se nenhum é maior que 10
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)

                .findAny() // qlqr elemento, resulgado/ordem nao importa
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
        
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice)) // substitui o findFirst ( intelij corrigiu)
                .ifPresent(System.out::println);
    }
}
