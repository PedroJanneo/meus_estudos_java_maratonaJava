package estudos.java.maratonajava.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros =  new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        Collections.sort(numeros);


        // para funcionar tem que estar ordenaados
        // ele v ai procurar o valo/ objeto exato  da pesquisa
        // caso ache retorna o index
        // caso nao ache (-(ponto de inserçao) -1) // so retornapoisitivose existir na lista
        System.out.println("Numero binary: " + Collections.binarySearch(numeros,3));// estamos dizendo que queremos o index 2 da lista numeros


    }
}
