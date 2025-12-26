package BinarySearchTreesPART01;
public class DeleteNodeBST {
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

    static Node insertNode(Node root , int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if (root.data > value ) {
            root.leftNode = insertNode(root.leftNode, value);
        } else {
            root.rightNode = insertNode(root.rightNode, value);
        }

        return root;
    }

    /*in Terms of Deletion there are 3 cases
     *
     * 1st Case
     * NO Child (Leaf Node)
     * just return Null to the parent
     * 
     * 2nd Case
     * One Child
     * Delete Node and replace with Chi ld Node
     * 
     * 3rd Case
     * Two Children
     * Calculate the Inorder Successor
     * Delete the Node for Inorder Successor
     * 
     * which is "Left Most Node on the Right SubTree"
     * it may or may not have a Right Child 
     * it will always be a Leaf Node
     */

    public static Node Delete(Node root , int val){
        if(root.data < val){
            root.rightNode = Delete(root.rightNode, val);
        }
        else if (root.data > val) {
            root.leftNode = Delete(root.leftNode, val);
        }
        else {

            //case 1 : Leaf Node
            if (root.leftNode == null && root.rightNode == null) {
                return null;
            }

            //case 2 : Single Child
            if(root.leftNode == null){//rightNode is NOT NULL
                return root.rightNode;
            }
            else if (root.rightNode == null) {
                return root.leftNode;
            }


            //case 3 : Inorder Successor
            Node IS = findInorderSuccessor(root.rightNode);
            root.data = IS.data;
            root.rightNode = Delete(root.rightNode , IS.data);
        }

        return root;
    }

    //helper Function finds the left Most Node on the Right Subtree
    public static Node findInorderSuccessor(Node root){
        while (root.leftNode != null) {
            root = root.leftNode;
        }

        return root;
    }

    static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.leftNode);
        System.out.print(root.data+" ");
        inorder(root.rightNode);
    }
    public static void main(String[] args) {
        Node root = null;
        for (int i = 1; i <= 10; i++) {
            root = insertNode(root, i);
        }
        inorder(root);
        System.out.println();

        //root = Delete(root , 7);
        Delete(root , 7);

        inorder(root);
    }
}