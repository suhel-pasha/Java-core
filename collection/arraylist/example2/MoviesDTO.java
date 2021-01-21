package collection.arraylist.example2;

public class MoviesDTO {
	
	String name;
	double ratings;
	double duration;
	String genre;
	public String getName() {
		return name;
	}
	public double getRatings() {
		return ratings;
	}
	public double getDuration() {
		return duration;
	}
	public String getGenre() {
		return genre;
	}
	public MoviesDTO(String name, double ratings, double duration, String genre) {
		super();
		this.name = name;
		this.ratings = ratings;
		this.duration = duration;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "MoviesDTO [name=" + name + ", ratings=" + ratings + ", duration=" + duration + ", genre=" + genre + "]";
	}
	
	
	

}
