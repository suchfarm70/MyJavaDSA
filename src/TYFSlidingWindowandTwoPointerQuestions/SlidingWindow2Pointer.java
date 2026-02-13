package TYFSlidingWindowandTwoPointerQuestions;
import java.util.Scanner;
public class SlidingWindow2Pointer{
    static class Info{
        int max = 0;
        int pos = 0;

        Info(int max , int pos){
            this.max = max;
            this.pos = pos;
        }
    }
    public static Info twopointerwindow(int arr[] , int N , int K){
        int Maxsum = 0;
        int left = 0;
        int right = K;
        Info resInfo = new Info(0, 0);
        for(int i = 0 ; i < K ; i++){// this loop initializes the maxsum
            Maxsum = Maxsum + arr[i];
        }
        int Currsum = Maxsum; // this currsum is for comparision
        while (right < N) {
            Currsum = Currsum - arr[left]; // this line removes the value from the left

            Currsum = Currsum + arr[right]; // this line adds a new value from the right

            //now we update the new sum if the Currsum beats the old sum
            if (Currsum > Maxsum) {
                Maxsum = Currsum;
                resInfo.max = Maxsum;
                resInfo.pos = left;
            }
            

            //these two lines moves the whole window to the right by one index
            left++;
            right++;
        }
        
        return resInfo;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N;
        int windowsize;
        System.out.println("Enter size of array");
        N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter value into the array");
        for(int i = 0 ; i < N ; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter size of window");
        windowsize = sc.nextInt();
        if (windowsize > N) {
            System.out.println("Invalid Window Size");
            return;            
        }
        Info result = twopointerwindow(arr, N, windowsize);
        System.out.println("Maximum Sum Possible = "+ result.max +" \nAt Index = "+result.pos);
    }
}