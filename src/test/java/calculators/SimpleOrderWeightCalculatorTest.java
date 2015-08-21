package calculators;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import order.Order;
import order.OrderItem;

import org.junit.Test;
import org.mockito.Mockito;

public class SimpleOrderWeightCalculatorTest {

	@Test
	public void testEmptyOrder() {

		// The order object is complex, so lets just mock the parts we need to
		// test this calculator
		Order order = Mockito.mock(Order.class);
		when(order.getOrderItems()).thenReturn(new ArrayList<OrderItem>());

		// create our object under test
		SimpleOrderWeightCalculator calculator = new SimpleOrderWeightCalculator();

		// ensure the calculator accurately returns a zero weight for an empty
		// order
		assertEquals(0.0, calculator.calculateOrderWeight(order), 0);

	}

	@Test
	public void testSingleItemOrder() {

		// Here we mock a single order item so we can set the weight and quantity
		OrderItem item = Mockito.mock(OrderItem.class);
		when(item.getQuantity()).thenReturn(1);
		when(item.getWeight()).thenReturn(5.0);

		// create a list to hold the mock order item
		List<OrderItem> list = new ArrayList<OrderItem>();
		list.add(item);

		// Again we mock the order object, but return the list of mock order items
		Order order = Mockito.mock(Order.class);
		when(order.getOrderItems()).thenReturn(list);

		// create our object under test
		SimpleOrderWeightCalculator calculator = new SimpleOrderWeightCalculator();

		// ensure the calculator accurately returns a zero weight for an empty order
		assertEquals(5.0, calculator.calculateOrderWeight(order), 0);

	}

	@Test
	public void testLargeOrder() {
		
		// Here we mock a single order item so we can set the weight and quantity
		OrderItem item = Mockito.mock(OrderItem.class);
		when(item.getQuantity()).thenReturn(1);
		when(item.getWeight()).thenReturn(5.0);

		// create a list to hold the mock order item
		List<OrderItem> list = new ArrayList<OrderItem>();

		// make sure this can handle a huge order
		for (int i =0; i < 1000; i++) {
			list.add(item);
		}
		
		// Again we mock the order object, but return the list of mock order items
		Order order = Mockito.mock(Order.class);
		when(order.getOrderItems()).thenReturn(list);

		// create our object under test
		SimpleOrderWeightCalculator calculator = new SimpleOrderWeightCalculator();

		// ensure the calculator accurately returns a zero weight for an empty order
		assertEquals(5000.0, calculator.calculateOrderWeight(order), 0);
		
	}

}
