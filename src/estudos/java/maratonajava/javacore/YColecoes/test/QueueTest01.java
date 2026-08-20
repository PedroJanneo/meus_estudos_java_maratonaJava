package estudos.java.maratonajava.javacore.YColecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * QUEUE -> primeiro a entrar, primeiro a sair (FIFO)
 */
public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("A");
        fila.add("C");
        fila.add("B");

        for (String s : fila) {
            System.out.println(s);
        }

        fila.peek(); /// mostrar primeiro elemento;
        fila.poll(); /// mostrar primeiro elemento e remover




    }
}
