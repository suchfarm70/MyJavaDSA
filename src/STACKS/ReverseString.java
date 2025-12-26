package STACKS;
import java.util.*;
public class ReverseString {

    void reverse(String str){
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while(index < str.length()){
            stack.push(str.charAt(index));
            index++;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb+" ");
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a String");
        s = sc.nextLine();

        ReverseString obj = new ReverseString();
        obj.reverse(s);
    }
}
