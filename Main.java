import java.util.Scanner;
public class ternary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double temp ;
		
		System.out.print("Enter temp:");
		temp=sc.nextDouble();
		System.out.print("enter unit(c or f)");
		String unit=sc.next();
		double newtemp;
		newtemp=(unit.equals('c'))? (temp-32)*5/9 : (temp*5/9)+32;
		System.out.printf("%.1f %s",newtemp, unit);
		
	}
}