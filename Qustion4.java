package controlstatement;

import java.util.Scanner;

public class Qustion4 {
	public static void main(String[] args) {
		int raw, c=1,k,i,j; 
		System.out.println("Enter the number of rows:");
		Scanner sc =new Scanner(System.in);
		raw =sc.nextInt();
		for(i=0; i<raw; i++) 
		{
			for(k=1;k<=raw-i;k++)
				System.out.print(" ");
			for(j=0; j<=i;j++)
			{
				if(j==0||i==0)
					c=1;
				else
					c=c*(i=j+1)/j;
				System.out.print(" "+c);
			}
			System.out.print("\n");
				
		}
	}

}
