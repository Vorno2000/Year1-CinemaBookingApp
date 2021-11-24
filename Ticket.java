//initializes Ticket Class
public class Ticket {
	
	//declare local customerObj object and filmObj object
	private Customer customerObj;
	private Film filmObj;
	
	//initializes the Ticket constructor which takes in customerObj object and filmObj object
	public Ticket(Customer customerObj, Film filmObj) {
		//sets the passed in objects to the local objects
		this.customerObj = customerObj;
		this.filmObj = filmObj;
	}
	
	//initializes cost method
	public double cost() {
		//declares local filmCost variable
		double filmCost = 0;
		
		//if statement to check if the user's age is equal to or above 18
		if (customerObj.getAge() >= 18)
			//sets filmCost to 10
			filmCost = 10;
		//checks if users age is less than 18
		else if (customerObj.getAge() < 18)
			//sets filmCost to 7
			filmCost = 7;
		
		//if statement to check if the users age is above or equal to 8 and is equal or less than 20 and that they are a student
		if (customerObj.getAge() >= 8 && customerObj.getAge() <= 20 && customerObj.getStudent() == true)
			//sets filmCost to 10 and then applies a 20% discount
			filmCost = 10 * 0.80;
		
		//if statement to check if users age is above 25 and is a student
		if (customerObj.getAge() > 25 && customerObj.getStudent() == true)
			//applies a 7% discount
			filmCost = filmCost * 0.93;
		
		//if statement to check if the users age is above 70 and the user is not a student
		if (customerObj.getAge() > 70 && customerObj.getStudent() == false)
			//applies a 5% discount to the cost
			filmCost = filmCost * 0.95;
		
		//returns the final cost of the film
		return filmCost;
	}
	
	//getFilm initialized in order to return the filmObj object
	public Film getFilm() {
		return this.filmObj;
	}
	
	//getCustomer initialized in order to return the customerObj object
	public Customer getCustomer() {
		return this.customerObj;
	}

	//toString method to override the print stream to print the total cost when Ticket class is called
	public String toString() {
		return "TOTAL COST: " + cost();
	}
}
