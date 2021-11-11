import java.util.*;
import java.io.*;
public class CarFueling {
	static int computeMinRefills(int dist, int tank, int[]stops) {
		int i,c=0,last=0;
		if (dist - stops[stops.length-1] > tank)
			return -1;
		for(i=0;i<stops.length;i++){
			if(i>0 && (stops[i] - stops[i-1]) > tank)
				return -1;
			if((stops[i]-last)>tank){
				last=stops[i-1];c++;
				}
			}
		if ((dist - last) > tank){
			last = stops[i - 1];
			c++;
			}
		return c;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dist = sc.nextInt();
		int tank = sc.nextInt();
		int n = sc.nextInt();
		int stops[] = new int[n];
		for (int i = 0; i < n; i++) {
			stops[i] = sc.nextInt();
			}
		System.out.println(computeMinRefills(dist, tank,stops));
		}
}