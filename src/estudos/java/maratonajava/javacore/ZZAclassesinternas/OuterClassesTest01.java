package estudos.java.maratonajava.javacore.ZZAclassesinternas;

/**
 * classe intern (InnerClass): uma classe dentro de outra
 */
// classe externa
public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    //class
    // Nested
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); // referencia ao objeto interno
            System.out.println(OuterClassesTest01.this); // referencia ao objeto externo

        }
    }
    public static void main(String[] args) {
    OuterClassesTest01 outerClassTest01 = new OuterClassesTest01();
        Inner inner = outerClassTest01.new Inner(); // UM dos jeitos de instanciar o objeto(classe) inner
        inner.printOuterClassAttribute(); // chamando o metodo dentro do Inner
        new OuterClassesTest01().new Inner().printOuterClassAttribute(); // outro jeito de instanciar o objeto (classe) Inner e chamar o metodo
        Inner inner2 = new OuterClassesTest01().new Inner(); // outro jeito de instanciar o objeto(classe) Inner
        inner2.printOuterClassAttribute();

    }

}
