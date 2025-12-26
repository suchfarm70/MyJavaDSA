package QUEUES;
public class QueueLL {

    static class  Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        } 
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        //isFull() function is not need because we are using a Linked list

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void addNode(int n){
            Node newNode = new Node(n);

            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = head.data;
            //single element when tail is equals to head
            if(head == tail){
                head = tail = null;
            }
            else{
                head = head.next;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String [] args){
        Queue q = new Queue();
        q.addNode(10);
        q.addNode(20);
        q.addNode(30);
        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.remove();
        }
    }
}
