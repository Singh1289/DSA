package day_6_Tree;

public class BinaryTree {
	private BTNode root;

	public BinaryTree() {
		root = null;
	}
	
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
	public void insert_levelwise(int d) {
		BTNode new_node = new BTNode(d);
		if(root==null) {
			root=new_node;
			return;
		}
		BTNode iter = root;
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		
		while(!q.isEmpty()) {
			iter= q.deQueue();
			if(iter.getLeft()==null) {
				iter.setLeft(new_node);
				return;
			}else {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()==null) {
				iter.setRight(new_node);
				return;
			}else {
				q.enQueue(iter.getRight());
			}
		}
	}
	
	public void treeTravsal() {
		
		if(root==null) {
			System.out.println("Empty..!!!");
			return;
		}
		BTNode iter = root;
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		
		while(!q.isEmpty()) {
			iter= q.deQueue();
			System.out.print(iter.getData()+" ");
			if(iter.getLeft()!=null) {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.enQueue(iter.getRight());
			}
		}
	}

	
}
