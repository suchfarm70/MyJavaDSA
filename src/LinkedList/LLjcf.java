/*
 * WAP in java to create a linked list of Team members of a cricket Team then enter a new player who will peplace an old player
 * Take the value of the new Player and the position he will be replacing. Show the Linked List Before and After making the changes
 */
package LinkedList;
import java.util.*;
public class LLjcf {
    public static void llprinter(LinkedList<Integer> myll){
        for (int iter : myll) {
            System.out.print(iter+" ");
        }
    }
    public static void changell(LinkedList<Integer> myll , int new_member , int pos){
        myll.set(pos - 1, new_member);
        llprinter(myll);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> myll = new LinkedList<>();
        System.out.println("Enter size of the Linked List");
        int size_of_team = sc.nextInt();
        System.out.println("Enter Members of the Team");
        for(int i = 0 ; i < size_of_team ; i++){
            myll.add(sc.nextInt());
        }
        System.out.println("Enter the New Team Member");
        int new_member = sc.nextInt();
        System.out.println("Enter position of the New Member");
        int pos = sc.nextInt();
        System.out.println("Linked List Before Changing Team members");
        llprinter(myll);
        System.out.println("\nLinked List After Changing Team Members");
        changell(myll, new_member, pos);
    }
}