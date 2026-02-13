package TYFSlidingWindowandTwoPointerQuestions.MaxConsecutiveOnes;
// This solution has a time complexity is O(N + N)
public class MCNos1sbetterTime {
    public static int findconsecuitveones(int [] arr , int arrlen , int k){
        int maxlen = 0;
        int right = 0;
        int left = 0;
        int len = 0;

        int zeros = 0;
        while (right < arrlen) {// this loops makes sure that is the time Complexity id O(N)
            if (arr[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
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