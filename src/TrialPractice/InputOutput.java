package TrialPractice;
import java.util.*;
class InputOutput {
    Scanner sc = new Scanner(System.in);
    int x,y,result;
    void input(){
        System.out.println("Please Enter a Number for Calculation");
        x = sc.nextInt();

        System.out.println("Please enter the second number for calculation");
        y = sc.nextInt();
    }

    void calculation(){
        System.out.println("The Process of calculation has started");
        result = x + y;
    }

    void output(){
        System.out.println("The Process of Calculation has completed");
        System.out.println("The Output is");
        System.out.println(result);
        }
    public static void main(String [] args){
        InputOutput obj = new InputOutput();
        obj.input();
        obj.calculation();
        obj.output();
    }
}
