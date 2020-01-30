package demos;

public class salary
{
	public int basic;
	public float fl;
	public String empName;
	public int pf;
	public double total_Sal;
	
	public salary( String empName, int basic, float f1, int pf)
	{
		  this.empName = empName;
		  this.basic = basic;
		  this.fl=fl;
		  this.pf=pf;
	}
	
	public double cal_Sal()
	{
	    total_Sal= basic+fl- pf;
		return total_Sal;
		
	}
	

}
