/* The thought proccess for solving this question is the following
 * We take the sorted Array find the MID point
 * break it into 2 parts the MID becomes the Root
 * So now we are left with the Left Half and Rigth Half
 * 
 * Now all we do is repeat this proccess for the Left Half and the Right Half
 * till we reach a state where Left and Right are pointing to the same value
 * 
 * 
 * TIME COMPLEXITY IS O(N)
 * because we are touching each Node only ones
 * 
 * 
 */

package BinarySearchTreesPART02;
import java.util.*;
public class SortedArrayBalancedBST {
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

    public static Node createBST(int [] arr , int start , int end){
        int mid = (start + end) / 2 ;
        Node root_Node = new Node(arr[mid]);

        if(start == end){
            return root_Node;
        }

        

        Node left_half = createBST(arr, start, mid - 1);//call for the left Half
        Node right_half = createBST(arr, mid + 1, end);//call for the right Half

        root_Node.leftNode = left_half;
        root_Node.rightNode = right_half;


        return root_Node;
    }


    //The Inoder Traversal proves if the tree has been made corectly
    public static void IN_Order_Traversal(Node root_Node){
        if(root_Node == null){
            return;
        }

        IN_Order_Traversal(root_Node.leftNode);
        System.out.print(root_Node.data+" ");
        IN_Order_Traversal(root_Node.rightNode);
    }

    public static void PRE_Order_Traversal(Node root_Node){
        if(root_Node == null){
            return;
        }

        System.out.print(root_Node.data+" ");
        PRE_Order_Traversal(root_Node.leftNode);
        PRE_Order_Traversal(root_Node.rightNode);
    }

    //Level Order Traversal for piece of MIND
    // TODO NO NEED TO WRITE THE LEVEL ORDER FUNCTION
    static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+"\t");
                if(currNode.leftNode != null){
                    q.add(currNode.leftNode);
                }
                if(currNode.rightNode != null){
                    q.add(currNode.rightNode);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root_Node = null;
        int[] arr = {3 , 5 , 6 , 8 , 10 , 11 , 12};
        /*
         *          8
         *        /   \
         *       5     11
         *      / \    / \
         *     3   6  10  12
         * 
         */
        root_Node = createBST(arr, 0, arr.length - 1);
        PRE_Order_Traversal(root_Node);
        System.out.println();
        IN_Order_Traversal(root_Node);
        System.out.println();
        levelorder(root_Node);
    }
}
