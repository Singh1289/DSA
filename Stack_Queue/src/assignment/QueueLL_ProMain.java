package assignment;

public class QueueLL_ProMain {
	public static void main(String[] args) {
		
		ProductLL_queue ll= new ProductLL_queue();
			
		ll.enQueue(new Product("Car",154000));
		ll.enQueue(new Product("Bike",54000));
		ll.enQueue(new Product("Jeep",15000));
		ll.enQueue(new Product("SUV",40000));
		ll.enQueue(new Product("Car",45000));
		ll.enQueue(new Product("Thar",250000));
		ll.enQueue(new Product("Kuv",30000));
		
		ll.deQueue();
		
		Product temp=ll.peek();
		System.out.println(temp);
		
	}
	
	
}
