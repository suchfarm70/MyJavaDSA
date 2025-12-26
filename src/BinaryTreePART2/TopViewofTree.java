package BinaryTreePART2;
import java.util.*;
public class TopViewofTree {
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
    static class Info {
        //because we are doing level order traversal we need a Queue
        //here is the the thing we need a class Info be need to pass 2 values eahc time
        //they are Node.data and the Horizontal distance 
        Node node;
        int hd;
        Info(Node node , int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topview(Node root){
        //because we are doing level order traversal we need a Queue
        //here is the the thing we need a class Info be need to pass 2 values eahc time
        //they are Node.data and the Horizontal distance
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                 else {
                    q.add(null);
                }
            }
            else {
                if(!map.containsKey(curr.hd)){//hd appears for the first time
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.leftNode != null){
                    q.add(new Info(curr.node.leftNode , curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if(curr.node.rightNode != null){
                    q.add(new Info(curr.node.rightNode , curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
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
        topview(root);
    }
}