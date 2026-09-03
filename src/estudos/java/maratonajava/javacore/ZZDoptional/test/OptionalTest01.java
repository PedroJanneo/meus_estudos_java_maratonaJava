package estudos.java.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {
        // introduzido na versão 8
        // intuito de tentar evitar o NullPointerException

        Optional<String> o1 = Optional.of("Aha uhu "); // of -> aceita valores NÃO NULOS
        Optional<String> o2 = Optional.ofNullable(null); // aceita valores PREENCHIDOS E NULOS
        Optional<String> o3 = Optional.empty(); // aceita só NULOS


        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-----------");
        Optional<String> name = findName("Pedro"); // (parecido com o if)
        String semNome = name.orElse("SEM NOME"); // inves de ficar Optional.empty, vai ficar SEM NOME (parecido com um else)
        System.out.println(semNome);
        name.ifPresent(s -> System.out.println(s.toUpperCase()));

    }

    private static Optional<String> findName(String name) { // Optional nao é indicado para passagem a parametro / nem como variavel/atributos / usado apenas para retorno de metodos
        List<String> nomesList = List.of("Pedro", "Peu", "Pepe");

        int i = nomesList.indexOf(name);
        if (i != -1) {
            return Optional.of(nomesList.get(i));
        }

        return Optional.empty();
    }

}
