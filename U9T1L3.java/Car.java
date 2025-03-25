public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount applied? " + isDiscountApplied());
    }

    public boolean dropOffPassengers(int numOut) {
        int total = getPassengers();
        if (total>numOut) {setPassengers(total-numOut); return true;} 
        return false;
    }

    public void applyDiscount() {
        if (electric==true) {
            if (discountApplied==false) {
                double val = getTollFee();
                setTollFee(val/2);
                discountApplied=true;
            }
        }
    }

    public void setDiscountApplied(boolean disc) {discountApplied=disc;}

    @Override
    public double calculateTollPrice() {
      if (getPassengers()>4) {
        return getTollFee()*4;
      }
      return super.calculateTollPrice();
    }
  }