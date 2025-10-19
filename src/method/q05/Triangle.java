package method.q05;

public class Triangle {
	public static int add(int x, int y) {

		int w = x * y / 2;

		return w;
	}

	public static void main(String[] args) {
		getTriangleArea();

	}

	public static void getTriangleArea() {

		int x = 8;
		int y = 5;
		int w = add(8, 5);

		System.out.println("底辺：" + x);
		System.out.println("高さ：" + y);
		System.out.println("三角形の面積：" + w);

	}

}
