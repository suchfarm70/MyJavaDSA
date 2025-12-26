package TrialPractice;
import java.util.*;
public class StackParenthesesPractice {
    public static boolean isvalid(String str){
        Stack<Character> myStack = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){//traversing the string
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') { // entering part
                myStack.push(ch);
            }
            // case where a closing bracket is left
            if ( (ch == ')' || ch == '}' || ch == ']')  && myStack.isEmpty()) {
                return false;
            }
            //removal part
            if (ch == '}' && myStack.peek() == '{') {
                myStack.pop();
            }
            if (ch == ']' && myStack.peek() == '[') {
                myStack.pop();
            }
            if (ch == ')' && myStack.peek() == '(') {
                myStack.pop();
            }
        }
        //returing true if stack is empty
        if (myStack.isEmpty()) {
            return true;
        } else {
            return false;
        }    
    }
    public static void main(String [] args){
        //String str = "(){}[]";
        String str = "))))))";
        System.out.println(isvalid(str));
    }
}