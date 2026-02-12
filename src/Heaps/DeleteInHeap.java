/*
This is Code is for Min Heap
The root value is the Smallest
This whole logic in this code Implements Priority Queues
 */

package Heaps;
import java.util.*;
public class DeleteInHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // adding elements to the Heap
            arr.add(data);
            int x = arr.size() - 1;
            int parentIndex = (x - 1) / 2;
            while(arr.get(x) < arr.get(parentIndex)) { // O(log n)
                //swapping
                int temp = arr.get(x);
                arr.set(x, arr.get(parentIndex));
                arr.set(parentIndex , temp);

                x = parentIndex;
                parentIndex = (x - 1) / 2;
            }
        }

        public boolean isEmpty(){//checking if the heap is Empty or not
            return arr.isEmpty();
        }

        public int peek(){ // This Peeks the Smallest Value from the Heap
            return arr.getFirst();
        }

        private void Heapify(int i){
            int leftChild = (2 * i) + 1;//gets the index of the left child
            int rightChild = (2 * i) + 2;//gets the index of the right child
            int minIdx = i;
            if(leftChild < arr.size() && arr.get(leftChild) < arr.get(minIdx)){
                minIdx = leftChild;
            }
            if (rightChild < arr.size() && arr.get(rightChild) < arr.get(minIdx)){
                minIdx = rightChild;
            }
            if(minIdx != i) {
                int temp = arr.get(i);
                arr.set(i , arr.get(minIdx));
                arr.set(minIdx , temp);
                Heapify(minIdx);
            }
        }
        public int remove(){
            int data = arr.getFirst();
            //step 1 is to swap with the last index
            int temp = arr.getFirst();
            arr.set(0 , arr.getLast());
            arr.set((arr.size() - 1) , temp);
            //step 2 was tp delete the last index
            arr.removeLast();
            //step 2 is to fix the Heap if it gets messed up
            //for that you need a special function called Heapify
            Heapify(0);
            return data;
        }

    }
    public static void main(String [] args){
        Heap myHeap = new Heap();
        myHeap.add(3);
        myHeap.add(4);
        myHeap.add(1);
        myHeap.add(5);

        while(!myHeap.isEmpty()){
            System.out.println(myHeap.peek());
            myHeap.remove();
        }
    }
}
