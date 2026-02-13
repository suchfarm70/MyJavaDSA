package TYFSlidingWindowandTwoPointerQuestions.FruitsinBasket;
import java.util.*;
public class Optimal2PointerApproach {

    public static int Calculate(int[] arr) {
        Map<Integer, Integer> basket = new HashMap<>(); // count of fruits in current window
        int start = 0, maxCount = 0;

        for (int end = 0; end < arr.length; end++) {
            basket.put(arr[end], basket.getOrDefault(arr[end], 0) + 1);

            // Shrink window if more than 2 types
            while (basket.size() > 2) {// turning this while condition into a IF condition improves the code
                basket.put(arr[start], basket.get(arr[start]) - 1);
                if (basket.get(arr[start]) == 0)
                    basket.remove(arr[start]);
                start++;
            }

            // Update maximum fruits collected
            maxCount = Math.max(maxCount, end - start + 1);
        }

        return maxCount;
    }

    public static void main(String [] args){
        int[] arr = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(Calculate(arr));
    }
}
