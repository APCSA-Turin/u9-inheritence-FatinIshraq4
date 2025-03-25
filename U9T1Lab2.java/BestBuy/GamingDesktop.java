package BestBuy;

public class GamingDesktop extends Desktop {

    private String graphics;

    public GamingDesktop(int screenSize, int memory, String graphicsCard) {
        super(screenSize, memory, true);
        this.graphics = graphicsCard;
    }

    public String getGraphicsCard() {
        return graphics;
    }

    public void updateDrivers() {
        System.out.println("graphics card drivers updated");
    }
}
