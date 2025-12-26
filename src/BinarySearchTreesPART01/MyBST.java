package BinarySearchTreesPART01;
public class MyBST {
    public static class Node{
        int data;
        Node leftnode;
        Node rightnode;

        Node(int data){
            this.data = data;
            this.leftnode = null;
            this.rightnode = null;
        }
    }
    
    //this function traverses the BST in Inorder fashion
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.leftnode);
        System.out.print(root.data+" ");
        inorder(root.rightnode);
    }

    //This function Creates a Binary Tree after providing the Root Node
    public static Node insert(Node root , int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data > value){
            //insert in left subtree
            root.leftnode = insert(root.leftnode , value);
        } else {
            //insert in right node
            root.rightnode = insert(root.rightnode , value);
        }

        return root;
    }

    //this function searches for a given value in the Tree
    //time Compexity O(Height of Tree) for skewed Tree
    //time Complexity O(logn) for balanced Tree
    public static void Searcher(Node root , int value){
        if(root == null){
            System.out.println("Value is Not in the Tree");
            return;
        }

        if (root.data == value) {
            System.out.println("Found Value "+ root.data);
            return;
        } else if (root.data < value) {
            Searcher(root.rightnode, value);
        } else {
            Searcher(root.leftnode, value);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        Node root = null;

        for (int j : arr) {
            root = insert(root, j);
        }

        inorder(root);
        System.out.println();
        Searcher(root, 11);
        Searcher(root, 7);
        System.out.println("Hello World");
    }
}