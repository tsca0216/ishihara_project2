package method.q07;

public class SumNumbers2 {
	public static double add(int x, double y) {

		double w = x + y;

		return (int) w;
	}

	public static void main(String[] args) {
		calculateSum();

	}

	public static void calculateSum() {

		int x = 5;
		double y = 3.5;
		double w = add(5, 3.3);

		System.out.println("第一引数（整数）：" + x);
		System.out.println("第二引数（実数）：" + y);
		System.out.println("加算結果：" + w);

	}
}
