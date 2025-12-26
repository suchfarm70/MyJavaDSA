package BinarySearchTreesPART02;
public class SizeofLargestBSTinBT {
    public static class  Node {
        int data;
        Node left;
        Node right;
        public  Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(Boolean isBST , int size , int min , int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;
    public static Node maxBSTNode = null;
    public static Info largestBST(Node root){
        //base case
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data , Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max)); 
        //checking for valid BST
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }
        //checking if the left and right trees are valid only then i myself can be a valid BST
        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            maxBSTNode = root;
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        //Info info = largestBST(root);
        largestBST(root);
        System.out.println("Largest BST in BT = "+ maxBST);
        inorder(maxBSTNode);   
    }
}