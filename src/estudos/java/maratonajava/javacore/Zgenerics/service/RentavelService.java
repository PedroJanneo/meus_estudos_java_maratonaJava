package estudos.java.maratonajava.javacore.Zgenerics.service;

import estudos.java.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentavelService<T> {
    private List<T> objetosDisponiveis;

    public RentavelService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
      public T buscarObjetoDisponivel(){
        System.out.println("Buscandoo carros disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos dispoveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;

    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Carros dispoveis para alugar: " + objetosDisponiveis);
    }
}
