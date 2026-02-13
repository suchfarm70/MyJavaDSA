package TYFSlidingWindowandTwoPointerQuestions.MaxConsecutiveOnes;
/*  In this solution our approach instead of dealing with 1s
    We think about the consecutive number of 0s for better understanding
 */
public class maxconsecutiveones {
    public static int findconsecuitveones(int [] arr , int arrlen , int k){
        int maxlen = 0;
        int len = 0;
        for(int i = 0 ; i < arrlen ; i++){
            int zeros = 0;

            for(int j = i ; j < arrlen ; j++){
                if (arr[j] == 0) {
                    zeros++;
                }
                if (zeros <= k) {
                    len = j - i + 1;
                    maxlen = Math.max(maxlen, len);
                }
                else {
                    break;
                }
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] arr = {1 ,1 ,1 , 0, 0, 0,1 ,1 ,1 ,1 , 0};
        int k = 3;
        int len = arr.length;
        System.out.println(findconsecuitveones(arr, len, k));
    }
}