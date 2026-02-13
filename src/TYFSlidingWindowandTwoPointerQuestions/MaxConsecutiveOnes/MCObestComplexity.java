package TYFSlidingWindowandTwoPointerQuestions.MaxConsecutiveOnes;
// Time Complexity of this code is just O(N)
public class MCObestComplexity {
    public static int findconsecuitveones(int [] arr , int arrlen , int k){
        int len = 0;
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int zeros = 0;

        while (right < arrlen) {
            if (arr[right] == 0) {
                zeros++;
            }
            if (zeros > k) {
                if (arr[left] == 0) {
                    zeros--;                    
                }
                left++;
            }
            if (zeros <= k) {
                len = right - left + 1;
                maxlen = Math.max(maxlen, len);
            }
            right++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {1 ,1 ,1 , 0, 0, 0,1 ,1 ,1 ,1 , 0};
        int k = 2;
        int len = arr.length;
        System.out.println(findconsecuitveones(arr, len, k));
    }
}