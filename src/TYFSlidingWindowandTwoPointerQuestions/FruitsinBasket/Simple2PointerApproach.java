package TYFSlidingWindowandTwoPointerQuestions.FruitsinBasket;
import java.util.*;
//this is still O(N*N) time complexity
public class Simple2PointerApproach {
    public static void main(String [] args){
        int[] arr = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(Calculate(arr));
    }

    public static int Calculate(int[] array) {
        int len = 0;
        int maxlen = 0;
        int low = 0;
        int high = 0;
        HashSet<Integer> myset = new HashSet<>();
        while(high < array.length){
            len = high - low + 1;//calculation of length
            for(int i = low; i <= high ; i++){
                myset.add(array[i]);
            }

            if(myset.size() > 2){
                myset.clear();
                len = 0;
                low++;
            }

            maxlen = Math.max(maxlen , len);
            high++;
        }
        return maxlen;
    }
}
