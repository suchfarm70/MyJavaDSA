
//This Commented Out program was my first attempt to solve this question with help of stack
//Which Turns out to be the DFS approach to traverse a Graph
/*package BinarySearchTreesPART01;
import java.util.*;
public class RoottoLeaf {
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

        public static Node insert(Node root , int value){
            if (root == null) {
                root = new Node(value);
            }

            if (root.data > value) {
                root.leftNode = insert(root.leftNode, value);
            } else {
                root.rightNode = insert(root.rightNode, value);
            }

            return root;
        }

        Stack<Node> myStack = new Stack<>();
        public void rootleaf(Node root){
            if(root == null){
                System.out.println(myStack);
                myStack.pop();
                return;
            }

            rootleaf(root.leftNode);
            myStack.push(root);
            rootleaf(root.rightNode);
        }

    public static void main(String [] args){
        Node root = null;
        int[] arr = {3 , 5 , 6 , 8 , 10 , 11 , 14};

        for (int i = 0; i < arr.length; i++) {
            root = insert(root , arr[i]);
        }
    }
}*/

package BinarySearchTreesPART01;
import java.util.*;

public class RoottoLeafMyWayDFS {
    public static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    public static Node insert(Node root , int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.leftNode = insert(root.leftNode, value);
        } else {
            root.rightNode = insert(root.rightNode, value);
        }
        return root;
    }

    Stack<Integer> myStack = new Stack<>();

    public void rootleaf(Node root) {
        if (root == null) {
            return;
        }

        // Push current node into stack (add to path)
        myStack.push(root.data);

        // If leaf node, print the path
        if (root.leftNode == null && root.rightNode == null) {
            System.out.println(myStack);
        } else {
            // Recurse left and right
            rootleaf(root.leftNode);
            rootleaf(root.rightNode);
        }

        // Backtrack: remove the current node before returning
        myStack.pop();
    }

    public static void main(String [] args) {
        Node root = null;
        //int[] arr = {3 , 5 , 6 , 8 , 10 , 11 , 14};
        int[] arr = {8, 3, 10, 1, 6, 14, 4, 7, 13};

        for (int value : arr) {
            root = insert(root , value);
        }

        RoottoLeafMyWayDFS obj = new RoottoLeafMyWayDFS();
        obj.rootleaf(root);
    }
}
