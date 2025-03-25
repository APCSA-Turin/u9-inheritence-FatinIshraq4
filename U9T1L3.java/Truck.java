public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of axles: " + getAxles());
        System.out.println("Has trailer? " + hasTrailer());
    }

    public boolean validateLicensePlate() {
        if (hasTrailer==true) {
            if (axles>4) {
                return getLicensePlate().substring(getLicensePlate().length()-2).equals("MX");
            } else {
                return getLicensePlate().substring(getLicensePlate().length()-2).equals("LX");
            }
        }
        return true;
    }

    @Override
    public double calculateTollPrice() {
      double price = axles * getTollFee();
      if (hasTrailer==true) {return price*2;}
      else {return price;}
    }
  }