
public class MovieTester {
	public static void main(String[] args) {

		Movie movie = new Movie("Sky","Jessica", 1990, 60);

		System.out.println("Movie name: " + movie.getName());
		System.out.println("Director name: " + movie.getDirector());
		System.out.println("Production year: " + movie.getYear());
		System.out.println("Length: " + movie.getLength());
		
		System.out.println("Movie: " + movie);
	}
}
