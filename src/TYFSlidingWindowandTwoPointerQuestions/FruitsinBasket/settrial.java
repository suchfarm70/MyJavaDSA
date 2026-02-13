package TYFSlidingWindowandTwoPointerQuestions.FruitsinBasket;
import java.util.*;
public class settrial {
    static void main() {
        int[] arr = {3,3,3,1,2,1,1,2,3,3,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
        System.out.println(set.size());
        set.clear();;
        System.out.println(set);
    }
}
