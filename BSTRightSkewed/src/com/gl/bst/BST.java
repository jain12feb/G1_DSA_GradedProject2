package com.gl.bst;

public class BST {

	private Node start = null;
	private Node previous = null;
	
	public BST() {
	}

	public BST(Node node) {
		convertAscRightSkewedTree(node);
	}

	private void convertAscRightSkewedTree(Node node) {
		if (node == null)
			return;

		convertAscRightSkewedTree(node.left);

		if (start == null) {
			start = node;
			start.left = null;
			previous = start;
		} else {
			previous.right = node;
			previous = node;
			previous.left = null;
		}

		convertAscRightSkewedTree(node.right);
	}

	public void rightSkewedTree() {
		if (start == null)
			return;

		System.out.print(start.data + " -> ");
		
		if(start.right == null)
			System.out.print("NULL");
		
		start = start.right;
		rightSkewedTree();
	}
}
