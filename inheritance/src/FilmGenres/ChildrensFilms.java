package FilmGenres;

public class ChildrensFilms extends Films{
	
	private boolean isAnimated;
	private String subgenre;
	private boolean isFamilyFilm;
	private int AgeRating;
	
	public void suitableForAllAges() {
		System.out.println("This film is suitable for all ages: " + isFamilyFilm);
	}

	public boolean isAnimated() {
		return isAnimated;
	}

	public void setAnimated(boolean isAnimated) {
		this.isAnimated = isAnimated;
	}

	public String getSubgenre() {
		return subgenre;
	}

	public void setSubgenre(String subgenre) {
		this.subgenre = subgenre;
	}

	public boolean isFamilyFilm() {
		return isFamilyFilm;
	}

	public void setFamilyFilm(boolean isFamilyFilm) {
		this.isFamilyFilm = isFamilyFilm;
	}

	public int getAgeRating() {
		return AgeRating;
	}

	public void setAgeRating(int ageRating) {
		AgeRating = ageRating;
	}

	public ChildrensFilms(String title, int runtime, String genre, boolean recommended, int overallRating,
			boolean isAnimated, String subgenre, boolean isFamilyFilm, int ageRating) {
		super(title, runtime, genre, recommended, overallRating);
		this.isAnimated = isAnimated;
		this.subgenre = subgenre;
		this.isFamilyFilm = isFamilyFilm;
		AgeRating = ageRating;
	}
	
	

}
