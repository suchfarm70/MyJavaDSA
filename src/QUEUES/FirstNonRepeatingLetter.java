
/*The Following Question states that he characters are all small letters */
package QUEUES;
import java.util.*;
public class FirstNonRepeatingLetter {
    static void printNonRepeating(String str){
        int freq[] = new int[26]; 
        Queue<Character> queue = new LinkedList<>();

        for(int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i);
            queue.add(ch);
            freq[ch - 'a']++;

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }
            if(queue.isEmpty()){
                System.out.println(-1+ " ");
            }
            else{
                System.out.println(queue.peek() + " ");
            }
        }
    }
    public static void main(String [] args){
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
