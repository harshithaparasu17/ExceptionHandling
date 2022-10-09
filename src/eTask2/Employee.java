package eTask2;

public class Employee {
	private int idNo;
	private int hourlyWage;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int idNo, int hourlyWage) throws EmployeeException {
		super();
		this.idNo = idNo;
		this.hourlyWage = hourlyWage;
	}

	public int getIdNo() {
		return idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) throws EmployeeException {
		this.hourlyWage = hourlyWage;
		
		if(hourlyWage<6)
		{
			String s="The HourlyWage provided is very less!!! Kindly recheck the wages";
			throw new EmployeeException(s);
		}
		else if(hourlyWage>50)
		{
			String s="The HourlyWage provided is very high!!! Kindly recheck the wages";
			throw new EmployeeException(s);
		}
		
	}
	
}
