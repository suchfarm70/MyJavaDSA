// I alreaqy solved this question using the DFS approach using a Stack
//The name  of the file is "RoottoLeafMyWayDFS"
//This Program solves it using ArrayLists
package BinarySearchTreesPART01;
import java.util.ArrayList;
public class RoottoLeafApnaCollege {
    
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

        if (root.data > value) {
            root.leftNode = buildTree(root.leftNode, value);
        } else {
            root.rightNode = buildTree(root.rightNode, value);
        }

        return root;
    }

    public static void printroottoleaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.leftNode == null && root.rightNode == null){
            System.out.println(path);
        }
        printroottoleaf(root.leftNode, path);
        printroottoleaf(root.rightNode, path);
        path.remove(path.size() - 1);
    }
    public static void printerINorder(Node root){
        if(root == null){
            return;
        }

        printerINorder(root.leftNode);
        System.out.print(root.data+" ");
        printerINorder(root.rightNode);
    }

    public static void main(String[] args) {
        Node root = null;
        //int[] arr = {8 , 5 , 3 , 1 , 4 , 6 , 10 , 11 , 14};
        int[] arr = {8 , 5 , 3 , 6 , 10 , 11 , 14};
        for (int i = 0; i < arr.length; i++) {
            root = buildTree(root, arr[i]);
        }
        /*for (int i = 0; i < 15; i++) {
            root = buildTree(root , i);
        }*/
        printerINorder(root);
        System.out.println();
        ArrayList<Integer> mylist = new ArrayList<>();
        printroottoleaf(root, mylist);
    }
}