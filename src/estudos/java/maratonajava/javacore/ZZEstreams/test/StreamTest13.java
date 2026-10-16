package estudos.java.maratonajava.javacore.ZZEstreams.test;

import estudos.java.maratonajava.javacore.ZZEstreams.dominio.Category;
import estudos.java.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import estudos.java.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overload", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {

        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(StreamTest13::getPromotion

        ));
        System.out.println(collect);
        // Map<Category, Map< Promotion, List<LightNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> categoryMapMap = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(StreamTest13::getPromotion

        )));
        System.out.println("----");
        System.out.println(categoryMapMap);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
