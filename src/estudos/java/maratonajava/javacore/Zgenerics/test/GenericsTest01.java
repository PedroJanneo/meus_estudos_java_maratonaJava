package estudos.java.maratonajava.javacore.Zgenerics.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // forma antiga
        List lista = new ArrayList();
        lista.add("Pedro");
        lista.add(1234L);
        lista.add(new Consumidor("Luffy"));

        for (Object o : lista) {
            if ( o instanceof  String){ // instanceof = instancia de
                System.out.println(o); // printando apenas "Pedro" pois as outras é instancioa de Long e Consumidor
            }
            if( o instanceof  Long){
                System.out.println(o);
            }
        }

    // novo jeito
        // Type erasure = depois de compilar, o BYTECODE remove o tipo da List
        List<String> listaNova = new ArrayList<>();
        listaNova.add("Pedro");

        for (String Listanova : listaNova) {
            System.out.println(Listanova);
        }


    }
}
