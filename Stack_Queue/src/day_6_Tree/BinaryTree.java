package day_6_Tree;

public class BinaryTree {
	private BTNode root;

	public BinaryTree() {
		root = null;
	}

//	public BinaryTree(int d) {
//		root = new BTNode(d);
//	}
	
	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode r) {
		root = r;
	}
	
	public BTNode createNode(int d) {
		return new BTNode(d);
	}
	public void preOrder() {		//wrapper function
		preOrderTraversal(root);
	}

	public void inOrder() {		//wrapper function
		inOrderTraversal(root);
	}
	public void postOrder() {		//wrapper function
		postOrderTraversal(root);
	}
	private void preOrderTraversal(BTNode rt) {
		if(rt==null)return;
		System.out.print(" -> "+rt.getData());
		//checking left node
		preOrderTraversal(rt.getLeft());
		// checking right node
		preOrderTraversal(rt.getRight());	
		
	}
	private void inOrderTraversal(BTNode rt) {
		if(rt==null)return;		
		//checking left node
		inOrderTraversal(rt.getLeft());
		System.out.print(" -> "+rt.getData());
		// checking right node
		inOrderTraversal(rt.getRight());	
		
	}
	private void postOrderTraversal(BTNode rt) {
		if(rt==null)return;
		
		//checking left node
		postOrderTraversal(rt.getLeft());
		// checking right node
		postOrderTraversal(rt.getRight());
		System.out.print(" -> "+rt.getData());
		
	}
}
