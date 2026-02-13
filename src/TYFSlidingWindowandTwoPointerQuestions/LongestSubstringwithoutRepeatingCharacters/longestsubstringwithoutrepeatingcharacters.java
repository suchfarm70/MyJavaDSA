//This solution solves the question in O(N^2) Time complexity
package TYFSlidingWindowandTwoPointerQuestions.LongestSubstringwithoutRepeatingCharacters;
public class longestsubstringwithoutrepeatingcharacters {
    public static int findString(String str , int arrlen){
        int maxlen = 0;
        for(int i = 0 ; i < arrlen ; i++){
            int hasharr[] = new int[256];
            int len = 0;      // <-- Reset here
            for(int j = i ; j < arrlen ; j++){
                char ch = str.charAt(j);
                int asciival = (int)ch;

                if (hasharr[asciival] == 1) {
                    break;
                }
                hasharr[asciival] = 1;
                len = j - i + 1;
            }
            maxlen = Math.max(maxlen, len);
        }
        return maxlen;
    }
    public static void main(String [] args){
        String str = "aijegbuiabvibaegbbbccccddddaaaaaasirbgviyabevo";
        System.out.println("Maximum lenght of substring without repetition = "+ findString(str, str.length()));
    }
}