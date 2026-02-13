package TrialPractice;
import java.util.*;
public class foursum {
    public static void displaycombinations(int[] arr , int target){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                for(int k = j + 1 ; k < arr.length ; k++){
                    for(int l = k + 1 ; l < arr.length; l++){
                        if(arr[i] + arr[j] + arr[k] + arr[l] == target //&& 
                            //(arr[i] != arr[j]) && arr[j] != arr[k] && arr[k] != arr[l] && arr[l] != arr[i]
                            ){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("NO of possible Quadruplets "+ count);
    }
    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        int arr2[] = {2,2,2,2};
        int target = 0;
        int target2 = 8;
        displaycombinations(arr2, target2);
    }
}
