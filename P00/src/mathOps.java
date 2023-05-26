
public class mathOps {
	public static int sub(int a, int b) {
		return a - b;
	}
	public static int mul(int a, int b) {
		return a * b;
	}
	public static int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 4;
		int c = sub(a,b);
		int d = mul(a,b);
		double e = div(a,b);
		System.out.print(String.format("%d %d %.2f", c,d,e));
	}

}
