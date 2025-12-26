package BinaryTreePART1;
public class BuildPreorderTree {

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
    static class makeBinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        
    }

    @SuppressWarnings("static-access")
    public static void main(String [] args){
        // -1 represents a null node
        int nodes[] = {1 ,2 , 4 ,-1 , -1 , 5 , -1 , -1 , 3 , -1, 6 , -1 , -1};
        makeBinaryTree tree = new makeBinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
