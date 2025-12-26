// Diameter of Tree in terms of Binary Tree is the longest path between two leaf nodes
package BinaryTreePART1;
public class DiameterofTree {
    static class Node{
        int data;
        Node leftNode;
        Node righNode;

        Node(int data){
            this.data = data;
            this.leftNode = null;
            this.righNode = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.leftNode);
        int rh = height(root.righNode);

        int h = Math.max(lh, rh) + 1;
        return h;
    }
    //This is Solution is Calculated Recursively O(n) TIme complexity
    //beacause i am going to all the N nodes and on all the N nodes i am finding the height of eahc and every Node
    //base if root == null return 0
    //ldiam = diameter(root.left)
    //rdiam = diameter(root.right)
    //lh = height(root.left)
    //rh = height(root.right)
    //selfdia = lh + rh + 1
    //return max(ldiam , rdiam , selfdia)
    public static int diameteroftree(Node root){
        //well there are two cases when finding the Diameter of a Tree

        //Case 1 : Path goes through my Root Node

        //Case 2 : Path goes through one of my Subtrees

        //diameter formula Leftree Height + Righttree Height + 1 when passing through root

        //We assume we already have calculated a oath for my left and Right subtree
        //so we compare the both of them to each other and then to the (passing through the root path)
        //the max is my is Diameter of the Tree

        //base case
        if(root == null){
            return 0;
        }

        int ldiam = diameteroftree(root.leftNode);
        int rdiam = diameteroftree(root.righNode);
        int lh = height(root.leftNode);
        int rh = height(root.righNode);
        int selfdia = lh + rh + 1;

        return Math.max(Math.max(ldiam ,rdiam) , selfdia);
    }
    
    public static void main(String[] args) {
        //int nodes[] = {1 ,2 , 4 ,-1 , -1 , 5 , -1 , -1 , 3 , -1, 6 , -1 , -1};
        //makeBinaryTree tree = new makeBinaryTree();
        //Node root = makebinarytree.buildtree(nodes);
        //makebinarytree.levelorder(root);

        //          1
        //         / \
        //        2   3
        //       / \ / \
        //      4  5 6  7 
        Node root  = new Node(1);
        root.leftNode = new Node(2);
        root.righNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.righNode = new Node(5);
        root.righNode.leftNode = new Node(6);
        root.righNode.leftNode = new Node(7);
        System.out.println(diameteroftree(root));
    }
}