package estudos.java.maratonajava.javacore.ZZDoptional.test;

import estudos.java.maratonajava.javacore.ZZDoptional.dominio.Manga;
import estudos.java.maratonajava.javacore.ZZDoptional.repositorio.MangaRepositorie;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTtitle = MangaRepositorie.findByTitle("Boku no hero");
        System.out.println(mangaByTtitle);
        mangaByTtitle.ifPresent(manga -> manga.setTitle("Boku no hero 2 "));

        System.out.println(mangaByTtitle);

        Manga mangaById = MangaRepositorie.findById(2)
                .orElseThrow(IllegalArgumentException::new);// se ele nao achar, ele vai lancar a execessao

        System.out.println(mangaById);

        Manga mangaNew = MangaRepositorie.findByTitle("Naruto")
                .orElse(new Manga(3, "Naruto", 100));


        System.out.println(mangaNew);

    }

}
