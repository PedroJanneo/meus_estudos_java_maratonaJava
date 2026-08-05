package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Smartphone;

/**
 /**
 * O que é:<br>
 * - O hash gera um valor inteiro para indexar elementos em coleções baseadas em tabela hash (ex: HashSet, HashMap).<br>
 * - Quanto mais único for o número gerado, melhor para a performance (evita colisões), mas se repetir não há problema técnico.<br>
 * - Deve estar em sintonia com o método equals.
 */
public class HashCodeTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","IPHONE");
        Smartphone s2 = new Smartphone("1ABC1","IPHONE");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}
