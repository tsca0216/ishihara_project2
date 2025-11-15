package product;

import java.util.ArrayList;
import java.util.List;

public class ProductsManager implements Searchable {
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

	@Override
	public List<Product> search(String keyword) {
		List<Product> result = new ArrayList<>();
		for (Product p : products) {
			if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
				result.add(p);
			}
		}
		return result;
	}

	public void showAllProducts() {
		for (Product p : products) {
			System.out.println(p);
		}
	}
}
