package employee;


public class Employee {
	private String empName;
	private String empNumber;
	private String hireDate;
	
	
	//Constructors
	public Employee() {
		empName="noname";
		empNumber="nonumber";
		hireDate="00/00/00";
	}
	
	public Employee(String empName, String empNumber, String hireDate) {
		this.empName=empName;
		this.empNumber=empNumber;
		this.hireDate=hireDate;
		
	}
	
	public Employee(Employee e) {
		empName = e.empName;
		empNumber = e.empNumber;
		hireDate = e.hireDate;
	}
	
	//Accessors
	public String getEmpName() {
		return empName;
	}
	
	public String getEmpNumber() {
		return empNumber;
	}

	public String getHireDate() {
		return hireDate;
	}
	
	//Mutators
	public void setEmpName(String eName) {
		empName=eName;
	}
	public void setEmpNumber(String eNumber) {
		empNumber=eNumber;
	}
	public void setHireDate(String hireDate) {
		this.hireDate=hireDate;
	}
	
	//ToString method
	public String toString() {
		String msg ="Employee Name: "+empName+"\n";
		msg+="Employee Number: "+empNumber+"\n";
		msg+="Hire Date: "+hireDate;
		return msg;
	}
	
}
