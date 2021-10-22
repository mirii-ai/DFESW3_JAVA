package FilmGenres;

public class filmRunner {
	public static void main(String[] args) {
		
//		private String title;
//		private int runtime;
//		private String genre;
//		private boolean recommended;
//		private int overallRating;
		
//		private boolean isGory;
//		private boolean isSupernatural;
//		private boolean isNotForChildren;
		//isScary
//		private String subgenre;
		
//		private boolean isAnimated;
//		private String subgenre;
//		private boolean isFamilyFilm;
//		private int AgeRating;
		
		HorrorFilms film1 = new HorrorFilms("SLASH FEST", 123, "Horror", true, 87, true, false, true, true, "Slasher");
		HorrorFilms film2 = new HorrorFilms("In The Forest", 101, "Horror", true, 89, true, true, true, true, "Thriller");
		Films film3 = new Films("Skyward", 95, "Action", true, 77);
		Films film4 = new Films("Hospital", 90, "Action", false, 21);
		HorrorFilms film5 = new HorrorFilms("FREAK NIGHT", 88, "Horror", false, 18, false, true, true, false,  "Supernatural");
		ChildrensFilms film6 = new ChildrensFilms("Dragon Adventures", 70, "Adventure", true, 66, true, "Fantasy", true, 6);
		ChildrensFilms film7 = new ChildrensFilms("Garden Playtime", 95, "Childrens", false, 30, false, "Adventure", false, 1);
		
		
		System.out.println(film1.getTitle() + ", RunTime: " + film1.getRuntime());
		film1.scaryOrNot();
		film1.is_recommended();
		film1.subGenreType();
		
		System.out.println();
		System.out.println();
		
		System.out.println(film2.getTitle() + ", RunTime: " + film2.getRuntime());
		film2.scaryOrNot();
		film2.is_recommended();
		film2.subGenreType();
		
		System.out.println();
		System.out.println();
		
		System.out.println(film5.getTitle() + ", RunTime: " + film2.getRuntime());
		film5.scaryOrNot();
		film5.is_recommended();
		film5.subGenreType();
		
		System.out.println();
		System.out.println();
		
		System.out.println(film3.getTitle() + ", RunTime: " + film3.getRuntime());
		film3.is_recommended();
	}

}
