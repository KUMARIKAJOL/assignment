package kajol.com;

public class InheritanceActivity {
	public static void main(String[] args) {
	

			
				// TODO Auto-generated method stub
				Manager manager = new Manager(1001, "peter", "123 Main St", 5551234, 60000);
		        Trainee trainee = new Trainee(1002, "park", "456 Oak St", 5555678, 40000);
		      //  Employee em=new   Employee(1002, "kajol", "455 Oak St", 5566678, 400034);
		        manager.calculateSalary();
		        trainee.calculateSalary();
		//em.calculateSalary();
		        manager.calculateTransportAllowance();
		        trainee.calculateTransportAllowance();
		       // em.calculateTransportAllowance();
			}

		
	}


