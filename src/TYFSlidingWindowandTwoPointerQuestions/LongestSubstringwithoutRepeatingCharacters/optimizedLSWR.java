// This is the optimized method for solving this question
package TYFSlidingWindowandTwoPointerQuestions.LongestSubstringwithoutRepeatingCharacters;
import java.util.*;
public class optimizedLSWR {
    public static int findstringLSWR(String str , int lenght){
        HashMap<Character , Integer> occured = new HashMap<>();
        int len = 0;
        int left = 0;
        int right = 0;
        int maxlen = 0;
        while (right < lenght) {
            char ch = str.charAt(right);
            if (!occured.containsKey(ch)) {
                occured.put(ch,right);
            }
            else {
                //is it before or after the Left Pointer
                if (occured.get(ch) >= left) {
                    left = occured.get(ch) + 1;
                    occured.put(ch, right);
                    len = right - left + 1;
                }
                else {
                    occured.put(ch, right);
                }
            }
            len = right - left + 1;
            maxlen = Math.max(maxlen, len);
            right++;
        }
        return maxlen;
    }
    public static void main(String [] args){
        String str = "cadbzabcd";
        System.out.println("Longest Substring without repetition = "+findstringLSWR(str, str.length()));
    }
}
