package kajol.com;

public class Thiskeyword1 {
	//instance variable
	int id;
	String ename;
	double salary;
	//parameterized constructor
	Thiskeyword1(int id, String ename, double salary) {//
	this.id=id;
	this.ename=ename;
	this.salary=salary;}
	
	//method
	void display() {
		System.out.println(id+" "+ename+" "+salary);
	}
	public class Thiskeyword{
	public static void main(String[] args) {
		//objects
		Thiskeyword1 s1 = new Thiskeyword1(01,"kajol",5000);
		Thiskeyword1 s2 = new Thiskeyword1(02,"vikas",6000);
		           s1.display();
		           s2.display();
		
		
	}
		
	}

}
