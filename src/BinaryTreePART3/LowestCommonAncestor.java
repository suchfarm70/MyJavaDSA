package BinaryTreePART3;
import java.util.*;
public class LowestCommonAncestor {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }
    static boolean getpath(Node root , int n , ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundleft = getpath(root.leftNode, n, path);
        boolean foundright = getpath(root.rightNode, n, path);
        if( foundleft || foundright){
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
    static Node lca(Node root , int n1 , int n2){// O(n) Time Complexity
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);
        int i = 0;
        for(; i < path1.size() && i < path2.size() ; i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        return path1.get(i - 1);
    }
    public static void main(String[] args) {
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
        int n1 = 4; int n2 = 5;
        System.out.println((LowestCommonAncestor.lca(root, n1, n2)).data);
    }
}