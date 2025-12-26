package TrialPractice;
import java.util.*;
public class ManhattenDistance {
    public static void Distance_2D(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Initial X Co - ordinate");
        int initial_x = sc.nextInt();
        System.out.println("Enter the Initial Y Co - ordinate");
        int initial_y = sc.nextInt();

        System.out.println("Enter the Destination X Co - ordinate");
        int final_x = sc.nextInt();
        System.out.println("Enter the Destination Y Co - ordinate");
        int final_y = sc.nextInt();

        System.out.println(calculate(initial_x, initial_y, final_x, final_y));
    }

    public static void Distance_3D(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Initial X Co - ordinate");
        int initial_x = sc.nextInt();
        System.out.println("Enter the Initial Y Co - ordinate");
        int initial_y = sc.nextInt();
        System.out.println("Enter the Initial Z Co - ordinate");
        int initial_z = sc.nextInt();

        System.out.println("Enter the Destination X Co - ordinate");
        int final_x = sc.nextInt();
        System.out.println("Enter the Destination Y Co - ordinate");
        int final_y = sc.nextInt();
        System.out.println("Enter the Destination Z Co - ordinate");
        int final_z = sc.nextInt();

        System.out.println(calculate(initial_x, initial_y, initial_z, final_x, final_y, final_z));
    }

    public static int calculate(int initial_x , int initial_y , int final_x , int final_y){// for 2 Diemensional calculation
        // formual distance = |x2 - x1| + |y2 - y1|
        return Math.abs((final_x - initial_x)) + Math.abs((final_y - initial_y));
    }

    public static int calculate(int initial_x , int initial_y , int initial_z , int final_x , int final_y , int final_z){// for 2 Diemensional calculation
        // formual distance = |x2 - x1| + |y2 - y1| + |z2 - z1|
        return Math.abs((final_x - initial_x)) + Math.abs((final_y - initial_y)) + Math.abs((final_z - initial_z));
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 for 2 Dimensional Calculation");
        System.out.println("Enter 3 for 3 Dimensional Calculation");
        int input = sc.nextInt();
        if (input == 2) {
            Distance_2D();
        } else {
            Distance_3D();
        }
    }
}