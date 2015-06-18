package calculators;

import order.Order;

/*
 * Interface for objects which can calculate the shipping cost of an order.
 */
public interface ShippingCostCalculator {

	public abstract double calculateShippingCost(Order order);

}