package product;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ProductsManager manager = new ProductsManager();
		Scanner scanner = new Scanner(System.in);

		manager.addProduct(new Product(1, "冷蔵庫", 50000, 10));
		manager.addProduct(new DiscountedProduct(2, "ソファ", 30000, 5, 0.3));
		manager.addProduct(new Product(3, "米", 2000, 3));
		manager.addProduct(new Product(4, "小説", 1500, 4));
		manager.addProduct(new Product(5, "Tシャツ", 1500, 5));

		System.out.println("---商品「ソファ」の情報と割引率30％の情報を表示する---");
		Product discount = manager.getProductByName("ソファ");
		if (discount != null) {
			System.out.println(discount);

			System.out.println("---商品名「Tシャツ」を検索して表示する---");
			Product result = manager.getProductByName("Tシャツ");
			if (result != null) {
				System.out.println(result);
			} else {
				System.out.println("該当なし。");
			}
		}

		scanner.close();
	}
}