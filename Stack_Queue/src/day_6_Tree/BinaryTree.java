package day_6_Tree;

import java.util.Queue;
import java.util.Scanner;

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
	public void insert_many(int d) {
		int data;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= d; i++) {
			System.out.print("Enter value :");
			data = s.nextInt();
			this.insert_levelwise(data);
		}
		return;
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
		System.out.print("Nodes : ");
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

	public void countOfDifferentNodes() {
		if(root==null) {
			System.out.println("Empty..!!!");
			return;
		}
		BTNode iter = root;
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		int leaf=0, parent=0;
		while(!q.isEmpty()) {
			iter= q.deQueue();
			if((iter.getLeft()==null) && (iter.getRight()==null)) leaf++; else parent++;
			if(iter.getLeft()!=null) {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.enQueue(iter.getRight());
			}
		}
		System.out.println("Total nodes in tree : "+(parent+leaf));
		System.out.println("Total parent nodes : "+parent);
		System.out.println("Total leaf nodes : "+leaf);
		
	}

	public void sumOfDifferentNodes() {
		if(root==null) {
			System.out.println("Empty..!!!");
			return;
		}
		BTNode iter = root;
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		int leafSum=0, parentSum=0;
		while(!q.isEmpty()) {
			iter= q.deQueue();
			if((iter.getLeft()==null) && (iter.getRight()==null)) leafSum+=iter.getData(); else parentSum+=iter.getData();
			if(iter.getLeft()!=null) {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.enQueue(iter.getRight());
			}
		}
		System.out.println("Sum of all nodes in tree : "+(parentSum+leafSum));
		System.out.println("Sum of all parent nodes : "+parentSum );
		System.out.println("Sum of all leaf nodes : "+leafSum);
		
	}

	public void averageOfDifferentNodes() {
		if(root==null) {
			System.out.println("Empty..!!!");
			return;
		}
		BTNode iter = root;
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		int leafSum=0, parentSum=0,leaf=0, parent=0;
		while(!q.isEmpty()) {
			iter= q.deQueue();
			if((iter.getLeft()==null) && (iter.getRight()==null)) { 
				leafSum+=iter.getData();
				leaf++;
				} else { 
					parentSum+=iter.getData();
					parent++;
				};
			if(iter.getLeft()!=null) {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.enQueue(iter.getRight());
			}
		}
		System.out.println("Avg of all nodes in tree : "+(parentSum+leafSum)/(parent+leaf));
		System.out.println("Avg of all parent nodes : "+(parentSum/parent));
		System.out.println("Avg of all leaf nodes : "+(leafSum/leaf));
		
	}
	
	public int max_node() {
		int max=-999;
		BTNode iter = root;
		if(root ==null)
			return max;
		
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		
		while(!q.isEmpty())
		{
			iter=q.deQueue();
			if(iter.getData()>max)
				max=iter.getData();
			if(iter.getLeft()!=null) {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.enQueue(iter.getRight());
			}
		}

		return max;
	}
	
	public int min_node() {
		int min=Integer.MAX_VALUE;
		BTNode iter = root;
		if(root ==null)
			return min;
		
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		
		while(!q.isEmpty())
		{
			iter=q.deQueue();
			if(iter.getData()<min)
				min=iter.getData();
			if(iter.getLeft()!=null) {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.enQueue(iter.getRight());
			}
		}

		return min;
	}

	public void display_leafNode() {
		if(root==null) {
			System.out.println("Empty..!!!");
			return;
		}
		BTNode iter = root;
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		System.out.println("Leaf Node ");
		while(!q.isEmpty()) {
			iter= q.deQueue();
			if((iter.getLeft()==null) && (iter.getRight()==null))
				System.out.print(" -> "+iter.getData());
			
			
			if(iter.getLeft()!=null) {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.enQueue(iter.getRight());
			}
		}
		System.out.println();
		
	}

	public void display_nonLeafNode() {
		if(root==null) {
			System.out.println("Empty..!!!");
			return;
		}
		BTNode iter = root;
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		System.out.println("Non-Leaf Node ");
		while(!q.isEmpty()) {
			iter= q.deQueue();
			if((iter.getLeft()!=null) || (iter.getRight()!=null))
				System.out.print(" -> "+iter.getData());
			
			
			if(iter.getLeft()!=null) {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.enQueue(iter.getRight());
			}
		}
		System.out.println();
		
	}
	
	public int level_cout() {
		int count= -1;
		if(root==null) return count;
		BTNode iter = root;
		BTNode dummy = new BTNode(-999);
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		q.enQueue(dummy);
		
		while(!q.isEmpty()) {
			iter= q.deQueue();
			if(iter.getData()==-999)
			{
				count++;
				q.enQueue(dummy);
				iter= q.deQueue();
			}
			
			if(iter.getLeft()!=null) {
				q.enQueue(iter.getLeft());
			}
			if(iter.getRight()!=null) {
				q.enQueue(iter.getRight());
			}
		}
		return count;
	}
	
	private void swapNodes(BTNode n1) {
		BTNode temp= n1.getLeft();
		n1.setLeft(n1.getRight());
		n1.setRight(temp);
		
	}
	public void mirror() {
		if(root==null) {
			System.out.println("Tree is Empty..!!");
			return;
		}
		
		BTNode iter=root;
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		while(!q.isEmpty()) {
			iter=q.deQueue();
			swapNodes(iter);
			
			if(iter.getLeft()!=null) q.enQueue(iter.getLeft());
			if(iter.getRight()!=null)q.enQueue(iter.getRight());
		}
	}
	public BinaryTree createMirrorImage(){
		BinaryTree new_tree= new BinaryTree();
		if(root==null) return new_tree;
		
		BTNode iter=root;
		BTQueueLL q = new BTQueueLL();
		q.enQueue(iter);
		while(!q.isEmpty()) {
			iter=q.deQueue();
			new_tree.insert_levelwise(iter.getData());
			
			if(iter.getRight()!=null)q.enQueue(iter.getRight());
			if(iter.getLeft()!=null) q.enQueue(iter.getLeft());
			
		}
		return new_tree;
	}
	
	public static boolean isIdentical(BinaryTree t1,BinaryTree t2) {
		BTNode iter1= t1.getRoot();
		BTNode iter2= t2.getRoot();
		if(iter1==null && iter2 ==null) return true;
		BTQueueLL q1 = new BTQueueLL();
		BTQueueLL q2 = new BTQueueLL();
		q1.enQueue(iter1);
		q2.enQueue(iter2);
		
		while((!q1.isEmpty()) && (!q2.isEmpty())) {
			iter1 = q1.deQueue();
			iter2 = q2.deQueue();
			if(iter1.getData()!= iter2.getData()) return false;
			if(iter1.getLeft()!=null) {
				q1.enQueue(iter1.getLeft());
			}
			if(iter1.getRight()!=null) {
				q1.enQueue(iter1.getRight());
			}
			if(iter2.getLeft()!=null) {
				q2.enQueue(iter2.getLeft());
			}
			if(iter2.getRight()!=null) {
				q2.enQueue(iter2.getRight());
			}
		}
		return ((!q1.isEmpty()) && (!q2.isEmpty()))? true: false;
	}
	
	
}
