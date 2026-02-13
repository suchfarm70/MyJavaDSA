package CPAssignment;

import java.util.*;

public class Question04 {
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1); 
        
        int sum = 0;
        int maxLen = 0; 
        
        for (int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            
            if (mp.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i = 0 ; i < x ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxLength(arr));
    }
}