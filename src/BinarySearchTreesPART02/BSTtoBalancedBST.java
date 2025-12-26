// FIX YOU SOLVED THIS QUESTION ON YOUR WON WITHIN 15 MINUTES
package BinarySearchTreesPART02;
import java.util.ArrayList;
public class BSTtoBalancedBST {
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
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //extracting from old tree
    public static void inorder(Node root , ArrayList<Integer> mylist){
        if(root == null){
            return;
        }
        inorder(root.left , mylist);
        mylist.add(root.data);
        inorder(root.right , mylist);
    }
    //printing the new Tree
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node createBalanceedBST(ArrayList<Integer> mylist , int start , int end){
        //base condiiton
        //this is the new base condition which i missed. so i came back and corrected it
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(mylist.get(mid));
        /*if(start == end){ this is the base condition i wrote earlier which was wrong
            return root;
        }*/
        Node lefthalf  = createBalanceedBST(mylist, start, mid - 1);
        Node rigthhalf = createBalanceedBST(mylist, mid + 1, end);
        root.left = lefthalf;
        root.right = rigthhalf;
        return root;
    }
    public static void main(String[] args) {
        //old tree
        Node root = new Node( 8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        ArrayList<Integer> mylist = new ArrayList<>();//sorted list
        inorder(root, mylist);
        Node newroot = createBalanceedBST(mylist, 0, mylist.size() - 1);
        inorder(newroot);
    }
}