package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 50;
		long currentTimeMillis_start = System.currentTimeMillis();
		
		for(int i=0;i<=n;i++) {
			long fib = fib(i);
			System.out.print(fib+" ");
		}
		long currentTimeMillis_end = System.currentTimeMillis();
		
		long time_taken = (currentTimeMillis_end - currentTimeMillis_start ) /1000; 
		
		System.out.println("\nTime for algo 1: "+ time_taken +" seconds");
		
		currentTimeMillis_start = System.currentTimeMillis();
		fibonacci(0,1, 100);
		
		currentTimeMillis_end = System.currentTimeMillis();
		time_taken = (currentTimeMillis_end - currentTimeMillis_start ) /1000; 
		System.out.println("\nTime for algo 2: "+ time_taken +" seconds");
	}

	static void fibonacci(long p, long n, long term) {
		long sum = p + n;
		System.out.print(sum+ " ");
		if(term == 0)
			return;
		term--;
		fibonacci(n, sum, term);
	}
	
	
	static long fib(int n) {
		
		if( n <= 1) 
			return n;
		else 
			return fib(n-2) + fib(n-1);
	}
}
