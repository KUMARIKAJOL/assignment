package kajol.com;

import java.util.Scanner;

public class TestData_Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int a=sc.nextInt();
		
		System.out.println("Enter B number");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println("First Integer is Maximum = " +a);
			System.out.println("Second Integer is Minimum = " +b);
		}
		else if(b>a){
			System.out.println("Second Integer is Maximum = " +b);
			System.out.println("First Integer is Minimum = " +a);
		}
		else {
			System.out.println("Please input numbers");
		}
	}
}



