package TrialPractice;
public class AMinusB {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int sum = a + b;
        int dif = a - b;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a);
        System.out.println("b "+ b);
        //System.out.println(" A + B = "+ sum);
        //System.out.println(" A - B ="+ dif);
    }
}
