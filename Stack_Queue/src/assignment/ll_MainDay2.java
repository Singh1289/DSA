package assignment;

public class ll_MainDay2 {
	public static void main(String[] args) {
		Int_linkedlist ll = new Int_linkedlist();
		Int_linkedlist ll2 = new Int_linkedlist();
		ll.insert_last(1);
		ll.insert_last(2);
		ll.insert_last(3);
		ll.insert_last(4);
		
		ll2.insert_last(3);
		ll2.insert_last(7);
		ll2.insert_last(9);
		ll2.insert_last(4);
		
		
		System.out.println("~~~ Before ~~~");
		System.out.println(ll);
	//  System.out.println("~~~~~~~~~~~~~");
		System.out.println(ll2);

	//	Int_linkedlist.bubbleSort(ll);
	//	Int_linkedlist.insertionSort(ll);
	//	Int_linkedlist.selectionSort(ll);
		System.out.println("~~~ After ~~~");
	//	System.out.println(Int_linkedlist.list_to_digit(ll, ll2));
		ll.bringAlternateToFront();
		System.out.println(ll);
		
	}

	
}
