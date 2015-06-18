package order;

/*
 * This is a super simple version of an OrderItem, it would be much more complicated in a 
 * real system which is why we would mock it
 */
public class OrderItem {

	private double weight = 0;
	private int quantity = 0;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
