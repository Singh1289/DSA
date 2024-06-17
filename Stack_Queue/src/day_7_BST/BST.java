package day_7_BST;

import java.util.Scanner;

import day_6_Tree.BTNode;

public class BST {
	private BTNode root;
	
	public BST() {root=null;}

	public void insertMany(int d) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=d;i++) {
			System.out.print("Enter value : ");
			int data = sc.nextInt();
			this.insert(data);
		}
	}

	public void insert(int data) {
		
		BTNode new_node= new BTNode(data);
		if(root==null) {
			root=new_node;
			return;
		}
		BTNode parent,iter;
		parent=iter=root;
		
		while(iter!=null) {
			parent= iter;
			if(data<iter.getData())iter=iter.getLeft();
				else if(data>iter.getData())iter=iter.getRight();
					else {
						System.out.println("Duplicate Value");
						return;
						
					}
	
		}
		if(data>parent.getData())
				parent.setRight(new_node);
		else
			parent.setLeft(new_node);
			
	}
	
	public void displayInOrder() {
		System.out.print("Nodes ");
		Inorder(root);	
		System.out.println();
	}

	private void Inorder(BTNode iter) {
		if(iter==null)return;
		
		Inorder(iter.getLeft());
		System.out.print("->"+iter.getData());
		Inorder(iter.getRight());
	}
	
	public BTNode search(int d) {
		// non recursive search
		if(root == null) return null;
		BTNode iter = root;
		while(iter!= null) {
			if(iter.getData()==d) return iter;
			
			iter=(d<iter.getData())?iter.getLeft():iter.getRight();
		}
		//System.out.println("Not Found");
		return null;
	}
}
