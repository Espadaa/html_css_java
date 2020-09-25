package vehiclethread;

public class VehicleThread {

    public static void main(String[] args) {
        Vehicle car = new Vehicle("truck");
        Vehicle truck = new Vehicle("car");
        Vehicle bus = new Vehicle("autobus");
        car.start();
        truck.start();
        bus.start();
    }
}
