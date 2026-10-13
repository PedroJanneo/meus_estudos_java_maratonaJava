package estudos.java.maratonajava.javacore.ZZEstreams.test;

import estudos.java.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Requisitos:
// 1. Ordenar LightNovels pelo título.
// 2. Buscar os 3 primeiros que custem menos ou igual a 4.00.
public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        // 1. Ordena a lista original diretamente alterando a coleção.
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        // 2. Filtra e limita manualmente até 3 elementos usando estruturas tradicionais
        List<String> title = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            // Condição para filtrar o preço
            if (lightNovel.getPrice() <= 4) {
                title.add(lightNovel.getTitle());
            }
            // Condição manual para interromper o loop assim que atingir 3 itens (simulando um limit)
            if (title.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(title);
    }
}