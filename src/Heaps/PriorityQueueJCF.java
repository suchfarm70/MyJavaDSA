package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueJCF {
    public static  void main(String [] args){
        //PriorityQueue<Integer> mypq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> mypq = new PriorityQueue<>();

        mypq.add(3); //O(log n)
        mypq.add(4);
        mypq.add(1);
        mypq.add(7);

        while(!mypq.isEmpty()){
            System.out.println(mypq.peek());// O(1)
            mypq.remove(); // O(log n)
        }
    }
}
