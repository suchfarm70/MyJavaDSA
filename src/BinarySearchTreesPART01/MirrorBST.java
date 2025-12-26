/*
 * The Time Complexity of this Code is O(n)
 * because we are traversing all the Node only ones
 */
package BinarySearchTreesPART01;
public class MirrorBST {
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

    public static Node buildBST(Node root , int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.leftNode = buildBST(root.leftNode, value);
        } else {
            root.rightNode = buildBST(root.rightNode, value);
        }
        return root;
    }

    public static void IN_order_Traversal(Node root_Node){
        if (root_Node == null) {
            return;
        }

        IN_order_Traversal(root_Node.leftNode);
        System.out.print(root_Node.data+" ");
        IN_order_Traversal(root_Node.rightNode);
    }

    public static void PRE_ORder_Traversal(Node root_Node){
        if(root_Node == null){
            return;
        }

        PRE_ORder_Traversal(root_Node.leftNode);
        PRE_ORder_Traversal(root_Node.rightNode);
        System.out.print(root_Node.data+" ");
    }

    public static Node mirror_BST(Node root_Node){
        if(root_Node == null){
            return null;
        }

        Node left_subtree = mirror_BST(root_Node.leftNode);
        Node right_subtree = mirror_BST(root_Node.rightNode);

        root_Node.leftNode = right_subtree;
        root_Node.rightNode = left_subtree;

        return root_Node;
    }
    public static void main(String[] args) {
        Node root = null;
        int[] arr = {8 , 5 , 3 , 6 , 10 , 11 , 14};
        for (int i = 0; i < arr.length; i++) {
            root = buildBST(root, arr[i]);
        }

        System.out.println("Before mirroring of the Tree");
        IN_order_Traversal(root); // Before mirroring of the Tree
        System.out.println();
        PRE_ORder_Traversal(root); // Before mirroring of the Tree
        System.out.println();
        System.out.println("After mirroring of the Tree");
        root = mirror_BST(root);
        IN_order_Traversal(root); // After mirroring of the Tree
        System.out.println();
        PRE_ORder_Traversal(root); // After mirroring of the Tree
    }
}
