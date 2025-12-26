package QUEUES;
//import java.util.*;
public class CircularQueue {

    static class  Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear + 1) % size == front;
        }


        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }

            if(front == -1 && rear == -1){
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            int result = arr[front];
            //front = (front + 1) % size;
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return  -1;
            }
            return arr[front];
        }
    }
    public static void main(String [] args){
        Queue q = new Queue(3);
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Eliminated "+q.remove());
        q.add(40);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
