package com.bstproblem;

public class Main {
	public static void main(String[] args) {
		BST bst = new BST();
		System.out.println("The BST Created with input data:");
		bst.insert(56);
		bst.insert(30);
		bst.insert(70);
		System.out.println("The inorder traversal of the given binary tree is - \n");
		System.out.print("Inorder traversal: ");
		bst.inorder();
	}

}
