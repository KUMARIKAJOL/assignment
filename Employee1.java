package kajol.com;

public class Employee1 {
	// problem 1
	  private long employeeId;
	    protected String employeeName;
	    private String employeeAddress;
	    private long employeePhone;
	    protected double basicSalary;
	    private double specialAllowance = 250.80;
	    private double hra = 1000.50;
	//
	    public Employee1(long id, String name, String address, long phone, double salary) {
	        this.employeeId = id;
	        this.employeeName = name;
	        this.employeeAddress = address;
	        this.employeePhone = phone;
	        this.basicSalary = salary;
	    }

	    public double calculateSalary() {
	        double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
	        System.out.println("Salary for employee " + employeeName + " is: " + salary);
	        return salary;
	    }

	    public void calculateTransportAllowance() {
	        double transportAllowance = 10.0/100 * basicSalary;
	        System.out.println("Transport allowance for employee " + employeeName + " is: " + transportAllowance);
	    }
	}

	// Manager.jav
	class Manager extends Employee1 {
	    public Manager(long id, String name, String address, long phone, double salary) {
	        super(id, name, address, phone, salary);
	    }

	    @Override
	    public void calculateTransportAllowance() {
	        double transportAllowance = 15.0/100 * basicSalary;
	        System.out.println("Transport allowance for manager " + employeeName + " is: " + transportAllowance);
	    }
	}

	// Trainee.java

	 class Trainee extends Employee1 {
	    public Trainee(long id, String name, String address, long phone, double salary) {
	        super(id, name, address, phone, salary);
	    }
	    public void calculateTransportAllowance() {
	        double transportAllowance = 10.0/100 * basicSalary;
	        System.out.println("Transport allowance for tranee " + employeeName + " is: " + transportAllowance);
	    }
	}
	
