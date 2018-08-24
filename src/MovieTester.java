
public class MovieTester {
	public static void main(String[] args) {

		//Movie Test 1
		Movie movie1 = new Movie("The Fate of the Furious","F. Gary Gray", 2017, 149);

		System.out.println("Movie name: " + movie1.getName());
		System.out.println("Director name: " + movie1.getDirector());
		System.out.println("Production year: " + movie1.getYear());
		System.out.println("Length: " + movie1.getLength());
		
		
		System.out.println();
		
		//Movie Test 2
		
		Movie movie2 = new Movie("Black Panther","Ryan Coogler", 2018, 135);

		System.out.println("Movie name: " + movie2.getName());
		System.out.println("Director name: " + movie2.getDirector());
		System.out.println("Production year: " + movie2.getYear());
		System.out.println("Length: " + movie2.getLength());
		
		
		System.out.println();
		
		//Movie Test 3
		Movie movie3 = new Movie("Forrest Gump","Robert Zemeckis", 1994, 142);

		System.out.println("Movie name: " + movie3.getName());
		System.out.println("Director name: " + movie3.getDirector());
		System.out.println("Production year: " + movie3.getYear());
		System.out.println("Length: " + movie3.getLength());
		
		
		System.out.println();
		
		//Movie Test 4
		Movie movie4 = new Movie("Friday","F. Gary Gray", 1995, 97);

		System.out.println("Movie name: " + movie4.getName());
		System.out.println("Director name: " + movie4.getDirector());
		System.out.println("Production year: " + movie4.getYear());
		System.out.println("Length: " + movie4.getLength());
		
		
		System.out.println();
		
		//Movie Test 5
		Movie movie5 = new Movie("Sing","Garth Jennings", 2016, 114);

		System.out.println("Movie name: " + movie5.getName());
		System.out.println("Director name: " + movie5.getDirector());
		System.out.println("Production year: " + movie5.getYear());
		System.out.println("Length: " + movie5.getLength());
		
		
		System.out.println();
		
		//Movie Test 6
		Movie movie6 = new Movie("Lorenzo's Oil","George Miller", 1992, 136);

		System.out.println("Movie name: " + movie6.getName());
		System.out.println("Director name: " + movie6.getDirector());
		System.out.println("Production year: " + movie6.getYear());
		System.out.println("Length: " + movie6.getLength());
		
		
		System.out.println();
		
		System.out.println("List of all movies: ");
		System.out.println();
		
		System.out.println("Movie 1: " + movie1);
		System.out.println("Movie 2: " +  movie2);
		System.out.println("Movie 3: " +  movie3);
		System.out.println("Movie 4: " +  movie4);
		System.out.println("Movie 5: " +  movie5);
		System.out.println("Movie 6: " +  movie6);
		
		
	}
}
