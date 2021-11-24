//initializes Film class
public class Film {
	
	//declare String title and Rating rating variables
	private String title;
	private Rating rating;
	
	//initializes film constructor for nothing to be passed in
	public Film() {
		//calls setTitle and setRating with null and 0 passed into them
		this.setTitle("null");
		this.setRating(Rating.GENERAL);
	}
	
	//initializes film constructor for title and rating to be passed in
	public Film(String title, Rating rating) {
		//calls for the title and rating to be set
		this.setTitle(title);
		this.setRating(rating);
	}
	
	//setTitle method initialized to set the title
	public void setTitle(String title) {
		this.title = title;
	}
	
	//setRating method initialized to set the rating
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	//getTitle method initialized to have the title returned
	public String getTitle() {
		return this.title;
	}
	
	//getRating method initialized to have the rating returned
	public Rating getRating() {
		return this.rating;
	}

	//toString method to override the print stream to print title and first letter of rating name when Film class is called
	public String toString() {
		return String.format("%s Rating: (%.1s)", getTitle(), getRating().name());
	}
}
