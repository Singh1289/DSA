package day_7_BST;

import java.util.Scanner;

import day_6_Tree.BTNode;

public class BST_Recusive {
private BTNode root;
	
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
		if(r==null) r= new BTNode(d);
		
		else if(d< r.getData()) r.setLeft(insert_rec(r.getLeft(), d));
		
		else if(d>r.getData()) r.setRight(insert_rec(r.getRight(), d));
		else System.out.println("sorry..duplicate value");
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
	

	private BTNode search_Rec(int d) {
		return root;
		// non recursive search
		
	}
}
