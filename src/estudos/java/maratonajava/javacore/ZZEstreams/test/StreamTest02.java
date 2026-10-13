package estudos.java.maratonajava.javacore.ZZEstreams.test;

import estudos.java.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    // Versão declarativa (moderna) do StreamTest01
    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                // Operação Intermediária: Ordena os elementos em ordem alfabética pelo título
                .sorted(Comparator.comparing(LightNovel::getTitle))

                // Operação Intermediária: Filtra apenas objetos cujo preço seja <= 4
                .filter(ln -> ln.getPrice() <= 4)

                // Operação Intermediária: Corta o fluxo e mantém no máximo os 3 primeiros elementos
                .limit(3)

                // Operação Intermediária: Mapeia/Converte o fluxo de objetos (LightNovel) para Strings (apenas os títulos)
                .map(LightNovel::getTitle)

                // Operação Terminal: Coleta os elementos resultantes do fluxo para uma nova Lista
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}