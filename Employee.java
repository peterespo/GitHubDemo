// Peter Esposito
public class Employee extends Person {

	/**
	 * The employee number or index
	 */
	int employeeNo;

	/**
	 * the account number.
	 */
	int accountNo;

	/**
	 * The email address
	 */
	String emailAddress;

	/**
	 * The initial capital.
	 */
	double initialCapital;

	/**
	 * The employer.
	 */
	public static String employer;

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		Employee.employer = employer;
	}

	public Employee() {
		// initialize fields.
		this("(2) Invoke Employee�s overloaded constructor");
		this.employeeNo = 0;
		this.accountNo = 0;
		this.emailAddress = "";
		this.initialCapital = 0.0;
		System.out.println("(3) Employee's no arg constructor is invoked");
	}

	public Employee(String s) {
		System.out.println(s);
	}

	public Employee(int employeeNumber, int accountNumber, String firstName,
			String lastName, String emailAddress) {
		this();
		this.employeeNo = employeeNumber;
		this.accountNo = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public Employee(int employeeNumber, int accountNumber, String firstName,
			String lastName, String emailAddress, double initialCapital) {
		this();
		this.employeeNo = employeeNumber;
		this.accountNo = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.initialCapital = initialCapital;
	}

	public String getInitials() {
		String result = "";
		if (!firstName.isEmpty()) {
			result += this.firstName.charAt(0) + ".";
		}
		if (!this.lastName.isEmpty()) {
			result += this.lastName.charAt(0) + ".";
		}
		return result;
	}

	public boolean equals(Employee that) {
		return (this.employeeNo == that.employeeNo
				&& this.accountNo == that.accountNo
				&& this.firstName.equals(that.firstName)
				&& this.lastName.equals(that.lastName)
				&& this.emailAddress.equals(that.emailAddress));
	}

}
