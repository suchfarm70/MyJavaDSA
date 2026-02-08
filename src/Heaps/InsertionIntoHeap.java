package Heaps;
import java.util.ArrayList;
public class InsertionIntoHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1;
            int parentIndex = (x - 1) / 2;

            while(arr.get(x) < arr.get(parentIndex)) { // O(log n)
                //swapping

                int temp = arr.get(x);
                arr.set(x, arr.get(parentIndex));
                arr.set(parentIndex , temp);
            }
        }

        public int peek(){
            return arr.getFirst();
        }
    }

    public static void main(String [] args){
    }
}
