package TYFSlidingWindowandTwoPointerQuestions.KDistinctCharacters;
import java.util.*;
public class KDistinctCharacters {
    public static int Calculate(String arr , int K){
        int len = 0;
        int maxlen = 0;
        int low = 0;
        int high = 0;

        HashMap<Character  ,Integer> mymap = new HashMap<>();
        while(high < arr.length()){
            char ch = arr.charAt(high);
            mymap.put(ch , mymap.getOrDefault(ch , 0) + 1);

            if(mymap.size() > K){
                char ch1 = arr.charAt(low);

                mymap.put(ch1 , mymap.get(ch1) - 1);

                if (mymap.get(ch1) == 0){
                    mymap.remove(ch1);
                }

                low++;
            }


            len = high - low + 1;
            maxlen = Math.max(maxlen , len);
            high++;
        }
        return maxlen;
    }
    public static void main(String [] args){
        String arr = "aaabbccdd";
        int K = 2;
        System.out.println(Calculate(arr,K));
    }
}
