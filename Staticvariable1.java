package kajol.com;

 class Staticvariable { //class1
	//instance variable
	int rollno;
	String name;
	float fee;
	static String college= "Hanshraj"; // static variable
	//static void change(){
	  //college="ITC";}
	//constructor
	Staticvariable(int rollno, String name, float fee){
		this.rollno= rollno;
		this.name=name;
		this.fee=fee;
	}
	//method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class Staticvariable1{ // class 2
		public static void main(String[] args) {
			
		
		//Staticvariable.change();
		
		
		//objects
		Staticvariable s1 = new Staticvariable(111,"pallabi",5000);
		Staticvariable s2 = new Staticvariable(555,"Amit",6000);
		s1.display(); // method call
		s2.display();
	}

}}
