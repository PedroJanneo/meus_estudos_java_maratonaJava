package estudos.java.maratonajava.javacore.Zgenerics.test;

import estudos.java.maratonajava.javacore.Zgenerics.dominio.Barco;
import estudos.java.maratonajava.javacore.Zgenerics.dominio.Carro;
import estudos.java.maratonajava.javacore.Zgenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe RentavelService, é generic; onde conseguimos retornar um T (tipo objeto/generico), ent conseguimos adaptar para reornar um Carro ou barco ou qualquer outra coisa
 */

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentavelService<Carro> rentalServiceCarro = new RentavelService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mes...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.printf("------");
        RentavelService<Barco> rentavelServiceBarco = new RentavelService<>(barcoDisponiveis);
        Barco barco = rentavelServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando barco por um mes...");
        rentavelServiceBarco.retornarObjetoAlugado(barco);


    }
}
