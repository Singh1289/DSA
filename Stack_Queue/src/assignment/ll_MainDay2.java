package assignment;

public class ll_MainDay2 {
	public static void main(String[] args) {
		Int_linkedlist ll = new Int_linkedlist();
		ll.insert_last(12);
		ll.insert_last(22);
		ll.insert_last(2);
		ll.insert_last(35);
		ll.insert_last(10);
		ll.insert_last(7);
		ll.insert_last(49);
		ll.insert_last(44);
		ll.insert_last(70);
		
		System.out.println("~~~ Before ~~~");
		System.out.println(ll);
		System.out.println("~~~~~~~~~~~~~");
	//	Int_linkedlist.bubbleSort(ll);
	//	Int_linkedlist.insertionSort(ll);
		Int_linkedlist.selectionSort(ll);
		System.out.println("~~~ After ~~~");
		System.out.println(ll);
		
	}

	
}
