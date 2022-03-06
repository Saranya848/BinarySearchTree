package com.bstproblem;

class BST {
	/**
	 * insert - insert a node in BST and it calls insert_recursive method
	 * insert_Recursive - used to call insert method recursively to insert a node into a particular position
	 * inorder - method to call inOrder traversal of BST
	 * inorderRec - recursively checking the inOrder traversal of tree
	 * minValu - method to call minimum value to left of parentnode
	 */

	/**
	 * Creating node call
	 * 
	 * @author king
	 *
	 */
	class Node {
		int data;
		Node left, right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	/**
	 * PROCEDURE
	 * Method for insert a node in BST
	 * calls insert_recursive method
	 * 
	 * 
	 */
	Node root;

	BST() {
		root = null;
	}

	/**
	 * Method for insert a node in BST
	 * 
	 * @param data - input data for the node
	 */
	void insert(int data) {
		root = insertdata(root, data);
	}

	/**
	 * calls insert_recursive method
	 * 
	 * @param root - root node to insert next nodes
	 * @param data - input data for the node
	 * @return updated root
	 */
	// Insert data in the tree
	Node insertdata(Node root, int data) {
		// Return a new node if the tree is empty
		if (root == null) {
			root = new Node(data);
			return root;
		}

		// Traverse to the right place and insert the node
		if (data < root.data) 
			root.left = insertdata(root.left, data);//data if min moves to left of root(parent)
		else if (data > root.data)
			root.right = insertdata(root.right, data);//data if min moves to right of root(parent) 

		return root;
	}
	
/**
 * method to call inOrder traversal of BST
 */
	void inorder() {
		inorderRec(root);
	}
	
/**
 * recursively checking the inOrder traversal of tree
 * @param root - root node to insert next nodes
 */
	// Inorder Traversal
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " -> ");
			inorderRec(root.right);
		}
	}
	
/**
 * Method for checking minimum value
 * @param root
 * @return
 */
	// Find the inorder successor
	int minValue(Node root) {
		int minv = root.data;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
}
