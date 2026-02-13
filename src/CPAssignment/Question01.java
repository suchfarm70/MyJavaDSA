package CPAssignment;
import java.util.*;
public class Question01 {

    String InputString =  "";
    int maxFreq = Integer.MIN_VALUE;
    int minFreq = Integer.MAX_VALUE;
    HashMap<Character , Integer> mymap = new HashMap<>();

    public void Input_String(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        InputString = sc.nextLine();
    }

    //the given function finds the frequency of the character in the given string
    public void frequency_calculator(){
        for (int i = 0 ; i < InputString.length() ; i++) {
            char temp = InputString.charAt(i);
            int count = 0;
            for (int j = 0 ; j < InputString.length() ; j++) {
                if(temp == InputString.charAt(j)){
                    count++;
                }
            }
            if (count > maxFreq) {
                maxFreq = count;
            }
            if (count < minFreq) {
                minFreq = count;
            }
            mymap.put(temp, count);
        }
    }

/**
     * Implements the required custom sorting logic:
     * 1. Increasing order of frequency (Ascending).
     * 2. If frequency is the same, character coming later lexicographically comes first (Descending).
     */
    public void String__Printer() {
        if (mymap.isEmpty()) {
            System.out.println("No characters to sort.");
            return;
        }

        // 1. Get the list of unique characters (keys)
        List<Character> uniqueChars = new ArrayList<>(mymap.keySet());

        // 2. Sort the unique characters using the custom Comparator
        uniqueChars.sort((c1, c2) -> {
            int freq1 = mymap.get(c1);
            int freq2 = mymap.get(c2);

            // Primary comparison: Frequency (Ascending)
            int freqComparison = Integer.compare(freq1, freq2);

            if (freqComparison != 0) {
                return freqComparison;
            }

            // Secondary comparison: Character (Descending Lexicographical Order)
            // c2 - c1 returns a positive value if c2 > c1, thus sorting c2 first.
            return c2 - c1;
        });

        // 3. Build the final sorted string
        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            int count = mymap.get(c);
            
            // Append the character its frequency number of times
            // Using String.repeat() for conciseness (Java 11+)
            result.append(String.valueOf(c).repeat(count));
        }
        
        System.out.println("\n--- Sorted String Output ---");
        System.out.println(result.toString());
        System.out.println("----------------------------");
    }


    public void String_Printer(){
        for (int i = minFreq; i < maxFreq; i++) {
        }
    }
    public void map_Printer(){
        System.out.println("Hashmap with Frequency");
        System.out.println(mymap);
        System.out.println("max frequency = "+maxFreq);
        System.out.println("min frequency = "+minFreq);
    }
    public static void main(String [] args){
        Question01 obj = new Question01();
        obj.Input_String();
        obj.frequency_calculator();
        obj.map_Printer();
    }
}