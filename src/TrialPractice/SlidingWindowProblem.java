package TrialPractice;
public class SlidingWindowProblem {
    public static void main(String [] args){
        int window_size = 3;
        int arr[] = {13 , 12 , 10 , 11 , 15 ,16 , 20 , 11 , 21 , 34};
        //starting index will be K (the size of the window)
        for(int i = 0 ; i < arr.length - window_size ; i++){
            //System.out.println(arr[i]);
            int sum = 0;
            for(int j = 0 ; j < window_size ; j++){
                sum = sum + arr[i + j];
                //System.out.print(arr[i + j]+ " ");
            }
            System.out.println(sum);
        }
    }
}