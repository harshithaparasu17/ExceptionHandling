package eTask2;

public class EmployeeException extends Exception {
	String message;
	
	public EmployeeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		Employee a=new Employee();
		try {
			a.setHourlyWage(a.getHourlyWage());
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			
			return "EmployeeException [message=" + message + "]";
		}
		return message;
		
	}
	
}
