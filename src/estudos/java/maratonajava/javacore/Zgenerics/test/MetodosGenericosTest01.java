package estudos.java.maratonajava.javacore.Zgenerics.test;

import estudos.java.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodosGenericosTest01 {
    public static void main(String[] args) {
        List<Barco> canoa = criarArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(canoa);


    }

    //<T> (A declaração da variável de tipo): Avisa ao compilador: "Esta função vai trabalhar com um tipo genérico que chamaremos temporariamente de T".
    //List<T> (O tipo de retorno): O mé to do promete devolver uma lista de elementos do tipo T.
    //Qual é a vantagem?
    //Sem o <T>, você teria duas opções ruins:
    //Criar vários métodos repetidos: criarArrayString(String s), criarArrayInt(Integer i), etc.
    //Usar T: List<T> criarArray(T t), o que te faria perder a segurança de tipos e obrigaria a fazer casts manuais depois.
    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);

    }
    // Esse mé to do só aceita um tipo T que obrigatoriamente implemente a interface Comparable<T>
    // private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t) {
    //        return List.of(t);
    //
    //    }

}
