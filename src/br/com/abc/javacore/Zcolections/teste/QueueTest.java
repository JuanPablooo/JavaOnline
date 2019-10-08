package br.com.abc.javacore.Zcolections.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        /*
        o primeiro elemento a entrar eh o primeiro a sair
         */
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("D");
        queue.add("A");
        queue.add("B");
    /*    System.out.println(queue); //[A, B, C, D]
        System.out.println(queue.remove()); // A da para passar o objeto a ser removido tb
        System.out.println(queue); // [B, D, C]

        */

        System.out.println(queue);
    }
}
