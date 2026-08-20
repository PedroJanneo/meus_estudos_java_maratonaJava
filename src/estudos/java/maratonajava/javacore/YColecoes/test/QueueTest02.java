package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Consumidor;
import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaByPrecoComparator().reversed()); // escolhemos a prioridade
        mangas.add(new Manga(3L, "Naruto", 109.90, 3));
        mangas.add(new Manga(1L, "One Piece GOLD", 103.00, 0));
        mangas.add(new Manga(2L, "AOT", 50.60, 1));
        mangas.add(new Manga(4L, "HXH", 53.60, 0));
        mangas.add(new Manga(5L, "HXH221", 102.00, 0));


        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
