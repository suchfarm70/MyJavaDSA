package RECURSIONPART01;
public class FirstLastOccurence {
    static int firstoccur(int x , int i , int arr[]){

        if(i == arr.length){
            return -1;
        }

        if(x == arr[i]){
            return i;
        }

        return firstoccur(x, i + 1, arr);
    }

    static int lastoccur(int x , int i , int arr[]){
        if(x == arr[i]){
            return i;
        }

        if(i == 0){
            return -1;
        }

        return lastoccur(x, i - 1 , arr);
    }
    public static void main(String [] args){
        int arr[] = {40 ,10 , 20 , 30 , 40 , 50 , 60 , 55 };
        System.out.println(firstoccur(55, 0, arr));
        System.out.println(lastoccur(40 , arr.length - 1 , arr));
    }
}
