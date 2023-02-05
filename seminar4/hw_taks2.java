/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
*/

package seminar4;

import java.util.Arrays;
import java.util.LinkedList;

public class hw_taks2 {
    public static LinkedList<String> queue;

    public static void main(String[] args) {
        queue = new LinkedList<>();

        enqueue("первый");
        enqueue("второй");
        enqueue("третий");

        System.out.println(Arrays.toString(queue.toArray()));

        dequeue();

        System.out.println(Arrays.toString(queue.toArray()));

        first();

        System.out.println(Arrays.toString(queue.toArray()));
    }

    public static void enqueue(String element) {
        queue.add(element);
    }

    public static void dequeue() {
        System.out.println(queue.getFirst());
        queue.removeFirst();
    }

    public static void first() {
        System.out.println(queue.getFirst());
    }
}
