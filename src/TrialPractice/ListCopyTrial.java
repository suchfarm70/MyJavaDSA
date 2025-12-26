package TrialPractice;
import java.util.*;
public class ListCopyTrial {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        System.err.println(list1);

        ArrayList<Integer> list2 = list1;
        System.out.println(list2);
    }
}
