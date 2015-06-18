package calculators;

import order.Order;

/*
 * Calculates the cost of shipping based on the weight of the order, collaborates with an OrderWeightCalculator
 */
public class WeightBasedShippingCostCalculator implements ShippingCostCalculator {
	
	private OrderWeightCalculator orderWeightCalculator;
	
	public OrderWeightCalculator getOrderWeightCalculator() {
		return orderWeightCalculator;
	}

	public void setOrderWeightCalculator(OrderWeightCalculator orderWeightCalculator) {
		this.orderWeightCalculator = orderWeightCalculator;
	}

	@Override
	public double calculateShippingCost(Order order) {
		double totalWeight = orderWeightCalculator.calculateOrderWeight(order);
		return (totalWeight == 0 ? 0.0 : 12.99);  //nice and simple here, 0 or $12.99 :)
	}

}
