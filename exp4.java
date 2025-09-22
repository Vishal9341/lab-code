import java.util.*;
public class exp4 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no.s");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(b>a && c>b) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}
