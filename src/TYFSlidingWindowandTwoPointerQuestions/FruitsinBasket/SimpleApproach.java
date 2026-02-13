package TYFSlidingWindowandTwoPointerQuestions.FruitsinBasket;
import java.util.*;
//this approach creates all the subarrays that are possible
public class SimpleApproach {

    public static int Calculate(int[] array){
        int len = 0;
        int maxlen = 0;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i ; j < array.length ; j++){
                HashSet<Integer> set = new HashSet<>();
                len = j - i + 1;//calculation of length
                for(int k = i ; k <= j ; k++){
                    set.add(array[k]);
                }
                if(set.size() > 2){
                    set.clear();
                    len = 0;
                }

                maxlen = Math.max(maxlen , len);
            }
        }
        return maxlen;
    }

    public static void main(String [] args){
        int[] arr = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(Calculate(arr));
    }
}
