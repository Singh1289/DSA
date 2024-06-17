package day_7_BST;

import java.util.Scanner;

import day_6_Tree.BTNode;

public class BST_Recusive {
	private BTNode root;
	
	
	public BTNode getRoot() {
		return root;
	}

	public BST_Recusive() {root=null;}

	public void insertMany(int d) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=d;i++) {
			System.out.print("Enter value : ");
			int data = sc.nextInt();
			this.insert(data);
		}
	}

	public void insert(int data) {
			root=insert_rec(root,data);			
	}
	
	private BTNode insert_rec(BTNode r, int d) {
		if(r==null) r= new BTNode(d);            // termination / base condition		
		  else if(d< r.getData()) r.setLeft(insert_rec(r.getLeft(), d));		
		    else if(d>r.getData()) r.setRight(insert_rec(r.getRight(), d));
		      else System.out.println("Sorry..duplicate value");
		return r;
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
		return search_rec(root,d);		
	}
	
	private BTNode search_rec(BTNode r, int d) {
		BTNode temp = null;
		if(r==null || r.getData()==d)return r;
		
		if(r.getData()>d) temp= search_rec(r.getLeft(),d);
		
		if(r.getData()<d) temp= search_rec(r.getRight(),d);
		
		return temp;
	}
	
	public int findMax_rec() {
		return findMax(root).getData();
	}
	
	private BTNode findMax (BTNode r) {
		BTNode temp = null;
		if(r.getRight()==null)return r;
		
		temp= findMax(r.getRight());
				
		return temp;
	}
	
	public int findMin_rec() {
		return findMin(root).getData();
	}
	
	private BTNode findMin (BTNode r) {
		BTNode temp = null;
		if(r.getLeft()==null)return r;
		
		temp= findMin(r.getLeft());
				
		return temp;
	}
	
	public static int findHeight(BTNode r) {
		int left,right;
		if(r==null)						// termination / base condition
			return 0;
		
		left=findHeight(r.getLeft());
		right=findHeight(r.getRight());
		
		return (left>right)? left+1: right+1;
	}
}
