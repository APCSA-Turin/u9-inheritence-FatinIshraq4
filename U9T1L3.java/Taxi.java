public class Taxi extends Car{
    
    private double fareCollected;

    public Taxi (String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected=fareCollected;
    }

    public double getFareCollected() {return fareCollected;}

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount applied? " + isDiscountApplied());
        System.out.println("Total fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers()+numRiders);
        fareCollected+=numRiders*farePerRider;
        applyDiscount();
        if (isDiscountApplied()==false) {
            if (getPassengers()>=4) {
                setTollFee(getTollFee()/2);
                setDiscountApplied(true);
            }
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += farePerRider*(getPassengers()-1);
        return dropOffPassengers(getPassengers()-1);
    }

    @Override
    public void stopForPassenger() {
        System.out.println("Passenger dropped off");
    }
}
