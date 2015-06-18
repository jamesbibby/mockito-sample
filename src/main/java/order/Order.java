package order;

import java.util.List;

/*
 * This is a super simple version of an Order, it would be much more complicated in a 
 * real system which is why we would mock it
 */
public class Order {
		
	private List<OrderItem> orderItems;
	
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public void addItem(OrderItem item) {
		orderItems.add(item);
	}

}
