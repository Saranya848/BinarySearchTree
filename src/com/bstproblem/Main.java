package com.bstproblem;

public class Main {
	public static void main(String[] args) {
		BST bst = new BST();
		System.out.println("The BST Created with input data:");
		bst.insert(56);
		bst.insert(30);
		bst.insert(70);
		bst.insert(3);
		bst.insert(11);
		bst.insert(22);
		bst.insert(16);
		bst.insert(40);
		bst.insert(60);
		bst.insert(65);
		bst.insert(63);
		bst.insert(67);
		bst.insert(95);
		System.out.println("The inorder traversal of the given binary tree is - \n");
		System.out.print("Inorder traversal: ");
		bst.inorder();
		boolean val = bst.search(65);
		if(val==true) {
			System.out.println("\nKey found in BST:" + val);
		}
		else System.out.println("\nKey not found in BST:" + val);
	}

}
