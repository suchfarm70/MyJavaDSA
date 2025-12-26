// Competitive Programming Lab Question
package TrialPractice;
import java.util.*;
public class StringWork {
    static boolean isPalin(String str){
        String temp = "";
        for(int i = str.length() - 1; i>= 0 ; i--){
            temp = temp + str.charAt(i);
        }
        if(str.equals(temp)){
            //System.out.println(temp + " true");
            return true;
        } else {
            //System.out.println(temp + " false");
            return false;
        }
    }

    static String work(String str , int i){
        // Hello 3
        // right rotation take 3 characters from the right and place them on the left
        // left Rotation take 3 characters from the left and place them on the right

        //right rotation
        String str1 = str.substring((str.length()) - i);
        String str2 = str.substring(0 , i);
        //System.out.println(str1+" "+str2);
        String right = str1 + str2; //right rotation is correct
        System.out.println(right);

        // left rotation
        String str3 = str.substring(0 , i);
        String str4 = str.substring(i);
        //System.out.println(str3+" "+str4);
        String left = str4 + str3;//left rotation is correct
        System.out.println(left);

        if(isPalin(left) == true && isPalin(right) == true){
            return "True";
        }
        return "False";
    }

    public static void main(String[] args) {
        //isPalin("helleh");
        //System.out.println(work("helleh" , 3));
        //work("helleh", 3);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] parts = str.split(" ");
        String X = parts[0];
        int Y = Integer.parseInt(parts[1]);
        System.out.println(work(X , Y));
    }
}
