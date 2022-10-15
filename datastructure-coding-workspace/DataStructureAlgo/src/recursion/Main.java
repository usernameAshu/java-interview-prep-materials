package recursion;

public class Main {
	public static void main(String[] args) {
		func(3);
	}
	
	static void func(int n) {
		if(n > 0) {
			System.out.println(n+10);
			func(n-1);
			System.out.println(n);
		}
	}
}
