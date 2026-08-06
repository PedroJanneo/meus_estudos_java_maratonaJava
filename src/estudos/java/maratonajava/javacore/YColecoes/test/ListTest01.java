package estudos.java.maratonajava.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); // feito ate a versao 1.4 ( a lista aceita qulquer tipo )
        List<String> nomes = new ArrayList<>(); // feito nas versoes atuais (obrigamos a lista ceita apenas String ) / o padrao de seu tamanho é 10 ( porem ele aumenta automatico conforme a necessidade )
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Teste");
        nomes.add("Teste2");
        nomes.add("Teste3");
        nomes.add("Teste4");
        nomes2.add("Peu");
        nomes2.add("Peu2");
        nomes.addAll(nomes2); // adiciona tudo da lista (nomes2) na lista (nomes)

        System.out.println(nomes.remove(1)); // removendo apartir do index
        System.out.println(nomes.remove("Teste2")); // removendo apartir do objeto
        System.out.println("-----");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("-------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i)); // pegar valores dentro do list

        }
    }
}
