package product;

import java.util.ArrayList;
import java.util.List;

public class ProductsManager {
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public void removeProduct(int id) {
		products.removeIf(p -> p.getId() == id);
	}

	public Product getProductByName(String name) {
		for (Product p : products) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	public void showAllProducts() {
		for (Product p : products) {
			System.out.println(p);
		}
	}
}
