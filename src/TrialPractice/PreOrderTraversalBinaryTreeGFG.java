package TrialPractice;
class Node{
    int data;
    Node leftNode;
    Node rightNode;

    Node(int data){
        this.data = data;
        this.rightNode = null;
        this.leftNode = null;
    }
}
public class PreOrderTraversalBinaryTreeGFG {

    Node root;
    int idx = -1;
    public Node buildingtree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        //idx++;
        //newNode.leftNode.data = nodes[idx];
        newNode.leftNode = buildingtree(nodes);
        //idx++;
        //newNode.rightNode.data = nodes[idx];
        newNode.rightNode = buildingtree(nodes);

        return newNode;
    }

    public  void traverse(Node root){
        if(root == null){
            return;
        }

        //First Deal with the node
        System.out.print(root.data+" ");

        // Then recursive work on the left sub tree
        traverse(root.leftNode);

        // Then recursive work on the right sub tree
        traverse(root.rightNode);
    }
    public static void main(String [] args){
        int nodes[] = {1 ,2 , 4 ,-1 , -1 , 5 , -1 , -1 , 3 , -1, 6 , -1 , -1};
        PreOrderTraversalBinaryTreeGFG obj = new PreOrderTraversalBinaryTreeGFG();
        Node rootNode = obj.buildingtree(nodes);
        obj.traverse(rootNode);
    }
}
