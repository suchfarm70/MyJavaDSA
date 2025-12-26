//there are two possiblities in this question
// Number 1 the path traverls though the current Node
// if traversl though the current Node it isthe same case as the LCA Problem
// Number 2 the path is in one of my subtrees

package BinaryTreePART3;
public class MinDisBetweenTwoNodes {
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

    public static int lcaDist(Node root , int n){
        if(root == null){
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.leftNode, n);
        int rightDist = lcaDist(root.rightNode, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    public static int minDist(Node root , int n1 , int n2){
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;

    }
    public static void main(String[] args) {
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
        int n1 = 4;
        int n2 = 6;
        System.out.println(MinDisBetweenTwoNodes.minDist(root, n1, n2));
    }
}
