package TrialPractice;
public class BSTAscendingDescending {
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

    public static Node mybst(Node root , int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.leftNode = mybst(root.leftNode, value);
        } else {
            root.rightNode = mybst(root.rightNode, value);
        }
        return root;
    }
    
    public static void IN_orderTraversal(Node root){
        if(root == null){
            return;
        }

        IN_orderTraversal(root.leftNode);
        System.out.print(root.data+" ");
        IN_orderTraversal(root.rightNode);
    }


    public static void DE_INorderTraversal(Node root){
        if(root == null){
            return;
        }

        DE_INorderTraversal(root.rightNode);
        System.out.print(root.data+" ");
        DE_INorderTraversal(root.leftNode);
    }
    public static void main(String[] args) {
        Node root = null;
        int[] arr = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        
        for (int i = 0; i < arr.length; i++) {
            root = mybst(root, arr[i]);
        }
        IN_orderTraversal(root);
        System.out.println();
        DE_INorderTraversal(root);
    }
}

