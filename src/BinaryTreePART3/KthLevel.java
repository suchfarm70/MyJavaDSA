package BinaryTreePART3;
/*This question can be solved using Level Order Traversal
 * and Recursion This Program consists of Recursion method*/
public class KthLevel {
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
    /*In this program we are using Pre-Order Traversal
     * if the level is what we want so we print the value*/
    static void Kthtraversal(Node root , int kth  , int level){
        if(root == null){
            return;
        }
        if(level == kth){
            System.out.print(root.data+", ");
            return;
        }

        Kthtraversal(root.leftNode, kth, level + 1);
        Kthtraversal(root.rightNode, kth, level + 1);
    }
    public static void main(String [] args){
        //          1
        //         / \
        //        2   3
        //       / \ / \
        //      4  5 6  7
        Node root  = new Node(1);
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);
        root.rightNode.leftNode = new Node(6);
        root.rightNode.rightNode = new Node(7);

        Kthtraversal(root, 1, 0);
    }
}
