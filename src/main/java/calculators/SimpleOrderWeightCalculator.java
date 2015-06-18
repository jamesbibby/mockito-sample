package calculators;

import order.Order;
import order.OrderItem;

/*
 * Takes a simple approach for total weight: quantity times unit weight.  This is probably the
 * most common way but you never know... there could be a modifier for large numbers to include
 * support or wrapping material?
 * 
 */
public class SimpleOrderWeightCalculator implements OrderWeightCalculator {
	
	@Override
	public double calculateOrderWeight(Order order) {
		/*
		 * This method could have been beautiful in Java 8 :)
		 * return order.getOrderItems().stream().mapToDouble(item -> item.getWeight() * item.getQuantity()).sum();
		 */
		
		double totalWeight = 0.0;
		
		for (OrderItem item : order.getOrderItems()) {
			totalWeight += item.getWeight() * item.getQuantity();
		}
		return totalWeight;
	}

}
