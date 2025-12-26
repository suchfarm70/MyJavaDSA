package STACKS;
import java.util.ArrayList;

public class StackArray {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }


        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            int top = list.getLast();
            list.remove(list.getLast());
            return top;
        }


        public static int peek(){
            return list.getLast();
        }
    }
    public static void main(String [] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
