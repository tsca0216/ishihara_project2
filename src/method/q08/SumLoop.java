package method.q08;

public class SumLoop {
	public static int add(int m) {

		int sum = 0;
		for (int i = 1; i <= m; i++) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {
		sumLoop();

	}

	public static void sumLoop() {

		int x = 1;
		int y = 100;
		int sum = add(100);

		System.out.println("最小値：" + x);
		System.out.println("最大値：" + y);
		System.out.println("加算結果：" + sum);

	}
}
