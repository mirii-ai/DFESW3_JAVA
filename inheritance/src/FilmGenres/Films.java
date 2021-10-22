package FilmGenres;

public class Films {
	
	private String title;
	private int runtime;
	private String genre;
	private boolean recommended;
	private int overallRating;
	
	public void is_recommended() {
		System.out.println("This film is recommended: " + recommended);
		System.out.println("OVERALL RATING OF " + title + ": " + overallRating);
	}

	
	

	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public int getRuntime() {
		return runtime;
	}




	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}




	public boolean isRecommended() {
		return recommended;
	}




	public void setRecommended(boolean recommended) {
		this.recommended = recommended;
	}




	public int getOverallRating() {
		return overallRating;
	}




	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}




	public Films(String title, int runtime, String genre, boolean recommended, int overallRating) {
		super();
		this.title = title;
		this.runtime = runtime;
		this.genre = genre;
		this.recommended = recommended;
		this.overallRating = overallRating;
	}
	
	

}
