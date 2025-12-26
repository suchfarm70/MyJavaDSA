package BACKTRACKING;
public class PermutationsABC {
    static void permuations(String str , String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //work
        for(int i = 0 ; i < str.length() ; i++){
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);

            permuations(newStr, ans + current);
        }
    }
    public static void main(String [] args){
        String str = "ABC";
        permuations(str, "");
    }
}
