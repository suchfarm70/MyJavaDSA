package BinaryTreePART1;
public class SumOfNodes {

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

        // One way of finding the sum of all the nodes
        /*static int val = 0;
        static void sumofnodes(Node root){
            if(root == null){
                return;
            }

            val = val + root.data;
            sumofnodes(root.leftnode);
            sumofnodes(root.rightnode);
        }*/

        static int sumofnodes(Node root){
            if(root == null){
                return 0;
            }

            int left = sumofnodes(root.leftnode);
            int right = sumofnodes(root.rightnode);

            return root.data + left + right;
        }
    }
    public static void main(String [] args){
        int nodes[] = {1 ,2 , 4 ,-1 , -1 , 5 , -1 , -1 , 3 , -1, 6 , -1 , -1};
        Node root = makeBinaryTree.buildtree(nodes);
        int sum = makeBinaryTree.sumofnodes(root);
        //int sum = makeBinaryTree.val;
        //System.out.println("Sum of Nodes = "+sum);
        System.out.println("Sum of Nodes = "+sum);
    }
}