package BinaryTreePART2;
/*  We not only focus on the conditions which show that a
    given tree is a subtree of an another Tree
 *  We also focus on the Conditions where we see that it is not
 */
public class SubtreeOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //There are a lot of conditions or situations for returning True
    //But the moment we encounter a situation where things are not matching
    // we return false
    public static boolean isIdentical(Node node , Node subroot){
        if(node == null  && subroot == null){
            return true;
        } else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }

        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if (!isIdentical(node.right, subroot.right)) {
            return false;
        }
        return true;
    }


    public static boolean isSubtree(Node root , Node subroot){

        //if I reach a leaf Node or my root is empty
        if(root == null){
            return false;
        }
        // First step is to find the matching root points
        if(root.data == subroot.data){
            if(isIdentical(root , subroot)){
                return true;
            }
        }
        /* 
        boolean leftresult = isSubtree(root.left, subroot);
        boolean rightresult = isSubtree(root.right, subroot);
        return leftresult || rightresult;
        */
       
        //This return statment is more Optimized
        //if we find the True on the left subtree then we will directly return from therer
        // we will never execute the right half of the statement
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {

        //          1
        //         / \
        //        2   3
        //       / \ / \
        //      4  5 6  7
        Node root  = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //      2
        //     / \
        //    4   5
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(SubtreeOfTree.isSubtree(root, subroot));
    }
}
