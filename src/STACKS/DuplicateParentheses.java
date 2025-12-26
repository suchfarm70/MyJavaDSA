package STACKS;
import java.util.*;
public class DuplicateParentheses {

    static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch != ')'){
                s.push(ch);
            }
            else if(ch == ')'){
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true;
                }
                else {
                    s.pop();
                }
            }
            else if(ch == ')' && s.isEmpty()){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        String str1 = "((a + b))";
        String str2 = " ((a - b)";

        System.out.println(isDuplicate(str2));
    }
}
