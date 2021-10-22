package FilmGenres;

public class HorrorFilms extends Films {
	
	private boolean isGory;
	private boolean isSupernatural;
	private boolean isNotForChildren;
	private boolean isScary;
	private String subgenre;
	
	public void scaryOrNot() {
		System.out.println("This film is super scary: " + isScary);
		System.out.println("This film is gory: " + isGory);
		System.out.println("This film has ghosts/ other supernatural themes: " + isSupernatural);
	}
	
	@Override
	public void is_recommended() {
		System.out.println("This film is recommended: " + isRecommended());
		System.out.println("OVERALL RATING OF " + getTitle() + ": " + getOverallRating());
		System.out.println("This film is NOT recommended for younger viewers: " + isNotForChildren);
	}
	
	public void subGenreType() {
		System.out.println("This film is also classified as: " + subgenre);
	}

	public boolean isGory() {
		return isGory;
	}

	public void setGory(boolean isGory) {
		this.isGory = isGory;
	}

	public boolean isSupernatural() {
		return isSupernatural;
	}

	public void setSupernatural(boolean isSupernatural) {
		this.isSupernatural = isSupernatural;
	}

	public boolean isNotForChildren() {
		return isNotForChildren;
	}

	public void setNotForChildren(boolean isNotForChildren) {
		this.isNotForChildren = isNotForChildren;
	}
	
	public boolean isScary() {
		return isScary;
	}

	public void setScary(boolean isScary) {
		this.isScary = isScary;
	}

	public String getSubgenre() {
		return subgenre;
	}

	public void setSubgenre(String subgenre) {
		this.subgenre = subgenre;
	}

	public HorrorFilms(String title, int runtime, String genre, boolean recommended, int overallRating, boolean isGory,
			boolean isSupernatural, boolean isNotForChildren, boolean isScary, String subgenre) {
		super(title, runtime, genre, recommended, overallRating);
		this.isGory = isGory;
		this.isSupernatural = isSupernatural;
		this.isNotForChildren = isNotForChildren;
		this.isScary = isScary;
		this.subgenre = subgenre;
	}
	
	
}
