package estudos.java.maratonajava.javacore.Zgenerics.service;

import estudos.java.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("B1"), new Barco("B2")));


    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscandoo carros disponivel...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos dispoveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos dispoveis para alugar: " + barcosDisponiveis);
    }
}
