import java.util.Scanner;
class Fibonacci {
	public static int fib(int n) {
		if (n <= 1) {
			return n;
			}
		return fib(n-1)+fib(n - 2);
		}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int a =fib(n);
		int b = a % 10;
		System.out.println("The Last Digit of Large FibonnaciNumber is: "+b);
		}
}