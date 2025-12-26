package QUEUES;
import java.util.*;
public class DequeJCF {
    public static void main(String [] args){
        Deque<Integer> deq = new LinkedList<>();

        deq.addFirst(10);
        deq.addFirst(20);
        deq.addFirst(30);
        deq.addLast(40);
        deq.addLast(50);
        deq.addLast(60);
        System.out.println(deq);

        deq.removeFirst();
        System.out.println(deq);
        deq.removeLast();
        System.out.println(deq);

        System.out.println("First Element "+ deq.getFirst());
        System.out.println("Last Element "+ deq.getLast());
    }
}
