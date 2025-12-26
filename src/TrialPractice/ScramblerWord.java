package TrialPractice;
import java.util.*;
public class ScramblerWord {

    //this Scrambles the Word
    static String scrambler(String word){
        StringBuilder sb = new StringBuilder();//for storing the scrambled word
        Random random = new Random();//for the ramdomization of the characters
        int min = 0;//for the ramdon function, starting index
        int max = word.length();//for the random function, ending index
        int i = 0;
        ArrayList<Integer> hist = new ArrayList<>();//history of used indices
        while (i < max) {
            int x = random.nextInt(max - min);//generated ramdon index within range
            if (hist.contains(x)) {//checks if a index already exists in the SB
                continue;//if yes Skips
            }
            hist.add(x);
            sb.append(word.charAt(x));
            i++;    
        }
        return sb.toString();
    }

    //this gives a hint
    static void hint(){
        System.out.println("Keep in Mind you only have 1 hint");
        System.out.println("That is");
        System.out.println("Two Donkeys and You are in a Nation");
        //System.out.println("Programming Language where a programmer is Spoon Fed with Libraries");
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String word = "python";//initialize
        String word = "assassination";
        String sb = ScramblerWord.scrambler(word);//scrambled
        boolean hintleft = true;
        System.out.println("Hello and Welcome the Land of Scrambled Words");
        System.out.println("Guess the Correct Word for a Candy and you can ask for a single Hint");
        System.out.println("Here is your Scrambled Word "+"\""+ sb +"\"");
        System.out.println("You will get 3 Tries");

        for (int i = 1; i <= 3; i++) {

            System.out.println("Trial No "+i+" Enter your Word");
            String inputword = sc.nextLine();//input from the user
    
            if (inputword.equalsIgnoreCase(word)) {
                System.out.println("Congratulations you got it right!!!");
                break;
            } else {
                System.out.println("Sorry you got it Wrong!!! dun dun dun");
                System.out.println("You have "+(3 - i)+" attempst left");
                
                char ch = '\0';
                if (hintleft) {
                    System.out.println("Do you want a Hint? Y/N");
                    ch = sc.nextLine().charAt(0);
                
                    if (ch == 'Y' || ch == 'y') {
                        ScramblerWord.hint();
                        hintleft = false;
                    } else {
                        System.out.println("Okay your choice");
                    }
                }
            }
        }
    }
}