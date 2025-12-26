
// O(n) Time Complexity
package BinaryTreePART1;
public class HeightofTreeNodes {

    static class Node{
        int data;
        Node leftnode;
        Node rightnode;

        Node(int data){
            this.data = data;
            this.leftnode = null;
            this.rightnode = null;
        }
    }

    static class makeBinaryTree{
        static int idx = -1;

        static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftnode = buildtree(nodes);
            newNode.rightnode = buildtree(nodes);

            return newNode;
        }

        static int heightcalculate(Node root){
            if(root == null){
                return 0;
            }

            int left = heightcalculate(root.leftnode);
            int right = heightcalculate(root.rightnode);

            int height = Math.max(left, right);

            return height + 1;
        }
    }
    //we calculate the longest distance between root and the leaf node
    public static void main(String [] args){
        
        int nodes[] = {1 ,2 , 4 ,-1 , -1 , 5 , -1 , -1 , 3 , -1, 6 , -1 , -1};
        Node root = makeBinaryTree.buildtree(nodes);
        int h = makeBinaryTree.heightcalculate(root);
        System.out.println("Height of Tree in terms of Nodes = "+ h);
        System.out.println("Heiht in Tree in terms of Edges = "+ (h - 1));
    }
}
// this given code is a non static version of the code above
/*
 * package BinaryTree;

public class HeightofTreeNodes {

    static class Node {
        int data;
        Node leftnode;
        Node rightnode;

        Node(int data) {
            this.data = data;
            this.leftnode = null;
            this.rightnode = null;
        }
    }

    static class makeBinaryTree {
        int idx = -1;  // now an instance variable, not static

        // non-static method
        Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftnode = buildtree(nodes);   // recursive call
            newNode.rightnode = buildtree(nodes);  // recursive call

            return newNode;
        }

        // non-static method
        int heightcalculate(Node root) {
            if (root == null) {
                return 0;
            }

            int left = heightcalculate(root.leftnode);
            int right = heightcalculate(root.rightnode);

            int height = Math.max(left, right);
            return height + 1;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // now we need to create an object
        makeBinaryTree tree = new makeBinaryTree();

        Node root = tree.buildtree(nodes);
        int h = tree.heightcalculate(root);

        System.out.println("Height of Tree in terms of Nodes = " + h);
    }
}

 * 
 * 
 */
