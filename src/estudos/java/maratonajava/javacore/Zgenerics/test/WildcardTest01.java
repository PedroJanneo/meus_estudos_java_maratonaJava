package estudos.java.maratonajava.javacore.Zgenerics.test;

abstract class Animal{
    public abstract void consulta();

}

class Cachorro extends Animal{


    @Override
    public void consulta() {
        System.out.println("Consultando o dog");
    }
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando o cat");

    }
}
public class WildcardTest01 {
    public static void main(String[] args) {
            Cachorro[] dogs = {new Cachorro(),new Cachorro()};
            Gato[] cats = {new Gato(),new Gato()};

            printConsulta(dogs);
            printConsulta(cats);

            Animal[] animals = {new Gato(), new Cachorro()};
    }

    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
