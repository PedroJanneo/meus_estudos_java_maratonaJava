package estudos.java.maratonajava.javacore.ZZClambdas.test;

import estudos.java.maratonajava.javacore.ZZClambdas.dominio.Anime;
import estudos.java.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referência a um méto do estático: NomeDaClasse::nomeDoMetodoEstatico
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 1100), new Anime("Naruto", 500), new Anime("Bersek", 43)));

        // Diferentes formas de fazer a mesma coisa (da mais longa para a mais enxuta):
        // 1. Lambda com lógica direta:
        // Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareToIgnoreCase(a2.getTitle()));

        // 2. Lambda chamando méto do estático de outra classe:
        // Collections.sort(animeList, (a1, a2) -> AnimeComparators.compareByTitle(a1,a2));

        // 3. Method Reference para méto do estático:
        // Collections.sort(animeList, AnimeComparators::compareByTitle)

        // Ordena a lista usando a referência ao méto do estático 'compareByEpisodes'
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}