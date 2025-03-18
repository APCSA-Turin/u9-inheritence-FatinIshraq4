public class AmazonProduct {

    private double price;
    private int stock;
    private int rating;
    String name;

    public AmazonProduct(String name, double price, int stock, int rating) {
    this.name = name; this.price=price; this.stock=stock; this.rating=rating;
    }

    public double getPrice() {return price;}
    public int getStock() {if (stock<0) {return 0;} return stock;} 
    public int getRating() {return rating;}
    public String getName() {return name;}

    public void increaseStock(int num) {stock+=num;}
    public void decreaseStock(int num) {stock-=num;}

    public void increaseRating(int num) {rating+=num; if(rating+num>5) {rating=5;}}
    public void decreaseRating(int num) {rating-=num; if(rating-num<0) {rating=0;}}

}
