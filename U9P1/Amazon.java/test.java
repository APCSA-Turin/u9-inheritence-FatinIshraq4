public class test {
    public static void main(String[] args) {
        AmazonProduct product1 = new AmazonProduct("Bike", 200, 2, 4);
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        product1.increaseRating(1);
        product1.decreaseRating(2);
        System.out.println(product1.getRating());
        product1.increaseStock(2);
        product1.decreaseStock(5);
        System.out.println(product1.getStock());

        Movie product2 = new Movie("Saw 2", 20, 50, 4, "Horror", 18);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        product2.increaseRating(1);
        product2.decreaseRating(2);
        System.out.println(product2.getRating());
        product2.increaseStock(7);
        product2.decreaseStock(5);
        System.out.println(product2.getStock());
        System.out.println(product2.getGenre());
        System.out.println(product2.getAgeRating());

        Videogame product3 = new Videogame("Minecraft", 29.99, 100, 5, "Adeventure", true, true, true);
        System.out.println(product3.getName());
        System.out.println(product3.getPrice());
        product3.increaseRating(1);
        product3.decreaseRating(2);
        System.out.println(product2.getRating());
        product3.increaseStock(7);
        product3.decreaseStock(5);
        System.out.println(product3.getStock());
        System.out.println(product3.getGenre());
        System.out.println("Online:" + product3.getOnline());
        System.out.println("Multiplayer:" + product3.getMultiplayer());
        System.out.println("OpenWorld:" + product3.getOpenWorld());

    }
}
