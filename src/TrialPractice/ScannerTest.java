package TrialPractice;
import java.util.*;
public class ScannerTest {
    int input = 0;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the function");
        input = sc.nextInt();
    }

    public void display(){
        System.out.println(input+" Plus here is the message from the DISPLAY function");
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ScannerTest obj = new ScannerTest();
        System.out.println("Enter the value into the main function");
        int input = sc.nextInt();
        obj.input();
        obj.display();
        System.out.println(input +" message from the main function");
    }
}
