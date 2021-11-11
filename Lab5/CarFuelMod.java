import java.util.Scanner;
public class CarFuelMod{
	static int carrefuling(int distance,int tank,intstops[],int n) {
		int current=0;
		int numrefills=0;
		int lastrefills=0;
		while(current<=n-1) {
			lastrefills=current;
			while((current<=n-1)&&stops[current+1]-stops[lastrefills]<=tank) {
				current=current+1;
				}
			if(current==lastrefills)
				return -1;
			if(current<=n)
				numrefills=numrefills+1;
			}
		System.out.println("Possible");
		return numrefills;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dist=sc.nextInt();
		int tank=sc.nextInt();
		int n=sc.nextInt();
		int stops[]=new int[n*n*n];
		for(int i=0;i<n;i++) {
			stops[i]=sc.nextInt();
			}
		System.out.println(carrefuling(dist,tank,stops,n));
		tank=dist-stops[3];
		System.out.println("The extra distance is:-"+tank);
		System.out.print("Coming back is ");
		carrefuling(dist,tank,stops,n);
		}
}