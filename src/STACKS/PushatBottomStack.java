package STACKS;
import java.util.*;
public class PushatBottomStack {
    static void pushatbottom(Stack<Integer> stack , int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushatbottom(stack, data);
        stack.push(top);
    }
    public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        pushatbottom(stack , 40);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}