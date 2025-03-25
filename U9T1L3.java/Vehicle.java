public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }
  
    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public void setPassengers(int num) {
        passengers = num;
    }

    public void setTollFee(double num) {tollFee=num;}

    public void printInfo() {
      System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
    }

    public void stopForPassenger() {
      System.out.println("This vehicle does not stop for passengers");
    }
  }