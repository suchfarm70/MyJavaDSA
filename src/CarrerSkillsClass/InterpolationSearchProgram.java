package CarrerSkillsClass;

public class InterpolationSearchProgram {
    public static int interpolationSearch(int[] array , int target){
        int high = array.length - 1;
        int low = 0;

        while(target >= array[low] && target <=array[high] && low <= high){

            int probe =  low + (high - low) * (target - array[low]) /
                                (array[high] - array[low]);

            System.out.println("probe "+ probe);

            if(array[probe] == target){
                return probe;
            }
            else if(array[probe] < target){
                low = probe + 1;
            }
            else {
                high = probe - 1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        //int[] arr = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8, 9 ,10};
        int[] arr = {1 ,20 ,35 ,47 ,55 ,68 ,79 ,81, 93 ,101};
        System.out.println(interpolationSearch(arr , 79));
    }
}
