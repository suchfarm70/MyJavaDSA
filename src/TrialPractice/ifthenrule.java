package TrialPractice;
import java.util.*;
public class ifthenrule {
    static void calculator(int hum , int temp){
        // range of temperature being considered in 45 degrees C
        if(temp < 0 || temp > 50){
            System.out.println("Invalid Temperature Output");
            return;
        }

        // range of 0% to 100%
        if(hum < 0 || hum > 100){
            System.out.println("Invalid Humidity Output");
            return;
        }

        if(temp <= 20){
            /*if (hum <= 33) {
                System.out.println("low fan speed");
                return;
            }

            if (hum >= 34 && hum <= 66) {
                System.out.println("low fan speed");
                return;
            }

            if (hum <= 100) {
                System.out.println("low fan speed");
                return;
            }*/
            System.out.println("Low Fan Speed");
            return;
        }

        if(temp >= 21 && temp <= 30){
            if (hum <= 33) {
                System.out.println("low fan speed");
                return;
            }

            if (hum >= 34 && hum <= 66) {
                System.out.println("Medium fan speed");
                return;
            }

            if (hum <= 100) {
                System.out.println("Medium fan speed");
                return;
            }
        }

        if (temp >= 31 && temp <= 40) {
            if (hum <= 33) {
                System.out.println("Medium fan speed");
                return;
            }

            if (hum >= 34 && hum <= 66) {
                System.out.println("High fan speed");
                return;
            }

            if (hum <= 100) {
                System.out.println("High fan speed");
                return;
            }
        }

        if (temp >= 41 && temp <= 50) {
            /*if (hum <= 33) {
                System.out.println("High fan speed");
                return;
            }

            if (hum >= 34 && hum <= 66) {
                System.out.println("High fan speed");
                return;
            }

            if (hum <= 100) {
                System.out.println("High fan speed");
                return;
            }*/
            System.out.println("High Fan Speed");
            return;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Temperature");
            int temp = sc.nextInt();
            System.out.println("Enter Humidity");
            int hum = sc.nextInt(); 

            ifthenrule.calculator(hum, temp);
        }  
    }
}
