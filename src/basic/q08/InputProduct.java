package basic.q08;

import java.util.Scanner;

public class InputProduct {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("商品名を入力してください: ");
		String item = scanner.nextLine();

		System.out.print("価格を入力してください: ");
		int value = scanner.nextInt();

		System.out.println("商品名は " + item + "です。価格は " + value + "円です。");
		scanner.close();
	}
}