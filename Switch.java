package controlstatement;

public class Switch {
public static void main(String[] args) {
	int no1=10; //declaring a variable for a switch
	switch(no1) { //switch expression
	//case statement(multiple condition)
	
	case 1:
        System.out.println("20");	
	case 2:
		System.out.println("30");
	case 3:
		System.out.println("10");
	case 10:
		System.out.println("50");
	case 5:
		System.out.println("60");
		break;
		default:System.out.println("invalid number"); //syso
	}
}
}
