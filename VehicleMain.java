import java.util.Scanner;

class Vehicle {
    public String startEngine() {
        return "Vehicle engine started";
    }
}

class Car extends Vehicle {
    @Override
    public String startEngine() {
        return "Car engine roars";
    }
}

class Motorcycle extends Vehicle {
    @Override
    public String startEngine() {
        return "Motorcycle engine revs";
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equalsIgnoreCase("Car")) {
                vehicles[i] = new Car();
            } else if (type.equalsIgnoreCase("Motorcycle")) {
                vehicles[i] = new Motorcycle();
            } else {
                vehicles[i] = new Vehicle();
            }
        }

        for (Vehicle v : vehicles) {
            System.out.println(v.startEngine());
        }

        sc.close();
    }
}