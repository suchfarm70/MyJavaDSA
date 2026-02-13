package Heaps;
public class HeapSorting {
    //This function heapifies the Heap into MAXHEAP
    public static void heapify(int[] arr ,int i , int size){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]) { //MaxHeap Condition
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]) { //MaxHeap Condition
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx , size);
        }
    }
    public static void HeapSort(int[] arr){
        //step 1 Build MaxHeap
        int n  = arr.length;
        for(int i = n / 2 ; i>= 0 ; i--){
            heapify(arr, i, n);
        }
        //step 2 push largest to the end
        for(int i = n - 1 ; i >0 ; i--){
            //swap largest with the last index
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0 , i);
        }
    }
    public static void main(String [] args) {
        int[] arr = {1, 2, 4, 5, 3};
        //currently this arr(Heap) is in MinHeap Form

        HeapSort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
