import java.util.Scanner;

public class CinemaTicketBookingApplication {
	
	//initialize keyboard as the input
	static Scanner keyboard = new Scanner(System.in);
	
	//initialize the number of films as a constant
	static final int NUMBER_OF_FILMS = 4;
	//initialize film array with the number of films constant
	static Film[] films = new Film[NUMBER_OF_FILMS];
	
	//begins customerDetailsInput method
	private static Customer customerDetailsInput() {
		
		//asks for users name
		System.out.println("Please enter your name:");
		keyboard = new Scanner(System.in);
		//gets input from keyboard and saves into a string variable called name
		String name = keyboard.nextLine();
		
		//asks for users age
		System.out.println("Please enter your age:");
		keyboard = new Scanner(System.in);
		//gets input from keyboard and saves it into integer age
		int age = keyboard.nextInt();
		
		//initializes boolean isStudent as false
		boolean isStudent = false;
		
		//initializes student string
		String student;
		
		//asks if the user is a student
		System.out.println("Are you a Student? (Y/N)");
		
		keyboard = new Scanner(System.in);
		//gets input from the keyboard and saves into student String
		student = keyboard.nextLine();
		
		//if statement to check if the user has entered Y, N or anything else 
		if (student.equalsIgnoreCase("Y"))
			//if user enters Y then isStudent is set to true meaning they are student
			isStudent = true;
		
		else if (student.equalsIgnoreCase("N"))
			//if user enters N then isStudent is set to false meaning they are not a student
			isStudent = false;
		
		else
			//any other input will make the program print that the input was invalid
			System.out.println("Invalid Input:");
		
		//saves the users name, age and if they're a student into an object called customerObj
		Customer customerObj = new Customer(name, age, isStudent);
		
		//returns the customerObj object
		return customerObj;
	}
	
	//begins the filmSelection method
	private static Film filmSelection() {
				
		//asks user which film they want to watch making use of the film array
		System.out.println("Which film would you like to watch:");
		System.out.println("1 "+films[0]);
		System.out.println("2 "+films[1]);
		System.out.println("3 "+films[2]);
		System.out.println("4 "+films[3]);
		
		keyboard = new Scanner(System.in);
		//gets input from the keyboard and saves which film the user wants to watch into titleNo
		int titleNo = keyboard.nextInt();
		
		//if statement to check which film the user has entered to watch
		if (titleNo == 1)
			//returns first array element if user enters 1
			return films[0];
		
		else if (titleNo == 2)
			//returns second array element if user enters 2
			return films[1];
		
		else if (titleNo == 3)
			//returns third array element if user enters 3
			return films[2];
		
		else if (titleNo == 4)
			//returns fourth array element if user enters 4
			return films[3];
		
		else {
			//prints out invalid entry and returns null
			System.out.println("Invalid Entry");
			return null;
		}
		
	}
	
	//beginning of issueTicket method with customer details object and film selection object passed in
	private static Ticket issueTicket(Customer customerObj, Film filmObj) {
		
		//initializes ticketObj object with customerObj object and filmObj object
		Ticket ticketObj = new Ticket(customerObj, filmObj);
			
		//if statement to check whether the users age is above the films minimum age rating
		if (customerObj.getAge() >= filmObj.getRating().getMinAge()) {
			
			//if the users age is higher than the minimum age rating, prints out ticket with users information
			System.out.println("Your ticket is ready to be collected!");
			System.out.println("------------------------------------------------------------");
			System.out.println("FILM TICKET for: "+ filmObj);
			System.out.println(customerObj);
			System.out.println(ticketObj);
			System.out.println("------------------------------------------------------------");
			
			//returns the ticketObj object
			return ticketObj;
		}
		else {
			//if the users age is below the minimum age rating
			System.out.println("Sorry, cannot issue ticket for age restricted film");
			//returns ticketObj object
			return ticketObj;
		}
	}
	
	//Main method
	public static void main(String[] args) {
	
		//initializes variable to check whether user wants to issue another ticket
		String restart = "Y";
		
		System.out.println("Welcome to the Cinema Ticket Purchasing System");
		
		//while loop to keep looping if user wants to issue multiple tickets
		while (restart.equalsIgnoreCase("Y")) {

			//This is the film array which prints out the rating and the movie selection
			films[0] = new Film("Ant-Man", Rating.PARENTALGUIDANCE);
			films[1] = new Film("Minions", Rating.PARENTALGUIDANCE);
			films[2] = new Film("Jurassic World", Rating.MATURE);
			films[3] = new Film("Inside Out", Rating.GENERAL);
			
			//begins the issue ticket method passing in customer details object and film selection object
			issueTicket(customerDetailsInput(), filmSelection());
			
			//asks user if they want to issue another ticket
			System.out.println("Issue another ticket? (Y/N)");
			
			//input from keyboard
			keyboard = new Scanner(System.in);
			restart = keyboard.nextLine();
		}
		//closes the scanner
		keyboard.close();
	}
		
		
}
