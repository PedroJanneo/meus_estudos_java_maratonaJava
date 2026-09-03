package estudos.java.maratonajava.javacore.ZZDoptional.repositorio;

import estudos.java.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorie {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no hero", 50), new Manga(2, "One Piece", 1100));

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga m : mangas) {
            if (predicate.test(m)) {
                found = m;
            }


        }
        return Optional.ofNullable(found);
    }
}