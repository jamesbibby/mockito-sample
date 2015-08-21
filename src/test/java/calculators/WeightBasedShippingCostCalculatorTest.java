package calculators;

import order.Order;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class WeightBasedShippingCostCalculatorTest {

	@Test
	public void testZeroWeightOrder() {
		
		// create an order, and a weight calculator mock with a weight of 0
		Order order = Mockito.mock(Order.class);
		OrderWeightCalculator orderWeightCalculator = Mockito.mock(OrderWeightCalculator.class);
		when(orderWeightCalculator.calculateOrderWeight(order)).thenReturn(0.0);
		
		// create the shipping calculator
		WeightBasedShippingCostCalculator shippingCalculator = new WeightBasedShippingCostCalculator();
		shippingCalculator.setOrderWeightCalculator(orderWeightCalculator);
		assertEquals(0.0, shippingCalculator.calculateShippingCost(order), 0.0);
	}
	
	@Test
	public void testStandardWeightOrder() {
		
		// create an order, and a weight calculator mock with a weight of 0
			Order order = Mockito.mock(Order.class);
			OrderWeightCalculator orderWeightCalculator = Mockito.mock(OrderWeightCalculator.class);
			when(orderWeightCalculator.calculateOrderWeight(order)).thenReturn(5.0);
			
			// create the shipping calculator
			WeightBasedShippingCostCalculator shippingCalculator = new WeightBasedShippingCostCalculator();
			shippingCalculator.setOrderWeightCalculator(orderWeightCalculator);
			assertEquals(12.99, shippingCalculator.calculateShippingCost(order), 0.0);	
	}
	
}
