package kajol.com;

import java.util.Scanner;

public class Method2 {
	public static void main(String[] args) {
		// creat sacnner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		//Read numbers from user
		int num=sc.nextInt();
		//call the method
		findtheprime(num);
	}
	//creat a method
	public static void findtheprime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			}
		if(count==2) {
			System.out.println(num +" "+ "prime number");
		}
		else {
			System.out.println(num +" "+ "notprime number");
					
					
					
			
			
					
					
		}
	
	}
	

}
