package STACKS;
import java.util.*;
public class ReverseStack {
    public static void pushatbottom(Stack<Integer> stack , int data){
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushatbottom(stack , data);
        stack.push(top);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushatbottom(stack, top);
    }
    public static void printStack(Stack<Integer> stack){
        for(int ele : stack){
            System.out.println(ele);
        }
    
    }
    public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        printStack(stack);
        reverse(stack);
        printStack(stack);
    }
}
