package estudos.java.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Referência a méto do de instância de um objeto arbitrário (qualquer objeto do tipo especificado): Tipo::nomeDoMetodo
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));

        // Chama o méto do 'compareTo' pertencente à própria classe String para comparar os elementos
        list.sort(String::compareTo);
        System.out.println(list);

        // Converte a chamada da String para o méto do estático de conversão 'Integer.parseInt'
        Function<String, Integer> umStringToInteger = Integer::parseInt;
        System.out.println(umStringToInteger.apply("10")); // Converte "10" (String) para 10 (Integer)

        // Executa o méto do 'contains' da instância de List passada como primeiro parâmetro do BiPredicate
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Peu")); // Verifica se "Peu" está contido na lista
    }
}