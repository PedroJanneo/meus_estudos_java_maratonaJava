package estudos.java.maratonajava.javacore.ZZClambdas.service;

import estudos.java.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
public static int compareByTitle(Anime a1, Anime a2) {
    return a1.getTitle().compareToIgnoreCase(a2.getTitle());
}
public static int compareByEpisodes(Anime a1, Anime a2) {
    return Integer.compare(a1.getEpisodes(),a2.getEpisodes());
}

public int compareByEpisodesNonStatic(Anime a1, Anime a2) {
    return Integer.compare(a1.getEpisodes(),a2.getEpisodes());
}
}
