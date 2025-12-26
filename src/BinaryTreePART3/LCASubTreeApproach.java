package BinaryTreePART3;
public class LCASubTreeApproach {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;
        Node(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }
    //O(n) Time Complexity 
    //This code has better Space Complexity Compared to the previous one
    static Node lca(Node root , int n1 , int n2){

        if(root == null){
            return null;
        }

        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = lca(root.leftNode, n1, n2);
        Node rightLCA = lca(root.rightNode, n1, n2);

        if(rightLCA == null){
            return leftLCA;
        }
        if(leftLCA == null){
            return rightLCA;
        }
        return root;
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
        int n1 = 6; int n2 = 3;
        System.out.println((LCASubTreeApproach.lca(root, n1, n2)).data);
    }
}