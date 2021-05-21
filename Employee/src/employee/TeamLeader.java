package employee;

public class TeamLeader extends ProductionWorker {
	private double monthBonus;
	private int reqTrHours;
	private int curTrHours;

	//Accessors
	public double getMonthBonus() {
		return monthBonus;
	}
	public int getReqTrHours() {
		return reqTrHours;
	}
	public int getCurTrHours() {
		return curTrHours;
	}
	
	//Mutators
	public void setMonthBonus(double mb) {
		if(mb>=0.0)
			monthBonus=mb;
		else {
			monthBonus=0;
			System.out.println("Wrong value. Month bonus is set at 0.");
		}
	}
	public void setReqTrHours(int rth) {
		if(rth>=0)
			reqTrHours=rth;
		else {
			reqTrHours=rth;
			System.out.println("Wrong value. Required training hours reseted to 0.");
		}
	}
	public void setCurTrHours(int cth) {
		if(cth>=0)
			curTrHours=cth;
		else {
			curTrHours=0;
			System.out.println("Wrong value. Current training hours reseted to zero");
		}
	}
	
	//Constructors
	public TeamLeader() {
		monthBonus=0.0;
		reqTrHours=0;
		curTrHours=0;
	}
	public TeamLeader(String eName,String eNumber,String hDate,int shift, double hourRate,double mb,int rth, int cth) {
		super(eName,eNumber,hDate,shift,hourRate);
		setMonthBonus(mb);
		setReqTrHours(rth);
		setCurTrHours(cth);
	}
	
	public TeamLeader(TeamLeader tl) {
		monthBonus=tl.monthBonus;
		reqTrHours=tl.reqTrHours;
		curTrHours=tl.curTrHours;
		setShift(tl.getShift());
		setHourRate(tl.getHourRate());
		setEmpName(tl.getEmpName());
		setEmpNumber(tl.getEmpNumber());
		setHireDate(tl.getHireDate());
	}
	
	public String toString() {
		String msg=super.toString()+"\n";
		msg+="Monthly Bonus: "+monthBonus+"\n";
		msg+="Required Training Hours: "+reqTrHours+"\n";
		msg+="Current Training Hours: "+curTrHours;
		return msg;
	}
}
