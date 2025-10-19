package method.q04;

public class SumNumbers {

	public static int add(int x, int y) {

		int w = x + y;

		return w;

	}

	public static void main(String[] args) {
		calculateSum();

	}

	public static void calculateSum() {
		int x = 2;
		int y = 3;
		int w = add(2, 3);

		System.out.println("第一引数：" + x);
		System.out.println("第二引数：" + y);
		System.out.println("加算結果：" + w);

	}
}
