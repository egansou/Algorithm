import java.util.Scanner;

public class Main {
	public static long solve_n (int a, int b, long t) { 
		   long low = 0;
		   long high = t;
	       long mid = 0;
	       int i = 0;
	       while (low <= high) {
	           mid =  (low + (high - low) / 2);
	           if (((a*mid*Math.log(mid)) + b) > t) high = mid - 1;
	           else if (((a*mid*Math.log(mid)) + b) < t) low = mid + 1;
	           i++;
	       }
	       if (((a*mid*Math.log(mid)) + b) > t) return mid-1;
	       else return mid;
	   }
	   public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   int a, b;
		   long c;
		   a = s.nextInt();
		   b = s.nextInt();
		   c = s.nextLong();
	       System.out.print( solve_n (a, b, c));   
	   }
}
