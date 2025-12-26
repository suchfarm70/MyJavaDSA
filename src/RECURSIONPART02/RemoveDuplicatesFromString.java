package RECURSIONPART02;
//import java.util.*;
public class RemoveDuplicatesFromString {

    public static void removeduplicates(String str , int idx , StringBuilder newstr , boolean map[]){
        //base case where we have reached the final index
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        //work
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeduplicates(str, idx + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            removeduplicates(str, idx + 1, newstr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        StringBuilder newstr = new StringBuilder();
        boolean[] map = new boolean[26];
        removeduplicates(str, 0, newstr, map);
    }
}
