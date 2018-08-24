public class Movie {

	private String name;
	private String director;
	private int year;
	private int length;

	
	public Movie( String name, String director, int year, int length  ) {
		this.name = name;
		this.director = director;
		this.year = year;
		this.length = length;
		
	}
	
	public String toString() {
		return name + " " + director + " " + year + " " + length + " mins " ;
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
	


}
