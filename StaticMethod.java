package kajol.com;

public class StaticMethod {
	int rollno;
	String name;
	float fee;
	static String college= "MIT"; // static method to change the value of static variable
	static void change(){ // static method
	  college="ITC";}
	//constructor
	StaticMethod(int rollno, String name, float fee){
		this.rollno= rollno;
		this.name=name;
		this.fee=fee;
	}
	//method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class StaticMethod1{ // class 2
	public static void main(String[] args) {
	//calling static method with class name
	StaticMethod.change();
	//creating object
	StaticMethod s1 = new  StaticMethod(102,"kajol",5000);
	StaticMethod s2 = new  StaticMethod(222,"tannu",3000);
		s1.display(); // method call
		s2.display();
	}

}}

	


