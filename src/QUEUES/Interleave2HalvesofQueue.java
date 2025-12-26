//Interleave 2 hales of a Even lenght Queue
// 1 2 3 4 5 6 7 8 9 10 becomes
// 1 6 2 7 3 8 4 9 5 10
package QUEUES;
import java.util.*;
public class Interleave2HalvesofQueue {

    public static void ineterleave(Queue<Integer> q){
        Queue<Integer> first = new LinkedList<>();

        int size = q.size();//make sure you explicitly calculate the size first
        for(int i = 0 ; i < size/2 ; i++){
            first.add(q.remove());
        }

        while (!first.isEmpty()) {
            q.add(first.remove());
            q.add(q.remove());            
        }
    }

    public static void main(String [] args){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1 ; i <= 10 ; i++){
            q.add(i);
        }

        ineterleave(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
