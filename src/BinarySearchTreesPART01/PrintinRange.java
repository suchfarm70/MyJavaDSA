package BinarySearchTreesPART01;
public class PrintinRange {
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
        
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data > value){
            root.leftNode = insert(root.leftNode ,value);
        } else {
            root.rightNode = insert(root.rightNode, value);
        }

        return root;
    }



    public static void printinginRange(Node root , int val1 , int val2){
        
        /*  APNA COLLEGE ANSWER
        if(root == null){
            return;
        }
        
        if(root.data >= val1 && root.data <=val2){
            printinginRange(root.leftNode, val1, val2);
            System.out.println(root.data+" ");
            printinginRange(root.rightNode, val1, val2);
        } 
        else if (root.data < val1) {
            printinginRange(root.rightNode, val1, val2);
        } else {
            printinginRange(root.leftNode, val1, val2);
        }
        */
        
        
        // MY SOLUTION TO THE QUESITON
        if(root == null){
            return;
        }

        printinginRange(root.leftNode, val1, val2);
        if(root.data >= val1 && root.data <= val2){
            System.out.println(root.data+" ");
        }
        printinginRange(root.rightNode, val1, val2);

    }

    public static void main(String[] args) {
        Node root = null;
        for (int i = 0; i < 15; i++) {
            root = insert(root, i);
        }
        printinginRange(root, 5, 12);
    }
}