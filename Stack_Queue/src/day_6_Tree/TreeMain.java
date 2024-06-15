package day_6_Tree;

public class TreeMain {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.setRoot(bt.createNode(10));
		bt.getRoot().setLeft(bt.createNode(20));
		bt.getRoot().getLeft().setLeft(bt.createNode(30));
		bt.getRoot().setRight(bt.createNode(40));
		bt.getRoot().getRight().setLeft(bt.createNode(50));
		bt.getRoot().getRight().setRight(bt.createNode(60));
		
		System.out.println("\nPrinting Pre-order");
		bt.preOrder();
		
		System.out.println("\nPrinting In-order");
		bt.inOrder();
		
		System.out.println("\nPrinting Post-order");
		bt.postOrder();
	}
}
