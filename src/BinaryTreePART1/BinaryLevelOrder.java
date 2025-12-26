package BinaryTreePART1;
import java.util.*;
public class BinaryLevelOrder {

    static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data){
            this.data = data;
            leftNode = null;
            rightNode = null;
        }
    }

    static class makeBinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = buildTree(nodes);
            newNode.rightNode = buildTree(nodes);

            return newNode;
        }

        static void levelorder(Node root){

            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+"\t");
                    if(currNode.leftNode != null){
                        q.add(currNode.leftNode);
                    }
                    if(currNode.rightNode != null){
                        q.add(currNode.rightNode);
                    }
                }
            }
        }
    }
    public static void main(String [] args){
        int nodes[] = {1 ,2 , 4 ,-1 , -1 , 5 , -1 , -1 , 3 , -1, 6 , -1 , -1};
        //makeBinaryTree tree = new makeBinaryTree();
        Node root = makeBinaryTree.buildTree(nodes);
        makeBinaryTree.levelorder(root);
    }
}
