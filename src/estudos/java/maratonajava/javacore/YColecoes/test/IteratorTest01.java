package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator que vai verificar algo, antes fazer alguma ação <br>
 * ex: chamar algm da fila, antes de chamar, voce vai verificar se existe algm na fila <br>
 *
 * Caso for trabalhar com bastante remoção, usar o LinkedList (pois, na orientação do BigO, LinkedList é suupeior ao ArrayList) <br>
 * Ambos são interfaces, então basta trocar ArrayList por LinkedList (orientação a interface)
 */

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L, "Naruto", 109.90, 3));
        mangas.add(new Manga(1L, "One Piece", 102.00, 0));
        mangas.add(new Manga(2L, "AOT", 50.60, 1));
        mangas.add(new Manga(2L, "HXH", 50.60, 0));

        // JEITO ERRADO
        // remover item na lista
//        for (Manga manga : mangas) {
//            if (manga.getQuantidade() == 0) {
//                mangas.remove(manga);
//            }
//        }

        // JEITO CERTO (antes da versao 8)
        // remover item na lista
        Iterator<Manga> mangasIterator = mangas.iterator();
        while (mangasIterator.hasNext()) { // vai retornar um boolean
            Manga manga = mangasIterator.next(); // retorna um Manga
            if (manga.getQuantidade() == 0) { // verificar se quantidade é 0
                mangasIterator.remove(); // remover SE a quantidade é 0
            }
        }

        System.out.println(mangas);

        // outro jeito: programação funcional (apartir da funcao 8):
        // remover item na lista
//         mangas.removeIf(manga -> manga.getQuantidade() == 0);
                // manga -> variavel de referência, igual no iter


    }
}
