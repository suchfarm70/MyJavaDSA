package TrialPractice;
import java.util.*;
public class StackTest {
    public static void main(String [] args){
        Stack<Integer> myStack = new Stack<>();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
            myList.addLast(i);
        }
        System.out.println(myStack);
        System.out.println(myList);
    }
}
