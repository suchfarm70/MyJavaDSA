//The idea is instead of Calling a Separate function for calculating the height
//We will do that in the same funciton itself
// and instead of returning a integer value we will return a class called Information
//containing the info regarding height and diameter at each Node
package BinaryTreePART1;
//Time COmplexity this case is O(n) NOICE!!!
public class DiameterofTreeOptimized {
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

    static class Information{
        int height;
        int diameter;

        Information(int height , int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static Information diametercalculation(Node root){
        if(root == null){
            return new Information(0, 0);
        }

        Information leftInformation = diametercalculation(root.leftNode);
        Information righInformation = diametercalculation(root.rightNode);

        int selfheight = Math.max(leftInformation.height, righInformation.height) + 1;
        int selfdia = leftInformation.height + righInformation.height + 1;

        Information selfinfInformation = new Information(selfheight, selfdia);
        return selfinfInformation;
    }
    public static void main(String[] args) {
        //          1
        //         / \
        //        2   3
        //       / \ / \
        //      4  5 6  7 
        //               \
        //                8
        Node root  = new Node(1);
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);
        root.rightNode.leftNode = new Node(6);
        root.rightNode.rightNode = new Node(7);
        root.rightNode.rightNode.rightNode = new Node(8);
        //Information finalinfo = diametercalculation(root);
        //System.out.println(finalinfo.diameter);
        System.out.println(diametercalculation(root).diameter);
        System.out.println(diametercalculation(root).height);
    }
}