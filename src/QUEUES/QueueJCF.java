package QUEUES;
import java.util.*;
class QueueJCF {
    public static void main(String [] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        Iterator<Integer> iter = q.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
}