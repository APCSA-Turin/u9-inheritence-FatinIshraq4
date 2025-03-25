public class VehicleRunner {
    public static void main(String[] args) {
      Vehicle myVehicle = new Vehicle("BB8123", 7.0, 3);
      Car myCar = new Car("MK4567", 6.75, 4, true);
      Truck myTruck = new Truck("TB12MX", 15.50, 2, 4, true);
      Taxi myTaxi = new Taxi("TX1412", 13.75, 4, true, 2.0);   
      myVehicle.stopForPassenger();
      myCar.stopForPassenger();
      myTruck.stopForPassenger();
      myTaxi.stopForPassenger();
    }
}