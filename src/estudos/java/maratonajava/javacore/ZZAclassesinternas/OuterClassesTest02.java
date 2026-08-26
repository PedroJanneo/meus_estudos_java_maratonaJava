package estudos.java.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassesTest02 {
    private String name = "Zoro";

    void print(){ // mesma coisa pro paramtro no print, so pode ser FIANAL
        class LocalClass{ // classe dentro do metodo
            String lastName = "Roronoa"; // os atributos so pdem ser FINAl
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass(); // inicializando a classe
        localClass.printLocal(); // chmando metodo
        // outro jeito:
//        new LocalClass().printLocal();
    }

    public static void main(String[] args) {

            OuterClassesTest02 outer = new OuterClassesTest02();
            outer.print();
            

    }
}
