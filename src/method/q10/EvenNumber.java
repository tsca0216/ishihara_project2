package method.q10;

public class EvenNumber {
	public static int count(int[] n) {
		int c = 0;
		for (int num : n) {
			if (num % 2 == 0) {
				c++;

			}
		}
		return c;
	}

	public static void main(String[] args) {
		getEvenNumbers();

	}

	public static void getEvenNumbers() {
		int[] array = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };

		int cc = count(array);

		System.out.println("[3,2,5,6,7,25,10,51,88,98]" + "には、偶数が" + cc + "個あります。");

	}
}
