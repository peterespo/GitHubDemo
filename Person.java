/**
 * 
 * @author John Maksuta
 *
 */
public class Person {

	/**
	 * This is the first name of the person.
	 */
	String firstName;
	/**
	 * This is the last name of the person.
	 */
	String lastName;

	/**
	 * This is the default constructor for the Person class.
	 */
	public Person() {
		super();
		this.firstName = "";
		this.lastName = "";
		System.out.println("(1) Person's no arg constructor is invoked");
	}

}
