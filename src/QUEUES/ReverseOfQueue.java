package QUEUES;
import java.util.*;
public class ReverseOfQueue {

    public static void reverse(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) {
            stack.add(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    public static void main(String [] args){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1 ; i <= 10 ; i++){
            q.add(i);
        }

        Iterator<Integer> iter = q.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
        
        reverse(q);

        
        System.out.println(q);
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
