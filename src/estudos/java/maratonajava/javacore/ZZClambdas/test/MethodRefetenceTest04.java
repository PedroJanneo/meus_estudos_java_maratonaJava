package estudos.java.maratonajava.javacore.ZZClambdas.test;

import estudos.java.maratonajava.javacore.ZZClambdas.dominio.Anime;
import estudos.java.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Referência a um Construtor: NomeDaClasse::new
public class MethodRefetenceTest04 {
    public static void main(String[] args) {
        // 1. Referência ao construtor sem argumentos (usa Supplier)
        // O construtor só é executado de fato quando chamamos o .get()
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 1100), new Anime("Naruto", 500), new Anime("Bersek", 43)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        // 2. Referência ao construtor com 2 argumentos (usa BiFunction)
        // Equivalente em Lambda: (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);

        // Forma enxuta usando Method Reference do construtor:
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        // Executa o construtor criando uma nova instância de Anime
        System.out.println(animeBiFunction2.apply("Boku no hero", 10));
    }
}