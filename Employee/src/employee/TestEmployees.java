package employee;

public class TestEmployees {

	public static void main(String[] args) {
		//Creating employee objects
		Employee e1 = new Employee("Jerry","000-00","01/20/2020");
		//System.out.println(e1);
		System.out.println();
		ProductionWorker pw1 = new ProductionWorker("Mary","1111-1111","1/1/2001",1,40.0);
		//System.out.println(pw1);
		System.out.println();

		TeamLeader tl1=new TeamLeader("Paul","2222-2222","2/2/2002",2,50.0,5000.0,10,5);
		//System.out.println(tl1);
		Employee e2 = pw1;
		Employee e3 = tl1;
		Employee[] myEmps=new Employee[3];
		myEmps[0]=e1;
		myEmps[1]=e2;
		myEmps[2]=e3;
		
		for(int i=0; i<3;i++)
			System.out.println(myEmps[i]);
	}

}
