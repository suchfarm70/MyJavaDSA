package QUEUES;
import java.util.*;
public class QueueUsingStacks {

    public static class InnerQueueUsingStacks {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //addition takes O(n)
        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());                
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }


        public static int peek(){
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
        }
    }
    public static void main(String [] args){
        InnerQueueUsingStacks queue = new InnerQueueUsingStacks();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();         
        }
    }
}
