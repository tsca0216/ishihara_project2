package product;

public class DiscountedProduct extends Product {
	private double discountRate;

	public DiscountedProduct(int id, String name, double price, int stock, double discountRate) {
		super(id, name, price, stock);
		this.discountRate = discountRate;
	}

	public double getDiscountRate() {
		return discountRate;

	}

	public double calculateDiscountedPrice() {

		return getPrice() * (1 - discountRate);
	}

	@Override
	public String toString() {
		return "Product:id=" + getId()
				+ ", name=" + getName()
				+ ", price= " + getPrice() + "円"
				+ ", stock= " + getStock() + "個"
				+ ", 割引率: " + discountRate
				+ ", 割引後価格: " + calculateDiscountedPrice() + "円";

	}
}