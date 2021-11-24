//initializes Customer class
public class Customer {
	
	//declare name minAge and isStudent variables
	private String name;
	private int minAge;
	private boolean isStudent;
	
	//customer constructor initialized with no parameters
	public Customer() {
		//sets name to null
		setName("null");
		//sets age to 0
		setAge(0);
		//sets student boolean to false
		setStudent(false);
	}
	
	//customer constructor which passes in name age and isSudent parameters
	public Customer(String name, int minAge, boolean isStudent) {
		//sets name to the passed in name variable
		setName(name);
		//sets minAge to the passed in minAge variable
		setAge(minAge);
		//sets isStudent to the passed in isStudent variable
		setStudent(isStudent);
	}
	
	//setName method initialized to set the local variable name to the passed in name
	public void setName(String name) {
		this.name = name;
	}
	
	//setAge method initialized to set the local variable minAge to the passed in minAge
	public void setAge(int minAge) {
		this.minAge = minAge;
	}
	
	//setStudent method initialized to set the local variable isStudent to true or false depending on the passed in isStudent
	public void setStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}
	
	//getName method returns local variable name
	public String getName() {
		return this.name;
	}
	
	//getAge method returns local variable minAge
	public int getAge() {
		return this.minAge;
	}
	
	//getStudent method returns local boolean isStudent
	public Boolean getStudent() {
		return isStudent;
	}
	
	//toString method to override the print stream to print customer details when Customer class is called
	public String toString() {
		String answer;
		if (getStudent())
			answer = "Yes";
		else 
			answer = "No";
		return String.format("CUSTOMER DETAILS: %s Age: %d Student? %s", getName(), getAge(), answer);
	}
}
