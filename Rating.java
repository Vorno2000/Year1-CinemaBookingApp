public enum Rating {
	//film's rating description and minimum age declared
	GENERAL(0),
	PARENTALGUIDANCE(12),
	MATURE(16);
	
	//minimum age integer declared
	private int minAge;
			
	//rating constructor which passes in the minimum age required for the film
	private Rating(int age) {
		//calls setMinAge which sets the minAge variable
		this.setMinAge(age);
	}
	
	//setMinAge method which sets the minAge variable to the ratings age
	public void setMinAge(int age) {
		this.minAge = age;
	}
	
	public int getMinAge() {
		//returns the minAge variable
		return this.minAge;
	}
	
	//overrides the way the print stream prints out the minAge variable when Ratings class is called
	public String toString() {
		return ""+getMinAge();
	}
}
