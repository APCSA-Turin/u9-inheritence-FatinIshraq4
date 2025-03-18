public class Videogame extends AmazonProduct{

    private boolean openWorld;
    private boolean multiplayer;
    private boolean online;
    private String genre;

    public Videogame(String name, double price, int stock, int rating, String genre, boolean online, boolean multiplayer, boolean openWorld) {
        super(name, price, stock, rating);
        this.genre=genre;
        this.online=online;
        this.multiplayer=multiplayer;
        this.openWorld=openWorld;
    }

    public boolean getOpenWorld() {return openWorld;}
    public boolean getMultiplayer() {return multiplayer;}
    public boolean getOnline() {return online;}
    public String getGenre() {return genre;}


    
}
