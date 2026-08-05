package estudos.java.maratonajava.javacore.YColecoes.test;

import estudos.java.maratonajava.javacore.YColecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","IPHONE");
        Smartphone s2 = new Smartphone("1ABC1","IPHONE");
        System.out.println(s1.equals(s2)); // ( antes da implementacao do novo equals ) : vai dar false, pois ambos estão em memórias diferentes / ( depois da nova implementacao ): vai retornar true

    }
}
