import java.util.*;
public class gcd{
	public static int gcd(int a, int b){
		if(a==0)return b;
		return gcd(b%a,a);
		}
	public static void main(String args[]) {
		System.out.println("The gcd is: ");
		System.out.println(gcd(18,35));
		}
}