public class Movie extends AmazonProduct {
    
    private String genre;
    private int ageRating;

    public Movie(String name, double price, int stock, int rating, String genre, int ageRating) {
        super(name, price, stock, rating);
        this.genre=genre;
        this.ageRating=ageRating;
    }

    public String getGenre() {return genre;}

    public int getAgeRating() {return ageRating;}
}
