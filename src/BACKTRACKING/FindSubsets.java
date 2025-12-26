package BACKTRACKING;
public class FindSubsets {
    void findsubsets(int i , String ans , String str){
        //base case
        if(i == str.length()){
            if(ans == ""){
                System.out.println("Null Set");
                return;
            }
            System.out.println(ans);
            return;
        }

        //Now the part where each character makes a choice to be added to the "ans" string or not
        //yes recursive call
        findsubsets(i + 1, ans + str.charAt(i), str);

        //no recurive call
        findsubsets(i + 1, ans, str);
    }
    public static void main(String [] args){
        String str = "abc";
        FindSubsets obj = new FindSubsets();
        obj.findsubsets(0, "", str);
    }
}
