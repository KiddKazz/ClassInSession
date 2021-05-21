package employee;

public class ProductionWorker extends Employee{
	private int shift;
	private double hourRate;

	
	//Constructors
	public ProductionWorker() {
		super();
		shift = 0;
		hourRate = 0.0;
	}
	public ProductionWorker (String eName,String eNumber, String hDate, int shift, double hourRate) {
		super(eName,eNumber,hDate);
		setShift(shift);
		setHourRate(hourRate);
	}
	//Copy constructor
	public ProductionWorker(ProductionWorker pw) {
		super(pw);
		shift =pw.shift;
		hourRate = pw.hourRate;
		
	}
	
	//toString
	public String toString() {

		String msg=super.toString();
		if(shift==1)
			msg+="Shift: Day\n";
		else if (shift==2)
			msg+="Shift: Night\n";
		else
			msg+="Shift: Invalid shift number\n";
		msg+="Hour rate: "+hourRate;
		return msg;
	}
	
	//Accessors
	public int getShift() {
		return shift;
	}
	public double getHourRate() {
		return hourRate;
	}
	//Mutators
	public void setShift(int shift) {
		if(shift!=1 && shift !=2) {
			System.out.println("Wrong shift");
		shift = 0;
	}
		else {
			this.shift=shift;
		}
	}
	public void setHourRate(double hourRate) {
		if(hourRate>0)
			this.hourRate=hourRate;
		else {
			this.hourRate=0.0;
			System.out.println("rate should be positive");
		}
	}
}

