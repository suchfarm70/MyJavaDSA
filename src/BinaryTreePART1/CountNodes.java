package BinaryTreePART1;
public class CountNodes {

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

    static class makeBinaryTree{
        int idx = -1;

        Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = buildTree(nodes);
            newNode.rightNode = buildTree(nodes);

            return newNode;
        }

        int count = 0;
        int countingNodes(Node root){
            if(root == null){
                return 0;
            }

            count++;
            countingNodes(root.rightNode);
            countingNodes(root.leftNode);
            //countingNodes(root.rightNode);
            return count;
        }
    }

    public static void main(String [] args){
        int nodes[] = {1 ,2 , 4 ,-1 , -1 , 5 , -1 , -1 , 3 , -1, 6 , -1 , -1};
        makeBinaryTree obj = new makeBinaryTree();
        Node root = obj.buildTree(nodes);
        int c = obj.countingNodes(root);
        System.out.println("Nodes in Tree = "+ c);
    }
}
