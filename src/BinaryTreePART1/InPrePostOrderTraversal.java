package BinaryTreePART1;
public class InPrePostOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    //this function just builds the tree
    static class makeBinaryTree {
        static int idx = 0;
        public static Node buildTree(int nodes[]){
            //idx++;
            if(nodes[idx] == -1){
                idx++;
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            idx++;
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preordertravel(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" "); 
            preordertravel(root.left);
            preordertravel(root.right);
        }

        public static void inordertravel(Node root){

            if(root == null){
                return;
            }

            inordertravel(root.left);
            System.out.print(root.data+" ");
            inordertravel(root.right);
        }

        public static void postordertraverl(Node root){

            if(root == null){
                return;
            }

            postordertraverl(root.left);
            postordertraverl(root.right);
            System.out.print(root.data+" ");
        }
        
    }
    //@SuppressWarnings("static-access")
    public static void main(String[] args) {
        int nodes[] = {1 ,2 , 4 ,-1 , -1 , 5 , -1 , -1 , 3 , -1, 6 , -1 , -1};
        //makeBinaryTree tree = new makeBinaryTree();
        Node root = makeBinaryTree.buildTree(nodes);
        System.out.println(root.data);

        makeBinaryTree.preordertravel(root);
        System.out.println();
        makeBinaryTree.inordertravel(root);
        System.out.println();
        makeBinaryTree.postordertraverl(root);
    }
}
