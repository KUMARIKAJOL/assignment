package controlstatement;

public class Pyramidpattern {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) { // inner loop
			for(int j = 1;j<=i; j++) { // inner loop
				System.out.print("*");
			}
			System.out.println();
		}
	

	
}}
