package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmatPhoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1111", "IPHONE");
        Smartphone s2 = new Smartphone("2222", "PIXEL");
        Smartphone s3 = new Smartphone("3333", "SAMSUNG");


        List<Smartphone> smartphoneList = new ArrayList<>();
        smartphoneList.add(s1);
        smartphoneList.add(s2);
        smartphoneList.add(s3);
//        smartphoneList.clear(); // vai limpar a lista


        for (Smartphone smartphone : smartphoneList) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("333", "SAMSUNG");
        System.out.println(smartphoneList.contains(s4)); //  mesma coisa do s4.equals(s3) -> ele executa o equals automatico
        smartphoneList.add(0,s4);
        int index = smartphoneList.indexOf(s4);
        System.out.println(index); // -1 caso nao exista

    }
}
