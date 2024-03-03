package com.gl.driver;

import com.gl.bst.BST;
import com.gl.bst.Node;

public class App {

	public static void main(String[] args) {
		
		Node node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.left.left.right = new Node(20);
		node.right.left = new Node(55);
		
		
		BST bst = new BST(node);
		bst.rightSkewedTree();
		
	}

}
