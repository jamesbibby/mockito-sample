package calculators;

import order.Order;

/*
 * Interface for objects which can calculate the weight of an order.
 */
public interface OrderWeightCalculator {

	public abstract double calculateOrderWeight(Order order);

}