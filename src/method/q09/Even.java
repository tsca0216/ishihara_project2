package method.q09;

public class Even {
	public static String abc(int n) {
		if (n % 2 == 0) {
			return "偶数";
		} else {
			return "奇数";
		}
	}

	public static void main(String[] args) {
		checkEven();

	}

	public static void checkEven() {
		int n = 5;
		String a = abc(5);

		System.out.println(n + "は" + a + "です。");

	}
}
