
public class Fibanocci {

	public static void main(String[] args) {
		
        System.out.println(fib(50));
	}

	private static int fib(int i) {
		if(i<2) {
			return i;
		}
		return fib(i-1)+fib(i-2);
	}

}
