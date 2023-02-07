package kajol.com;

public class Parameterizedcons1 {
	int num;
	String str;
	Parameterizedcons1 (int n, String s){
		System.out.println("parameterized Constructor called");
		num=n;
		str=s;
	}
	public static void main(String[] args) {
		//Constructor call
		 Parameterizedcons1 sc=new  Parameterizedcons1(99,"kajolkumari");
		
		System.out.println("num ="+ sc.num);
		System.out.println("str=" +sc.str);
		
		
		
	}
		
	}


