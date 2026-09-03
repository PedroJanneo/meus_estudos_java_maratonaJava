package estudos.java.maratonajava.javacore.ZZClambdas.test;

import estudos.java.maratonajava.javacore.ZZClambdas.dominio.Anime;
import estudos.java.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Referência a méto do de instância de um objeto específico: instanciaObjeto::nomeDoMetodo
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        // 1. Cria a instância do objeto que possui o méto do não-estático
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 1100), new Anime("Naruto", 500), new Anime("Bersek", 43)));

        // 2. Aponta para o méto do 'compareByEpisodesNonStatic' pertencente à instância 'animeComparators'
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}