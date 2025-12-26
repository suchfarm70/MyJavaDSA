/*This is the Second Method to Check for a Valid BST
 * Check Maximum value in the leftSubtree < Node
 * Check Minimum value in the rightSubtree > Node
 * 
 * 
 * in the program we will be checking
 *  left Subtree -> min = INTEGER_MINIMUM or NULL
 *                  max = root/parent
 * 
 * right Subtree -> min = root/parent
 *                  max = INTEGER_MAXIMUM or NULL
 */


package BinarySearchTreesPART01;
public class ValidateBSTApnaCollege {
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

    public static boolean isValidBST(Node root , Node min , Node max){
        if (root == null) {
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        } else if (max != null && root.data > max.data) {
            return false;
        }

    /* *    in the program we will be checking
    *  left Subtree -> min = INTEGER_MINIMUM or NULL
    *                  max = root/parent
    * 
    * right Subtree -> min = root/parent
    *                  max = INTEGER_MAXIMUM or NULL
    */
        return isValidBST(root.leftNode, min, root) && isValidBST(root.rightNode, root, max);
    }

    public static void INorderTraversal(Node root){
        if(root == null){
            return;
        }

        INorderTraversal(root.leftNode);
        System.out.print(root.data+" ");
        INorderTraversal(root.rightNode);
    }
    public static void main(String[] args) {
        Node root = null;
        //int[] arr = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        //int[] arr = {1 , 1 , 1};
        //for (int i = 0; i < arr.length; i++) {
            //root = mybst(root, arr[i]);
        //}
        //INorderTraversal(root);

        root = new Node(10);
        root.leftNode = new Node(11);
        root.rightNode = new Node(9);
        root.leftNode.leftNode = new Node(7);
        root.leftNode.rightNode = new Node(15);
        /*
         *          10
         *         /  \
         *        11   9
         *       /  \
         *      7    15
         * 
         * checking if the above BST is Valid or Not (False)
         */
        System.out.println(isValidBST(root, null, null));
    }
}
