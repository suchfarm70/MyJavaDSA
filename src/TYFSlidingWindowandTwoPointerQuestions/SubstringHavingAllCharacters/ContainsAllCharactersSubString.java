package TYFSlidingWindowandTwoPointerQuestions.SubstringHavingAllCharacters;
import java.util.*;
public class ContainsAllCharactersSubString {
    public static int Calculate(String string , int num){
        int low= 0;
        int high = 0;
        int count = 0;
        HashMap<Character , Integer> mymap = new HashMap<>();
        while(high < string.length()){
            char ch = string.charAt(high);
            mymap.put(ch,mymap.getOrDefault(ch,0)+1);

            if(mymap.size() < num){

            }
        }
        return 0;
    }
    public static void main(String[] args){
        int number = 3;
        System.out.println(Calculate("bbacba" , number));
    }
}
