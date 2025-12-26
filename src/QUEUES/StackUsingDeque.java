package QUEUES;
import java.util.*;
public class StackUsingDeque {

    static class stack{
        Deque<Integer> deq = new LinkedList<>();

        void add(int x){
            deq.addLast(x);
        }

        int pop(){
            return deq.removeLast();
        }

        int peek(){
            return deq.getLast();
        }

        boolean isEmpty(){
            return deq.isEmpty();
        }

    }
    public static void main(String [] args){
        stack s = new stack();

        for(int i = 1 ; i <= 5 ; i++){
            s.add(i);
        }

        System.out.println("Using the Peek operation "+ s.peek());
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
            
        }
    }
}
