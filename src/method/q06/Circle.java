package method.q06;

public class Circle {
	public static double add(int x) {

	 double w = x*x * 3.14;

		return w;
	}

	public static void main(String[] args) {
		getCircleArea();

	}

	public static void getCircleArea() {

		int x = 5;
		
		double w = add(5);

		System.out.println("半径：" + x);
		System.out.println("円の面積：" + w);

	}

}
