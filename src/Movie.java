public class Movie {

	String name;
	String director;
	int year;
	int length;

	
	public Movie( String name, String director, int year, int length  ) {
		
		
	}
	
	public String toString() {
		return "Movie";
	}
	
	public String getName() {
		return this.name;
			
		}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDirector() {
		return this.director;
		
	}
	
	public void setDirector( String director) {
		this.director = director;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public static Movie getInfo() {
		String name = "The Ultimate Computer";
		String director = "Mad Programmer";
		int year = 2018;
		int length = 30;
		
		return new Movie( name, director, year, length);
	}
	
public static void main(String[] args) {
		
		Movie movie = getInfo();
		
		System.out.println("Movie name: " + movie.name);
		System.out.println("Director name: " + movie.director);
		System.out.println("Production year: " + movie.year);
		System.out.println("Length: " + movie.length);
	}

}
