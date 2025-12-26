package BinarySearchTreesPART01;
//To validate a BST there are Two Methods
/*               METHOD 1
First Traverse the Tree in INorder Manner
store everything in an array
The Array SHould be Sorted

                 METHOD 2
check if the "max value in the leftsubtree < Node"
                   and
minimum value in right subtree is > Node

This Program uses Method 1
*/
import java.util.*;
public class ValidateBSTINorderMethod {
    public static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    public static Node buildTree(Node root , int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data > value){
            root.leftNode = buildTree(root.leftNode, value);
        } else {
            root.rightNode = buildTree(root.rightNode, value);
        }

        return root;
    }
    
    //If this function returns Ture then it is a Valid BST or else it is NOT a valid BST
    public static boolean isSorted(ArrayList<Integer> mylist){
        for (int i = 0; i < mylist.size() - 1; i++) {
            if(mylist.get(i) > mylist.get(i + 1)){
                return false;
            }
        }
        return true;
    }
    public static void inordervalidBST(Node root , ArrayList<Integer> mylist){
        
        if(root == null){
            return;
        }

        inordervalidBST(root.leftNode , mylist);
        mylist.add(root.data);
        inordervalidBST(root.rightNode , mylist);

    }
    
    public static void main(String[] args) {
        Node root = null;
        ArrayList<Integer> mylist = new ArrayList<>();
        /* 
        int[] arr = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        for (int i = 0; i < arr.length; i++) {
            root = buildTree(root, arr[i]);
        }*/

        root = new Node(10);
        root.leftNode = new Node(11);
        root.rightNode = new Node(9);
        root.leftNode.leftNode = new Node(7);
        root.leftNode.rightNode = new Node(15);
        /*
         *          10
         *         /  \
         *        11   9
         *       /  \
         *      7    15
         * 
         * checking if the above BST is Valid or Not (False)
         */

        inordervalidBST(root, mylist);
        System.out.println(isSorted(mylist));
    }
}
