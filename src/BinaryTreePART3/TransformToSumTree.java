package BinaryTreePART3;
public class TransformToSumTree {
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

    public static int transform(Node root){
        if(root == null){
            return 0;
        }

        int leftchild = transform(root.leftNode);
        int rightchild = transform(root.rightNode);

        int data = root.data;
        int newleft = root.leftNode == null ? 0 : root.leftNode.data;
        int newright = root.rightNode == null ? 0 : root.rightNode.data;
        root.data = newleft + leftchild + newright + rightchild;

        return data;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.leftNode);
        preorder(root.rightNode);
    }
    public static void main(String [] args){
        //          1
        //         / \
        //        2   3
        //       / \ / \
        //      4  5 6  7
        Node root  = new Node(1);
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);
        root.rightNode.leftNode = new Node(6);
        root.rightNode.rightNode = new Node(7);
        TransformToSumTree.transform(root);
        preorder(root);
    }
}