package BinarySearchTreesPART01;
public class SearchinsideBST {
    static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    //This function Creates a Binary Tree after providing the Root Node
    public static Node insert(Node root , int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data > value){
            //insert in left subtree
            root.leftNode = insert(root.leftNode , value);
        } else {
            //insert in right node
            root.rightNode = insert(root.rightNode , value);
        }

        return root;
    }

    //this function searches for a given value in the Tree
    //time Compexity O(Height of Tree) for skewed Tree
    //time Complexity O(logn) for balanced Tree
    public static void Searcher(Node root , int value){
        if(root == null){
            System.out.println(value+" Value is Not in the Tree");
            return;
        }
        if (root.data == value) {
            System.out.println("Found Value "+ root.data);
        } else if (root.data < value) {
            Searcher(root.rightNode, value);
        } else {
            Searcher(root.leftNode, value);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        Node root = null;

        for (int j : arr) {
            root = insert(root, j);
        }

        Searcher(root, 11);
        Searcher(root, 7);
    }
}
