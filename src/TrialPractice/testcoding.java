// FIX I WROTE THIS WHOLE PROGRAM USING GITBASH
package TrialPractice;
class testcoding{
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static Node buildingBST(Node root , int value){
		if(root == null){
			root = new Node(value);
			return root;
		}
		if(root.data > value){
			root.left = buildingBST(root.left , value);
		} else {
			root.right = buildingBST(root.right , value);
		}
		return root;
	}
	public static void inorder(Node root){
		if(root == null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void main(String [] args){
		int[] arr = {14 , 34 , 99 , 0 , 1 , 34 , 19 , 21 , 666 , 54 , 41 , 38};
		Node root = null;
		for(int i = 0 ; i < arr.length ; i++){
			root = buildingBST(root , arr[i]);
		}
		System.out.println("Hello World");
		inorder(root);
	}
}
