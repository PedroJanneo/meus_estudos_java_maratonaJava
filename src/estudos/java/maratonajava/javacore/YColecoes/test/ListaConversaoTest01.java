package estudos.java.maratonajava.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros =  new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(7);

        // .toArray, temos duas opções
        // 1.º vai transformar a lista em Objeto (não recomendada)
        // 2.º vai sobrecarregar um array de objetos (a mais utilizada e recomendada )
//        numeros.toArray()
        Integer[] listToArray = numeros.toArray(new Integer[0]); // 0 para o java controlar o tamanho / porem da para usar numeros.size() / o 0 é mais rápido (desempenho)
        System.out.println(Arrays.toString(listToArray));

        Integer[] arrayNumeros = new Integer[3];
        arrayNumeros[0] = 1;
        arrayNumeros[1] = 0;
        arrayNumeros[2] = 3;

        System.out.println("-----------------------");
        // cria um 'link' com a array
        List<Integer> arrayToList = Arrays.asList(arrayNumeros);
        arrayToList.set(0,12);// mudou o índice 0 em ambos, devido ao link
        System.out.println(Arrays.toString(arrayNumeros));
        System.out.println(arrayToList);
        System.out.println("---------");
        // melhor forma de transformar um array em list (sem aquele link)
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(arrayNumeros));
        numerosList.add(15);
        System.out.println(numerosList);

        // adicionando valores da array em uma unica linha
//        Arrays.asList(12,3,4,5,6);


    }
}
