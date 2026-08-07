package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("One Piece");
        mangas.add("AOT");
        mangas.add("Naruto");


        Collections.sort(mangas); // organiza de forma ALFABETICA

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.0);
        dinheiros.add(23.9);
        dinheiros.add(28.6);
        System.out.println(dinheiros); // antes do sort (organizacao )

        Collections.sort(dinheiros); // ordem numerica, do MENOR para MAIOR

        for (String s : mangas) {
            System.out.println(s);
        }

        System.out.println(dinheiros); // depois do sort (organizacao)

        new Manga(null,null,0);

    }
}
