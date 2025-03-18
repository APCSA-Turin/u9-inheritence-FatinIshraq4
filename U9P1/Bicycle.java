public class Bicycle extends Vehicle{

    private int gears;

    public Bicycle(String name, int wheels, int gears) {
        super(name, wheels);
        this.gears=gears;
    }

    public void ringBell() {
        System.out.println("Ring ring");
    }

    public int getGearCount() {return gears;}
    
}
