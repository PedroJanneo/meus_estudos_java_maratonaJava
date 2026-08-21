package estudos.java.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
          List<Cachorro> dogs =List.of(new Cachorro(), new Cachorro());
          List<Gato> cats =List.of(new Gato(), new Gato());

       printConsulta(cats);
       printConsulta(dogs);

       List<Animal> animals = new ArrayList<>();
       printConsultaAnimal(animals);


         
    }
                            // aceitando qualquer tipo de lista que extends animal
    // to assiando contrato onde diz q mao posso adicionar elementos nesta lista
    private static void printConsulta(List<? extends Animal> animals){ // extends é fixo / aqui aceito qualquer um que seja filho de animal
        for (Animal animal : animals) {
            animal.consulta();
        }


    }

    private  static void printConsultaAnimal(List<? super Animal> animals){ //qalquer um qu seja pai

        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
