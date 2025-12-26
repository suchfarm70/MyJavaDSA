/* Here is the logic, We are given two BSTs
 * So now we traverse them in Inorder manner
 * and store the values in an Arraylist
 * Then we have a Sorted Array List 
 * We already know how to make BST using a Sorted ArrayList */
package BinarySearchTreesPART02;
import java.util.*;
public class Merge2BSTs {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorderReader(Node root , ArrayList<Integer> mylist){
        if (root == null) {
            return;
        }
        inorderReader(root.left, mylist);
        mylist.add(root.data);
        inorderReader(root.right , mylist);
    }
    public static void inorderTraversal(Node root){
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
    public static Node buildBSTfromList(ArrayList<Integer> mylist , int start , int end){
        //base condition
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(mylist.get(mid));
        Node left_half = buildBSTfromList(mylist, start, mid - 1);
        Node right_half = buildBSTfromList(mylist, mid + 1, end);
        root.left = left_half;
        root.right = right_half;
        return root;
    }
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        Node root1 = new Node(2);//First BST
        root1.left = new Node(1);
        root1.right = new Node(4);
        Node root2 = new Node(9);//Second BST
        root2.left = new Node(3);
        root2.right = new Node(12);
        inorderReader(root1, mylist);//traverse the first BST
        inorderReader(root2, mylist);//traverse the second BST
        //printing the list for verification for correct extraction
        System.out.println("List Before Sorting \n"+mylist);
        Collections.sort(mylist);//sorted the list
        System.out.println("List After Sorting \n"+mylist);
        System.out.println("IN-Order Traversal of New BST");
        Node newroot = buildBSTfromList(mylist, 0, mylist.size() - 1);
        inorderTraversal(newroot);
    }
}