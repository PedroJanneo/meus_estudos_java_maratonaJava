package estudos.java.maratonajava.javacore.ZZAclassesinternas;

/**
 * Use Static Nested Class quando:
 * A classe interna não precisa dos atributos/métodos de instância da externa. <br>
 * Você quer apenas agrupar uma classe utilitária/auxiliar no mesmo arquivo por organização. <br>
 * Quer performance e economia de memória (evita referências desnecessárias). <br>
 * Use Inner Class (Não-Estática) quando: <br>
 * A classe interna precisa acessar e modificar os atributos da classe externa diretamente. <br>
 * A classe interna só faz sentido se existir atrelada a uma instância específica da externa.<br>
 */
public class OuterClassesTest03 {
    // Atributo de INSTÂNCIA da classe externa.
    // Só existe na memória quando um objeto "OuterClassesTest03" é instanciado com 'new'.
    private String name = "Pedro";

    // Static Nested Class (Classe Aninhada Estática).
    // Por ser static: funciona como uma classe independente no mesmo arquivo.
    // ELA NÃO POSSUI acesso direto aos atributos não-estáticos da classe externa.
    static class Nasted {
        private String lastName = "Janneo";

        void print() {
            // Para acessar 'name', fomos OBRIGADOS a instanciar a classe externa -> new OuterClassesTest03()
            // Isso ocorre porque 'name' é de instância, e a classe Nasted é estática.
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        // Como 'Nasted' é estática, NÃO precisamos instanciar OuterClassesTest03 primeiro para criá-la.
        // Criamos o objeto diretamente usando a sintaxe: new ClasseExterna.ClasseEstatica()
        new OuterClassesTest03.Nasted().print();
    }
}