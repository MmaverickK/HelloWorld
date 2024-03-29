package gfg.practice;

import java.io.*;

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class BinaryTreeHeight {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			Node root = buildTree(s);

			System.out.println(height(root));
			t--;
		}
	}
	
	private static int height(Node node) {
		List<Integer> list = new ArrayList<Integer>();
		findHeight(node, 0, list);
		return list.size();
		
	}

	private static void findHeight(Node node, int level, List<Integer> list) {
		if(node == null) {
			return;
		}
		
		if(level == list.size()) {
			list.add(node.data);
		}
		findHeight(node.left, level+1, list);
		findHeight(node.right, level+1, list);
	}
}// } Driver Code Ends

//User function Template for Java

/*
 * class Node { int data; Node left, right;
 * 
 * Node(int item) { data = item; left = right = null; } }
 */
