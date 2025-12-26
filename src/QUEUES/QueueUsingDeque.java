package QUEUES;
import java.util.*;
public class QueueUsingDeque {

    static class queue{
        Deque<Integer> deq = new LinkedList<>();
        void add(int x){
            deq.addLast(x);
        }

        int peek(){
            return deq.getFirst();
        }

        int pop(){
            return deq.removeFirst();
        }

        boolean isEmpty(){
            return deq.isEmpty();
        }
    }
    public static void main(String [] args){
        queue q = new queue();
        for(int i = 0 ; i <= 5 ; i++){
            q.add(i);
        }

        System.out.println("Using the peek operation in Queue "+q.peek());
        System.out.println(q.pop()+" was popped out of the Queue implement using Deque");
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.pop();
        }
    }
}
