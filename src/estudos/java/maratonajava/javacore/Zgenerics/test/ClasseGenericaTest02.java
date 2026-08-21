package estudos.java.maratonajava.javacore.Zgenerics.test;

import estudos.java.maratonajava.javacore.Zgenerics.dominio.Barco;
import estudos.java.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

// essa classe é generica, pois so mudamos o tipo de objeto, e a classe continua a funcionar
public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);


    }
}
